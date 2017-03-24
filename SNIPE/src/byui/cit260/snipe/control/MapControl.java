/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import java.io.Serializable;
import byui.cit260.snipe.model.Map;

import byui.cit260.snipe.enums.SceneDescriptionsEnum;
import byui.cit260.snipe.exceptions.LocationException;
import byui.cit260.snipe.model.Player;

    /**
         *
         * @author Maxwell
         */

public class MapControl implements Serializable {

    public static Map createMap() {
        Map map = new Map(26);
        return map;
    }

    static void setStartingLocation(Map map, Player player) {
        player.setLocation(map.getLocations()[0]);
    }


    public void changeLocation(int row, int column, Player player) throws LocationException {
        if (row > 2 || column > 8 || row < 0 || column < 0){
            throw new LocationException("Cannot move to this location. This"
                    + "\nlocation is put of bounds.");
            }
        else {
            player.setRow(row);
            player.setColumn(column);
        }
        
    }
}
