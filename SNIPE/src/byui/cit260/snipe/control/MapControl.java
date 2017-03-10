/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Location;
import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author Maxwell
 */
public class MapControl implements Serializable {

    /**
     *
     * @return
     */
    private int noOfRows;
    private int noOfComlumns;
    private Location[][] locations;
    
    public static Map createMap(){
     Map map = null;
     
     System.out.println("\n***createMap() called***");
     return map;
   }

}
