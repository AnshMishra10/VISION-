package com.example;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Path to the image
        String imagePath ="C:/Users/Vivek/Desktop/New folder (8)/15246731879217_polar-wiki.png";

        // Set TESSDATA_PREFIX environment variable directly in code
        System.setProperty("TESSDATA_PREFIX", "C:/Program Files/Tesseract-OCR/tessdata/");

        // Create Tesseract instance
        ITesseract tesseract = new Tesseract();

        // Set the Tesseract data path (this should point to the Tesseract directory)
        tesseract.setDatapath("C:/Program Files/Tesseract-OCR/tessdata");

        // Optional: Set language to English
        tesseract.setLanguage("eng");

        try {
            // Perform OCR on the image
            String extractedText = tesseract.doOCR(new File(imagePath));
            System.out.println("Extracted Text: ");
            System.out.println(extractedText);
        } catch (TesseractException e) {
            System.err.println("Error during text detection: " + e.getMessage());
        }
    }
}

