package me.kamesh.dto;

import lombok.Data;
import me.kamesh.validation.PdfFileConstraint;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class PdfFileDTO {
    @NotNull @NotEmpty
    String name;
    @NotNull @PdfFileConstraint
    MultipartFile file;
    String nameHash;
    String link;
}
