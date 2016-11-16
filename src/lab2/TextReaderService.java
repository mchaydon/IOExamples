/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mike
 */
public class TextReaderService {
    private File fileData;
    List<String> fileText = new ArrayList();

    public TextReaderService(String file) {
        this.fileData = new File("src" + File.separatorChar + file + ".txt");
    }
    
    public final void readFile(){
        BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(fileData));
	   String line = in.readLine();
	   while(line != null){
                fileText.add(line);
		line = in.readLine();
                
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Error reading file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                System.out.println("Error closing file");
            }
        } 
    }
    
    public final String getFileData(){
        String text = "";
        for (String s : fileText){
            text += (s + "\n");
        }
        return text;
    }
    
    
}
