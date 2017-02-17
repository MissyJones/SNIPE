/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Player;
import snipe.SNIPE;

/**
 *
 * @author Maxwell
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        if (playersName == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(playersName);
        SNIPE.setPlayer(player);
        return player;
    }
    
}
