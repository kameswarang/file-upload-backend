package me.kamesh.repository;

import me.kamesh.model.PdfFile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PdfFileRepository extends CrudRepository<PdfFile, String>  {
    List<PdfFile> findAll();
}
