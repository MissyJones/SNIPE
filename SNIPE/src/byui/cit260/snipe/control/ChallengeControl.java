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
import byui.cit260.snipe.view.GameOverLoseView;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.SNIPE;

/**
 *
 * @author Missy
 */
public class ChallengeControl {

    private boolean response;

    public int calcArea(int length, int width) throws ChallengeControlException {

        if (length <= 0 || width <= 0 || length > 10 || width > 10) {
            throw new ChallengeControlException("Length or width out of bounds");
        }

        return length * width;
    }

    public static boolean mathPuzzleThree(double answer) throws ChallengeControlException {
        double area = 24*16;
        Boolean response = false;
        if (answer == area) {
            response = true;
        } else if (area != answer) {
            response = false;
        }
        return response;
    }

    public static boolean mathPuzzleTwo(double answer1) throws ChallengeControlException {
        double volume = Math.PI*24*8*8;
	//this is the correct answer 4825.49
	//String answer1 = null;
        boolean check = false;
        try {
                if (answer1 == Math.PI*24*8*8) {
                    check = true;
                } else if (volume != answer1) {
                    check = false;
                } else {
                    throw new ChallengeControlException();          
                }
        } catch (ChallengeControlException ex) {
            Logger.getLogger(ChallengeControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }  

    public static boolean mathPuzzleOne(double number) throws ChallengeControlException {
        String answer = null;
        boolean check = false;
        try {
            if (number == Math.sqrt(20857489)) {
                answer = "The door unlocks, enter at your own risk.";
                check = true;

            } else if (number != Math.sqrt(20857489)) {
                answer = "Think again sucker!";
            } else {

                throw new ChallengeControlException();

            }
        } catch (ChallengeControlException ex) {
            Logger.getLogger(ChallengeControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }

    public String dmgCalc(Challenge physChallenge, Player player) throws ChallengeControlException{
        Random rand = new Random();
        String reply;
        int damage;
        damage = (int) ((Math.ceil(rand.nextInt(29))) + 1);
        GameOverLoseView gameOver = new GameOverLoseView();

        if (damage < 1) {
            throw new ChallengeControlException("You can't do negative damage");
        } else if (damage > 30) {
            damage = 15;
            int currentHealth = player.getHealthPoints();
            int newHealth = currentHealth - damage;
            player.setHealthPoints(newHealth);
            if (newHealth < 1) {
                reply = "You died";
                gameOver.display();
            } else {
                reply = physChallenge.getDescription() +"You have " + newHealth + " points of health left.";
            }

        } else {
            int currentHealth;
            currentHealth = player.getHealthPoints();
            int newHealth = currentHealth - damage;
            player.setHealthPoints(newHealth);
            if (newHealth < 1) {
                reply = "You died";
                gameOver.display();
            } else {
                reply = physChallenge.getDescription() +"You have " + newHealth + " points of health left.";
            }

        }
        return reply;
    }

    

    public static void challengeEncounter(int location) {
        Challenge[] challengeList = SNIPE.getCurrentGame().getChallenges();
        
       
       if (location == 1) {
           Challenge event = challengeList[3];
           boolean flag = event.isUsedFlag();
           String situation = event.getDescription();
           if (flag != true) {
           ChallengeView challenge = new ChallengeView(situation, 4, event);
           challenge.display();
           }else {
           }
       } else if (location == 4) {
           Challenge event = challengeList[4];
           boolean flag = event.isUsedFlag();
           String situation = event.getDescription();
           if (flag = false) {
           ChallengeView challenge = new ChallengeView(situation, 4, event);
           challenge.display();
           }else {
           }
       } else if (location == 8) {
           Challenge event = challengeList[5];
           boolean flag = event.isUsedFlag();
           String situation = event.getDescription();
           if (flag = false) {
           ChallengeView challenge = new ChallengeView(situation, 4, event);
           challenge.display();
           }else {
           }
       } else if (location == 10) {
           Challenge event = challengeList[6];
           boolean flag = event.isUsedFlag();
           String situation = event.getDescription();
           if (flag = false) {
           ChallengeView challenge = new ChallengeView(situation, 4, event);
           challenge.display();
           }else {
           }
       } else if (location == 14) {
           Challenge event = challengeList[2];
           boolean flag = event.isUsedFlag();
           String situation = event.getDescription();
           if (flag = false) {
           ChallengeView challenge = new ChallengeView(situation, 3, event);
           challenge.display();
           }else {
           }
       } else if (location == 15) {
           Challenge event = challengeList[8];
           boolean flag = event.isUsedFlag();
           String situation = event.getDescription();
           if (flag = false) {
           ChallengeView challenge = new ChallengeView(situation, 4, event);
           challenge.display();
           }else {
           }
       } else if (location == 17) {
           Challenge event = challengeList[0];
           boolean flag = event.isUsedFlag();
           String situation = event.getDescription();
           if (flag = false) {
           ChallengeView challenge = new ChallengeView(situation, 1, event);
           challenge.display();
           }else {
           }
       } else if (location == 21) {
           Challenge event = challengeList[7];
           boolean flag = event.isUsedFlag();
           String situation = event.getDescription();
           if (flag = false) {
           ChallengeView challenge = new ChallengeView(situation, 4, event);
           challenge.display();
           }else {
           }
       } else if (location == 25) {
           Challenge event = challengeList[1];
           boolean flag = event.isUsedFlag();
           String situation = event.getDescription();
           if (flag = false) {
           ChallengeView challenge = new ChallengeView(situation, 2, event);
           challenge.display();
           }else {
           }
       } else {}
    }
}
