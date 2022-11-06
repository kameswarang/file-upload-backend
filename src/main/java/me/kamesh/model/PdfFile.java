package me.kamesh.model;

import lombok.Data;
import me.kamesh.dto.PdfFileDTO;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class PdfFile {
    @Id @NotNull
    String nameHash;
    @NotNull @NotEmpty
    String name;
    String link;

    public static PdfFile from(PdfFileDTO dto) {
        PdfFile pdfFile = new PdfFile();
        pdfFile.setName(dto.getName());
        pdfFile.setNameHash(dto.getNameHash());
        pdfFile.setLink(dto.getLink());
        return pdfFile;
    }
}
