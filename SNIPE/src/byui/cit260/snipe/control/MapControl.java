/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Location;
import byui.cit260.snipe.model.Map;
import java.io.Serializable;

/**
 *
 * @author Maxwell
 */
public class MapControl implements Serializable {

    
    
    
    public static Map createMap(){
    Map map = new Map(9, 3);
    
    Scene[] scenes = createScene();
    
    
    
    return map;
    }

}
