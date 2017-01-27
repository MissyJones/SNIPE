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
import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Item;
import byui.cit260.snipe.model.Location;
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
       
       String CodeNameInfo = characterOne.toString();
       System.out.println(CodeNameInfo);
       
       String CharacterInfo = characterOne.toString();
       System.out.println(CharacterInfo);
       
       PhysChallenge challengeOne = new PhysChallenge();
       
       challengeOne.setDescription("underwater hop scotch");
       challengeOne.setCountry(3);
       
       String descriptionInfo = challengeOne.toString();
       System.out.println(descriptionInfo); 
       
       MentalChallenge mentalChallengeOne = new MentalChallenge();
       
       mentalChallengeOne.setDescription("Circle Puzzle");
       mentalChallengeOne.setReward(1);
       mentalChallengeOne.setChallengeID(2);
       mentalChallengeOne.setChallengType("easy");
       
       String DescriptionInfo = mentalChallengeOne.toString();
       System.out.println(DescriptionInfo);
       
       String challengeTypeInfo = mentalChallengeOne.toString();
       System.out.println(challengeTypeInfo);
       
       Game gameOne = new Game();
       
       gameOne.setMoveCounter(3);
       gameOne.setNoCodes(2);
       
       String moveInfo = gameOne.toString();
       System.out.println(moveInfo);
       
       Country russia = new Country();
       russia.setCountryID(001);
       russia.setName("The Motherland");
       russia.setVisited(0);
       
       String countryInfo = russia.toString();
       System.out.println(countryInfo);
       
       Location stgrad = new Location();
       stgrad.setChallengeType("Endurance");
       stgrad.setDescription("Freaking cold");
       stgrad.setPassportAdd(1);
       stgrad.setPlaceID(0);
       stgrad.setPuzzleTrigger(1);
       stgrad.setName("Stalingrad");
       
       String locaInfo = stgrad.toString();
       System.out.println(locaInfo);
       
       Item painting = new Item();
       painting.setItemDescription("A spooky painting");
       painting.setItemType("Key_Item");
       painting.setItemIDNumber(15);
       
       String itemInfo = painting.toString();
       System.out.println(itemInfo);
       
       
       
    }
    
}
