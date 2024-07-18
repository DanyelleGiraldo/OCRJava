package com.ocr.ocr;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileSelector {

    public static void main(String[] args) {
        JFrame frame = new JFrame("File Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        Container container = frame.getContentPane();
        container.setLayout(new GridBagLayout());

        JButton button = new JButton("Select File and Upload");
        button.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                OcrClient client = new OcrClient();
                try {
                    String response = client.uploadFile(selectedFile);
                    System.out.println("Response from API: " + response);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        container.add(button);
        frame.setVisible(true);
    }
}
