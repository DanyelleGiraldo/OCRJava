package com.ocr.ocr;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class TesseractController {

    @Autowired
    private TesseractService tesseractService;

    @PostMapping("/ocr")
    public String recognizedText(@RequestParam MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();

        if ("pdf".equals(fileExtension)) {
            return tesseractService.recognizedTextFromPdf(file.getInputStream());
        } else if (fileExtension.matches("png|jpg|jpeg|gif|bmp")) {
            return tesseractService.recognizedText(file.getInputStream());
        } else {
            return "Unsupported file type";
        }
    }
}
