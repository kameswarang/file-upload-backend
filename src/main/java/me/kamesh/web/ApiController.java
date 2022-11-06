package me.kamesh.web;

import me.kamesh.model.PdfFile;
import me.kamesh.service.PdfFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final PdfFileService service;

    public ApiController(@Autowired PdfFileService service) {
        this.service = service;
    }

    @GetMapping("/getAllFiles")
    public ResponseEntity<List<PdfFile>> getAllFiles() {
        return new ResponseEntity<>(service.getAllFiles(), HttpStatus.OK);
    }
}
