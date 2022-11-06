package me.kamesh.service;

import me.kamesh.dto.PdfFileDTO;
import me.kamesh.model.PdfFile;
import me.kamesh.repository.PdfFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.List;
import java.util.logging.Logger;

import static java.lang.String.format;
import static java.util.logging.Level.*;
import static me.kamesh.utils.Constants.CHECKSUM_ALGORITHM;
import static me.kamesh.utils.Constants.HASH_LENGTH;

@Service
public class PdfFileService {
    private static final Logger LOG = Logger.getLogger(PdfFileService.class.getName());
    private PdfFileRepository repository;

    public PdfFileService(@Autowired PdfFileRepository repository) {
        this.repository = repository;
    }

    public List<PdfFile> getAllFiles() {
        return repository.findAll();
    }

    public boolean saveFile(PdfFileDTO dto) {
        try {
            String checksum = getChecksum(dto.getFile().getBytes());
            dto.setNameHash(dto.getName() + "-" + checksum.substring(0, HASH_LENGTH));

        } catch (NoSuchAlgorithmException | IOException e) {
            LOG.log(WARNING, "Failed to create checksum for give PDF. Cannot save without checksum.");
            LOG.log(WARNING, e.getMessage());
            return false;
        }

//        try {
//            writeToLocal(dto);
//        } catch (IOException e) {
//            LOG.log(WARNING, "Could not write PDF to local");
//            LOG.log(WARNING, e.getMessage());
//        }

        try {
            dto.setLink(uploadToCloud(dto.getFile().getBytes()));
        } catch (IOException e) {
            LOG.log(WARNING, "Could not get file contents to upload");
            LOG.log(WARNING, e.getMessage());
        }

        persistToDatabase(PdfFile.from(dto));
        return true;
    }

    private String getChecksum(byte[] input) throws NoSuchAlgorithmException, IOException {
        MessageDigest md = MessageDigest.getInstance(CHECKSUM_ALGORITHM);
        try(InputStream is = new ByteArrayInputStream(input);
            DigestInputStream dis = new DigestInputStream(is, md)) {
            int read;
            do {
                read = dis.read();
            } while(read != -1);
        }
        return Base64.getMimeEncoder()
                .encodeToString(md.digest());
    }

    private void writeToLocal(PdfFileDTO dto) throws IOException {
        Path p = Path.of(format("your_path_here\\%s.pdf", dto.getName()));
        Files.deleteIfExists(p);
        Files.createFile(p);
        Files.write(p, dto.getFile().getBytes());
    }
    private String uploadToCloud(byte[] file) {
        return "https://linin";
    }

    private void persistToDatabase(PdfFile file) {
        repository.save(file);
    }

}
