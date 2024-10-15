package com.ocr.ocr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FacturaParser {
    public void processOcrText(String text) {
        extractAndPrint("ID", Pattern.compile("(\\d{8,})"), text);
        extractAndPrint("Fecha", Pattern.compile("(\\d{2}/\\d{2}/\\d{4})"), text);
        extractAndPrint("Detalle", Pattern.compile("([A-Z]+\\s+[A-Z]+\\s+[A-Z]+)"), text);
        extractAndPrint("Cuenta", Pattern.compile("([0-9]{8,})"), text);
        extractAndPrint("CC/Act", Pattern.compile("([A-Z]+\\s+[A-Z]+)"), text);
        extractAndPrint("Valor Base", Pattern.compile("\\$([\\d,]+(?:\\.\\d{2})?)"), text);
        extractAndPrint("Tercero", Pattern.compile("([A-Z]+\\s+[A-Z]+)"), text);
        extractAndPrint("Débito", Pattern.compile("Débito\\s+\\$([\\d,]+(?:\\.\\d{2})?)"), text);
        extractAndPrint("Crédito", Pattern.compile("Crédito\\s+\\$([\\d,]+(?:\\.\\d{2})?)"), text);
        extractAndPrint("Total", Pattern.compile("TOTALES\\s+\\$([\\d.,]+)"), text);
    }

    public void extractAndPrint(String label, Pattern pattern, String text) {
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(label + ": " + matcher.group());
        }
    }
}