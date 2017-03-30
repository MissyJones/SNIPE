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

    public int calcArea(int length, int width) throws ChallengeControlException {

        if (length <= 0 || width <= 0 || length > 10 || width > 10) {
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

    public double mathPuzzleTwo(double radius, double radius2, double height1) throws ChallengeControlException {
        double answer1 = Math.PI * height1 * radius * radius2;//4825.49

        if (answer1 <= 0) {
            throw new ChallengeControlException("Aw come on! Pleae enter a "
                    + "\npositive, rational number, you fool!");
            //} else //(volume != answer1) {
            //   throw new ChallengeControlException("Oops! You won't be getting "
            //           + "\nthis code you fool! Too bad for you!");            
            //else {
            // System.out.println("A compartment opens and you carefully, "
            //                    +"\nexercising the utmost of caution, retrieve "
            //                    +"\nthe code. Be careful! It's a trap! Well, "
            //                   + "\nmaybe. It could be perfectly safe too.");
        }
        return Math.PI * height1 * radius * radius;
    }

    public String mathPuzzleOne(double number) throws ChallengeControlException {
        String answer = null;
        try {
            if (number == Math.sqrt(20857489)) {
                answer = "The door unlocks, enter at your own risk.";

            } else if (number != Math.sqrt(20857489)) {
                answer = "Think again sucker!";
            } else {

                throw new ChallengeControlException();

            }
        } catch (ChallengeControlException ex) {
            Logger.getLogger(ChallengeControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;
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

    public Challenge[] createChallenges() {
        Challenge[] challenges = new Challenge[9];

        Challenge mentalOne = new Challenge();
        mentalOne.setDescription(ChallengeDescriptionEnum.mentalOne.getDescription());
        mentalOne.setChoiceOne(null);
        mentalOne.setChoiceTwo(null);
        mentalOne.setUsedFlag(false);
        mentalOne.setCode(SNIPE.getCurrentGame().getCodes()[0]);
        challenges[0] = mentalOne;

        Challenge mentalTwo = new Challenge();
        mentalTwo.setDescription(ChallengeDescriptionEnum.mentalTwo.getDescription());
        mentalTwo.setChoiceOne(null);
        mentalTwo.setChoiceTwo(null);
        mentalTwo.setUsedFlag(false);
        mentalTwo.setCode(SNIPE.getCurrentGame().getCodes()[1]);
        challenges[1] = mentalTwo;

        Challenge mentalThree = new Challenge();
        mentalThree.setDescription(ChallengeDescriptionEnum.mentalThree.getDescription());
        mentalThree.setChoiceOne(null);
        mentalThree.setChoiceTwo(null);
        mentalThree.setUsedFlag(false);
        mentalThree.setCode(SNIPE.getCurrentGame().getCodes()[2]);
        challenges[2] = mentalThree;

        Challenge physOne = new Challenge();
        physOne.setDescription(ChallengeDescriptionEnum.physOne.getDescription());
        physOne.setChoiceOne(ChallengeDescriptionEnum.physOneOptionOne.getDescription());
        physOne.setChoiceTwo(ChallengeDescriptionEnum.physOneOptionTwo.getDescription());
        physOne.setUsedFlag(false);
        physOne.setCode(SNIPE.getCurrentGame().getCodes()[3]);
        challenges[3] = physOne;

        Challenge physTwo = new Challenge();
        physTwo.setDescription(ChallengeDescriptionEnum.physTwo.getDescription());
        physTwo.setChoiceOne(ChallengeDescriptionEnum.physTwoOptionOne.getDescription());
        physTwo.setChoiceTwo(ChallengeDescriptionEnum.physTwoOptionTwo.getDescription());
        physTwo.setUsedFlag(false);
        physTwo.setCode(SNIPE.getCurrentGame().getCodes()[4]);
        challenges[4] = physTwo;

        Challenge physThree = new Challenge();
        physThree.setDescription(ChallengeDescriptionEnum.physThree.getDescription());
        physThree.setChoiceOne(ChallengeDescriptionEnum.physThreeOptionOne.getDescription());
        physThree.setChoiceTwo(ChallengeDescriptionEnum.physThreeOptionTwo.getDescription());
        physThree.setUsedFlag(false);
        physThree.setCode(SNIPE.getCurrentGame().getCodes()[5]);
        challenges[5] = physThree;

        Challenge physFour = new Challenge();
        physFour.setDescription(ChallengeDescriptionEnum.physFour.getDescription());
        physFour.setChoiceOne(ChallengeDescriptionEnum.physFourOptionOne.getDescription());
        physFour.setChoiceTwo(ChallengeDescriptionEnum.physFourOptionTwo.getDescription());
        physFour.setUsedFlag(false);
        physFour.setCode(SNIPE.getCurrentGame().getCodes()[6]);
        challenges[6] = physFour;

        Challenge physFive = new Challenge();
        physFive.setDescription(ChallengeDescriptionEnum.physFive.getDescription());
        physFive.setChoiceOne(ChallengeDescriptionEnum.physFiveOptionOne.getDescription());
        physFive.setChoiceTwo(ChallengeDescriptionEnum.physFiveOptionTwo.getDescription());
        physFive.setUsedFlag(false);
        physFive.setCode(SNIPE.getCurrentGame().getCodes()[7]);
        challenges[7] = physFive;

        Challenge physSix = new Challenge();
        physSix.setDescription(ChallengeDescriptionEnum.physSix.getDescription());
        physSix.setChoiceOne(ChallengeDescriptionEnum.physSixOptionOne.getDescription());
        physSix.setChoiceTwo(ChallengeDescriptionEnum.physSixOptionTwo.getDescription());
        physSix.setUsedFlag(false);
        physSix.setCode(SNIPE.getCurrentGame().getCodes()[8]);
        challenges[8] = physSix;

        return challenges;
    }

    public static void challengeEncounter(int location) {
        Challenge[] challengeList = SNIPE.getCurrentGame().getChallenges();
        
       
       if (location == 1) {
           Challenge event = challengeList[3];
           boolean flag = event.isUsedFlag();
           String situation = event.getDescription();
           if (flag = false) {
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
