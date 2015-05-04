/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author JGZHANG
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Wire> wires = new ArrayList<>();
        List<Gate> gates = new ArrayList<>();
        
        String filepath = System.getProperty("user.dir") + "/src/resources/input_netlist.txt";
                
        List<String> netlist = Util.getLinesFromFile(filepath);
                        
        for(String line: netlist) {
            //System.out.println(line);
            
            String[] tokens = line.split("\\(|\\)");
            
            String gate_type = tokens[0];
            
            String[] all_wires = tokens[1].split(",");
                        
            String output_wire = all_wires[0];
            
            List<String> input_wires = new ArrayList<String>();
            
            for(int i=1; i<all_wires.length; ++i) {
                String wire_name = all_wires[i].trim();
                input_wires.add(wire_name);
            }
        
            
            System.out.println(gate_type + " " + output_wire + " " + input_wires.toString());
        
        }
        
    }
    
}
