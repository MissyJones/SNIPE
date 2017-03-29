/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.enums.ChallengeDescriptionEnum;

import byui.cit260.snipe.model.Challenge;
import byui.cit260.snipe.model.Player;
import java.util.Random;
import byui.cit260.snipe.exceptions.ChallengeControlException;
import byui.cit260.snipe.view.ChallengeView;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.SNIPE;

/**
 *
 * @author Missy
 */
public class ChallengeControl {

    
    public int calcArea(int length, int width) throws ChallengeControlException {
        
        if(length <= 0 || width <= 0 || length > 10 || width > 10) {
            throw new ChallengeControlException("Length or width out of bounds");
        }
        
        return length * width;
    }
    
    public boolean mathPuzzleThree(double height, double width, double answer) {
        double area = height * width;
        Boolean response;
        if (answer < 1) {
            response = false;
        } else if (area != answer) {
            response = false;
        } else {
            response = true;
        }
        return response;
    }

    public void mathPuzzleTwo(double radius, double height1, double answer1) throws ChallengeControlException {
        double volume = Math.PI * height1 * radius * radius;
        
        if (answer1 <= 0) {
            throw new ChallengeControlException("Pleae enter a positive, "
            +"\nrational number, silly!");
        } else if (volume != answer1) {
             throw new ChallengeControlException("Oops! You won't be getting "
                     + "\nthis code. Too bad for you!");            
        } else {
            System.out.println("A compartment opens and you carefully, "
                               +"\nexercising the utmost of caution, retrieve "
                               +"\nthe code. Be careful! It's a trap! Well, "
                               + "\nmaybe. It could be perfectly safe too.");
        }
}

    public String mathPuzzleOne(double number) {
        String answer;
        if (number == Math.sqrt(20857489)) {
            answer = "The door unlocks, enter at your own risk.";
        }else {
            answer = "Think again sucker!";
        }
        return answer;

    }

    public String dmgCalc(Challenge physChallenge, Player player) {
        Random rand = new Random();
        String reply;
        int damage;
        damage = (int) ((Math.ceil(rand.nextInt(29))) + 1);

        if (damage < 1) {
            reply = "ERROR '-1', you can't have negative damage.";
        } else if (damage > 30) {
            reply = "ERROR '+1', you can't do more than 30 points of damage.";
        } else {
            int currentHealth;
            currentHealth = player.getHealthPoints();
            int newHealth = currentHealth - damage;
            player.setHealthPoints(newHealth);
            if (newHealth < 1) {
                reply = "You died";
            } else {
                reply = physChallenge.getDescription() + newHealth + " points of health left.";
            }

        }
        return reply;
    }
    
    public Challenge[] createChallenges() {
        Challenge[] challenges = new Challenge[9];
        
        Challenge mentalOne = new Challenge();
        mentalOne.setDescription(ChallengeDescriptionEnum.mentalOne.getDescription());
        mentalOne.setUsedFlag(false);
        mentalOne.setCode(SNIPE.getCurrentGame().getCodes()[0]);
        challenges[0] = mentalOne;
        
        Challenge mentalTwo = new Challenge();
        mentalTwo.setDescription(ChallengeDescriptionEnum.mentalTwo.getDescription());
        mentalTwo.setUsedFlag(false);
        mentalTwo.setCode(SNIPE.getCurrentGame().getCodes()[1]);
        challenges[1] = mentalTwo;
        
        Challenge mentalThree = new Challenge();
        mentalThree.setDescription(ChallengeDescriptionEnum.mentalThree.getDescription());
        mentalThree.setUsedFlag(false);
        mentalThree.setCode(SNIPE.getCurrentGame().getCodes()[2]);
        challenges[2] = mentalThree;
        
        Challenge physOne = new Challenge();
        physOne.setDescription(ChallengeDescriptionEnum.physOne.getDescription());
        physOne.setUsedFlag(false);
        physOne.setCode(SNIPE.getCurrentGame().getCodes()[3]);
        challenges[3] = physOne;
        
        Challenge physTwo = new Challenge();
        physTwo.setDescription(ChallengeDescriptionEnum.physTwo.getDescription());
        physTwo.setUsedFlag(false);
        physTwo.setCode(SNIPE.getCurrentGame().getCodes()[4]);
        challenges[4] = physTwo;
        
        Challenge physThree = new Challenge();
        physThree.setDescription(ChallengeDescriptionEnum.physThree.getDescription());
        physThree.setUsedFlag(false);
        physThree.setCode(SNIPE.getCurrentGame().getCodes()[5]);
        challenges[5] = physThree;
        
        Challenge physFour = new Challenge();
        physFour.setDescription(ChallengeDescriptionEnum.physFour.getDescription());
        physFour.setUsedFlag(false);
        physFour.setCode(SNIPE.getCurrentGame().getCodes()[6]);
        challenges[6] = physFour;
        
        Challenge physFive = new Challenge();
        physFive.setDescription(ChallengeDescriptionEnum.physFive.getDescription());
        physFive.setUsedFlag(false);
        physFive.setCode(SNIPE.getCurrentGame().getCodes()[7]);
        challenges[7] = physFive;
        
        Challenge physSix = new Challenge();
        physSix.setDescription(ChallengeDescriptionEnum.physSix.getDescription());
        physSix.setUsedFlag(false);
        physSix.setCode(SNIPE.getCurrentGame().getCodes()[8]);
        challenges[8] = physSix;
        
        return challenges;
    }
    
    
    
    
    public void challengeEncounter(int location) {
        Challenge[] challengeList = SNIPE.getCurrentGame().getChallenges();
        
       
       if (location == 1) {
           String situation = challengeList[0].getDescription();
           ChallengeView challenge = new ChallengeView(situation, 1);
           challenge.display();
       } else if (location == 4) {
           String situation = challengeList[1].getDescription();
           ChallengeView challenge = new ChallengeView(situation, 2);
           challenge.display();
       } else if (location == 8) {
           String situation = challengeList[2].getDescription();
           ChallengeView challenge = new ChallengeView(situation, 3);
           challenge.display();
       } else if (location == 10) {
           String situation = challengeList[3].getDescription();
           ChallengeView challenge = new ChallengeView(situation, 4);
           challenge.display();
       } else if (location == 12) {
           String situation = challengeList[4].getDescription();
           ChallengeView challenge = new ChallengeView(situation, 4);
           challenge.display();
       } else if (location == 15) {
           String situation = challengeList[5].getDescription();
           ChallengeView challenge = new ChallengeView(situation, 4);
           challenge.display();
       } else if (location == 17) {
           String situation = challengeList[6].getDescription();
           ChallengeView challenge = new ChallengeView(situation, 4);
           challenge.display();
       } else if (location == 21) {
           String situation = challengeList[7].getDescription();
           ChallengeView challenge = new ChallengeView(situation, 4);
           challenge.display();
       } else if (location == 25) {
           String situation = challengeList[8].getDescription();
           ChallengeView challenge = new ChallengeView(situation, 4);
           challenge.display();
       } else {}
    }
  
}
