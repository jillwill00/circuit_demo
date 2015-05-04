/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.List;

/**
 *
 * @author JGZHANG
 */
public class Circuit {
    
    public Circuit() { //default constructor
        
    }
    
    public Circuit(List<Gate> gates, List<Wire> wires) {
        
    }
    
    
    public void set_wires(List<Wire> w) {
        this.wires = w;
    }
    
    public List<Wire> get_wires() {
        return this.wires;
    }
    
    
    
    private List<Wire> wires;
    private List<Gate> gates; 
    
    
   
}
