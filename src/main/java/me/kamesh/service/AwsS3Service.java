package me.kamesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.GetUrlRequest;
import software.amazon.awssdk.services.s3.model.ObjectCannedACL;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import static me.kamesh.utils.Constants.MIME_PDF;

@Service
public class AwsS3Service {
    private final S3Client s3Client;
    private final String bucket;

    public AwsS3Service(@Autowired S3Client s3Client, @Value("${aws.bucket}") String bucket) {
        this.s3Client = s3Client;
        this.bucket = bucket;
    }

    public String uploadToBucket(String key, byte[] contents) {
        s3Client.putObject(PutObjectRequest.builder()
                    .bucket(bucket)
                    .key(key)
                    .contentType(MIME_PDF)
                    .acl(ObjectCannedACL.PUBLIC_READ).build(),
                RequestBody.fromBytes(contents));

        return s3Client.utilities()
                .getUrl(GetUrlRequest.builder()
                    .bucket(bucket)
                    .key(key).build())
                .toExternalForm();
    }
}
