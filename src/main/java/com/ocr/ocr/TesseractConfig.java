package com.ocr.ocr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.sourceforge.tess4j.Tesseract;

@Configuration
public class TesseractConfig {

    @Bean
    Tesseract tesseract() {
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("src\\main\\resources\\tessdata_best");
        tesseract.setLanguage("spa");
        return tesseract;
    }

}
