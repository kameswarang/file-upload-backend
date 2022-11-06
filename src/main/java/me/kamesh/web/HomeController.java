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
import java.util.List;
import java.util.logging.Logger;

import static java.util.logging.Level.*;

@Controller
@RequestMapping("/home")
public class HomeController {
    private static final Logger LOG = Logger.getLogger(HomeController.class.getName());

    private final PdfFileService fileService;

    public HomeController(@Autowired PdfFileService service) {
        this.fileService = service;
    }

    @GetMapping
    public String get(Model model) {
        model.addAttribute("pdfFiles", getAllFiles());
        model.addAttribute("pdfFileDto", new PdfFileDTO());
        return "home";
    }

    @PostMapping
    public String post(@Valid @ModelAttribute("pdfFileDto") PdfFileDTO pdfFileDto, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("pdfFiles", getAllFiles());
            return "home";
        }

        if(fileService.saveFile(pdfFileDto)) {
            LOG.log(INFO, "Saved PDF file received with name: {0}", pdfFileDto.getName());
        }
        else {
            LOG.log(SEVERE, "Failed to save PDF file with name: {0}", pdfFileDto.getName());
            return "redirect:/home?errors";
        }
        return "redirect:/home";
    }

    private List<PdfFile> getAllFiles() {
        return fileService.getAllFiles();
    }
}
