/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

import java.io.Serializable;

/**
 *
 * @author Maxwell
 */
public enum CodeList implements Serializable {
    Code_USA("Why"),
    Code_Germany("is"),
    Code_England("6"),
    Code_Spain("afr"),
    Code_France("aid"),
    Code_Canada("of"),
    Code_Brazil("7"),
    Code_Austrailia("?"),
    Code_Russia("If you can't figure out this answer, please look it up on Goggle.");
    
    
    private final String description;
    
    CodeList(String description){
        this.description = description;
    }

      public String getDescription() {
        return description;
    }
    
    
    
}
