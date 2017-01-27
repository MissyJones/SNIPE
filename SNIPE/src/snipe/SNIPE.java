/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snipe;

import byui.cit260.snipe.model.Game;
import byui.cit260.snipe.model.PhysChallenge;
import byui.cit260.snipe.model.Player;
/**
 *
 * @author Maxwell, Missy
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
       
       PhysChallenge challengeOne = new PhysChallenge();
       
       challengeOne.setDescription("underwater hop scotch");
       challengeOne.setCountry(3);
       
       String descriptionInfo = challengeOne.toString();
       System.out.println(descriptionInfo);        
       
       Game gameOne = new Game();
       
       gameOne.setMoveCounter(3);
       gameOne.setNoCodes(2);
       
       String moveInfo = gameOne.toString();
       System.out.println(moveInfo);
       
    }
    
}
