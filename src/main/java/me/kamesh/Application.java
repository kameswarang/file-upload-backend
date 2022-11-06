package me.kamesh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

import java.util.logging.Logger;

import static java.util.logging.Level.FINE;
import static java.util.logging.Logger.getLogger;

@SpringBootApplication
public class Application {
    private static final Logger LOG = getLogger(Application.class.getName());
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        LOG.log(FINE, "{}", context);
    }

    @Bean
    public S3Client s3Client(@Value("${aws.region}") String region) {
        return S3Client.builder().region(Region.of(region)).build();
    }
}
