/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;



/**
 *
 * @author JGZHANG
 */
import java.util.List;


public class Gate {
    
    public Gate() {  //default constructor
    }
    
    public Gate(Integer i, String n) {
        index = i;
        name  = n;
    }
    
    
    public Integer get_index() {
        return this.index;
    }
    public void set_index(Integer i) {
        this.index = i;
    }
  
   private Integer index;
   private String name; 
   private String type;
   private List<Wire> fanin; 
   private List<Wire> fanout; 
   
}
