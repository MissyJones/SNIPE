/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snipe;

import byui.cit260.snipe.model.Player;

/**
 *
 * @author Maxwell
 */
public class SNIPE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setName("George Weasley");
       playerOne.setNumberOfMoves(0);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);
    }
    
}
