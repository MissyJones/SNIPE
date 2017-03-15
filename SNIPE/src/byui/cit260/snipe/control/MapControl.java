/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import java.io.Serializable;
import byui.cit260.snipe.model.Map;
import byui.cit260.snipe.model.Scene;
import byui.cit260.snipe.enums.SceneDescriptionsEnum;
    /**
         *
         * @author Maxwell
         */

public class MapControl implements Serializable {

    public static Map createMap() {
        Map map = new Map(9, 3);

        Scene[] scenes = createScene();

        return map;
    }

    static void setStartingLocation(Map map) {
        System.out.println("Trying so hard. But not yet setting player loaction");
    }

    private static Scene[] createScene() {
        Scene[] scenes = new Scene[SceneDescriptionsEnum.values().length];
        return scenes;
    }

}
