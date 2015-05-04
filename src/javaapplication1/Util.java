/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JGZHANG
 */
public class Util {
    
    
    public static List<String> getLinesFromFile(String filename) {
        
        List<String> file_lines = new ArrayList<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(new File(filename)))) {
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                if(line.length() > 0) {
                    file_lines.add(line);
                }
            }
            String everything = sb.toString();
        }
        catch(Exception e) {
            
        }
        
        return file_lines;
    }
    
}
