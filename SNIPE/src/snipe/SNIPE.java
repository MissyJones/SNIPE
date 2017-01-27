/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snipe;

import byui.cit260.snipe.model.Game;
import byui.cit260.snipe.model.PhysChallenge;
import byui.cit260.snipe.model.MentalChallenge;
import byui.cit260.snipe.model.Player;
import byui.cit260.snipe.model.Character;
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
       
       Character characterOne = new Character();
       
       characterOne.setCodeName("Dark Phoenix");
       characterOne.setDescription("Veteran Player");
       
       PhysChallenge challengeOne = new PhysChallenge();
       
       challengeOne.setDescription("underwater hop scotch");
       challengeOne.setCountry(3);
       
       String descriptionInfo = challengeOne.toString();
       System.out.println(descriptionInfo); 

       MentalChallenge mentalOne = new MentalChallenge();
       
       mentalOne.setDescription("circle question");
       mentalOne.setReward(1);
       mentalOne.setChallengeID(1);
       mentalOne.setChallengeType("easy");
       
       Game gameOne = new Game();
       
       gameOne.setMoveCounter(3);
       gameOne.setNoCodes(2);
       
       String moveInfo = gameOne.toString();
       System.out.println(moveInfo);
       
    }
    
}
