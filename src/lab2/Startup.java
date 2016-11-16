/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mike
 */
public class Startup {
    public static void main(String[] args) {
        TextReaderService textReaderService = new TextReaderService("contactList");
        textReaderService.readFile();
        
        System.out.println(textReaderService.getFileData());
        
        TextWriterService textWriterService;
        try {
            textWriterService = new TextWriterService("contactList", true);
            textWriterService.writeFile("Test User");
            textWriterService.writeFile("123 Fake St");
            textWriterService.writeFile("Waukesha, Wisconsin 53186");
            textWriterService.closeFile();
        } catch (IOException ex) {
            Logger.getLogger(Startup.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        textReaderService.readFile();
        
        System.out.println(textReaderService.getFileData());
    }
}
