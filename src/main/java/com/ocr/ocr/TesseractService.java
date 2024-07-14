package com.ocr.ocr;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sourceforge.tess4j.Tesseract;

@Service
public class TesseractService {
    @Autowired
    private Tesseract tesseract;

    public String recognizedText(InputStream inputStream) throws IOException {
        BufferedImage image = ImageIO.read(inputStream);
        try {
            return tesseract.doOCR(image);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "failed";
    }

    public String recognizedTextFromPdf(InputStream inputStream) throws IOException {
        PDDocument document = PDDocument.load(inputStream);
        PDFRenderer pdfRenderer = new PDFRenderer(document);
        StringBuilder result = new StringBuilder();

        for (int page = 0; page < document.getNumberOfPages(); page++) {
            BufferedImage image = pdfRenderer.renderImageWithDPI(page, 300);
            try {
                result.append(tesseract.doOCR(image));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        document.close();
        return result.toString();
    }
}
