/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Mike
 */
public class TextWriterService {
    private File fileData;
    private PrintWriter out;
    
    public TextWriterService(String file, boolean append) throws IOException {
        this.fileData = new File("src" + File.separatorChar + file + ".txt");
        out = new PrintWriter(new BufferedWriter(new FileWriter(fileData, append)));
    }
    
    public final void writeFile(String data){
        out.println(data);
    }
    
    public final void closeFile(){
        out.close();
    }
}
