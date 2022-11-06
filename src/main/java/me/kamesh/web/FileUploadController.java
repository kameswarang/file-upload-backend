package me.kamesh.web;

import me.kamesh.dto.PdfFileDTO;
import me.kamesh.model.PdfFile;
import me.kamesh.service.PdfFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.logging.Logger;

import static java.util.logging.Level.INFO;
import static java.util.logging.Level.SEVERE;

@Controller
@RequestMapping("/home")
public class FileUploadController {
    private static final Logger LOG = Logger.getLogger(FileUploadController.class.getName());

    private final PdfFileService fileService;

    public FileUploadController(@Autowired PdfFileService service) {
        this.fileService = service;
    }

    @GetMapping
    public String get(Model model) {
        List<PdfFile> files = fileService.getAllFiles();

        model.addAttribute("pdfFiles", getAllFiles());
        model.addAttribute("pdfFileDto", new PdfFileDTO());
        return "home";
    }

    @PostMapping
    public String post(@Valid @ModelAttribute("pdfFileDto") PdfFileDTO pdfFileDto, Errors errors, Model model) throws Exception {
        if (errors.hasErrors()) {
            model.addAttribute("pdfFiles", getAllFiles());
            return "home";
        }

        try {
            fileService.saveFile(pdfFileDto);
            LOG.log(INFO, "Saved PDF file received with name: {0}", pdfFileDto.getName());
        } catch (IOException | NoSuchAlgorithmException e) {
            LOG.log(SEVERE, e.getMessage());
            e.printStackTrace();
            LOG.log(SEVERE, "Failed to save file received with name: {0}", pdfFileDto.getName());
        }
        return this.get(model);
    }

    private List<PdfFile> getAllFiles() {
        return fileService.getAllFiles();
    }
}
