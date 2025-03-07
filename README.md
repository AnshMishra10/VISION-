# VISION- OCR Image-to-Text Converter using Tesseract in Java

Description

This Java project utilizes the Tesseract OCR library to extract text from an image. The program reads an image file, processes it using Tesseract, and outputs the extracted text to the console.

Features

Uses Tesseract OCR for text extraction

Reads images from a specified file path

Supports English language OCR

Configures Tesseract data path dynamically

Prerequisites

Ensure you have the following installed:

Java Development Kit (JDK) - Version 8 or higher

Tesseract-OCR - Install from Tesseract GitHub or official site

Tess4J Library - A Java wrapper for Tesseract OCR

Installation & Setup

1. Install Tesseract-OCR

Download and install Tesseract from the official site.

Ensure the tessdata folder is correctly located (e.g., C:/Program Files/Tesseract-OCR/tessdata/).

2. Add Tess4J Library to Your Project

Download Tess4J from SourceForge.

Add the JAR files to your Java project's classpath.

Usage

1. Update Image Path

Modify the imagePath variable in Main.java to point to the image you want to process:

String imagePath = "C:/path/to/your/image.png";

2. Run the Program

Compile and execute the Java program:

javac Main.java
java Main

3. Output

The extracted text from the image will be displayed in the console.

Troubleshooting

Error: "Could not find Tesseract"

Ensure Tesseract is installed and the path is correctly set in the code.

Error: "Image not found"

Verify that the image path is correct and the file exists.

Error: "Unsupported Image Format"

Convert the image to a standard format like PNG or JPG.

License

This project is licensed under the MIT License.
