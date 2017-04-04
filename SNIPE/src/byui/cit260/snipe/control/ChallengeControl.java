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
import byui.cit260.snipe.exceptions.CodeControlException;
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

    public static boolean mathPuzzleThree(double number) throws ChallengeControlException, CodeControlException {
        double area = 24 * 16;
        boolean answer = false;
        try {
            if (number == area) {
                System.out.println("You see that the area isn't consistent with the real Mona Lisa."
                        + "\nWhen nobody is looking you peek behind it. It swings open to"
                        + "\nreveal a steel box containing one of your secret codes."
                        + "\nGood work!");
                answer = true;
                
            } else if (number != area) {
                System.out.println("Ughh... Math is hard. It's probably nothing. You leave the painting"
                        + "\nwell enough alone, and walk away. No codes for you today.");
            } else {
                throw new ChallengeControlException();
            }
        } catch (ChallengeControlException ex) {
            Logger.getLogger(ChallengeControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;
    }

    public static boolean mathPuzzleTwo(double number) throws ChallengeControlException, CodeControlException {
        double answer1 = Math.PI * 24 * 8 * 8;//4825.49
        boolean answer = false;
        try {
            if (number == answer1) {
                System.out.println("You successfully calculate the barrel volume. Arbitrarily, it MUST"
                        + "\ncontain a code! You scoop in and find it resting safely in a plastic bag. "
                        + "\nGood work, agent! You got the code!");
                answer = true;
                
            } else if (number != answer1) {
                System.out.println("Nope, you picked the wrong barrel! The alarm goes off and you"
                        + "\nskedaddle out of there before they can get you.");
            } else {
                throw new ChallengeControlException();
            }
        } catch (ChallengeControlException ex) {
            Logger.getLogger(ChallengeControl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return answer;
    }

    public static boolean mathPuzzleOne(double number) throws ChallengeControlException, CodeControlException {
        boolean answer = false;

        try {
            if (number == Math.sqrt(20857489)) {
                System.out.println("The door unlocks and you snatch the code. Good work!");
                answer = true;

            } else if (number != Math.sqrt(20857489)) {
                System.out.println("You got the wrong number! You hear a beep and see smoke"
                        + "\nslip through the cracks in the safe. It seems you won't be"
                        + "\nable to attain this code.");
            } else {

                throw new ChallengeControlException();

            }
        } catch (ChallengeControlException ex) {
            Logger.getLogger(ChallengeControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answer;
    }

    public static String dmgCalc(Player player) throws ChallengeControlException {
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
                reply = "You have " + newHealth + " points of health left.";
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
                reply = "You have " + newHealth + " points of health left.";
            }

        }
        return reply;
    }

    public static void challengeEncounter(int location) throws ChallengeControlException, CodeControlException {
        Challenge here = SNIPE.getCurrentGame().getMap().getLocations()[location].getChallenge();
        int type = here.getType();
        if (here.isUsedFlag() != true) {
        ChallengeView challengeView = new ChallengeView(here.getDescription());
        String string = challengeView.challengeInput();
        double num;
        boolean result;
        switch (type) {
            case 1:
                num = Double.parseDouble(string);
                result = ChallengeControl.mathPuzzleOne(num);
                if (result = true) {
                    SNIPE.getPlayer().addObjectToCodeInventory(here.getCode().getItemDescription());
                }
                here.setUsedFlag(true);
                break;
            case 2:
                num = Double.parseDouble(string);
                result = ChallengeControl.mathPuzzleTwo(num);
                if (result = true) {
                    SNIPE.getPlayer().addObjectToCodeInventory(here.getCode().getItemDescription());
                }
                here.setUsedFlag(true);
                
                break;
            case 3:
                num = Double.parseDouble(string);
                result = ChallengeControl.mathPuzzleThree(num);
                if (result = true) {
                    SNIPE.getPlayer().addObjectToCodeInventory(here.getCode().getItemDescription());
                }
                here.setUsedFlag(true);
                break;
            case 4:
                ChallengeControl.physChallengeControl(string, here);
                here.setUsedFlag(true);
                ChallengeControl.dmgCalc(SNIPE.getPlayer());
                break;
            default:
                break;
        }
        }
        
        
    }


    private static void physChallengeControl(String string, Challenge here) {
                if (string == null) {
                    System.out.println("Looks like you didn't get this one. Too bad, so sad.");
                } else switch (string) {
            case "O":
                System.out.println(here.getChoiceOne());
                SNIPE.getPlayer().addObjectToCodeInventory(here.getCode().getItemDescription());
                break;
            case "T":
                System.out.println(here.getChoiceTwo());
                SNIPE.getPlayer().addObjectToCodeInventory(here.getCode().getItemDescription());
                break;
            default:
                System.out.println("Looks like you didn't make the right decision fast enough. "
                        + "\nYou've let this code slip through your fingers...");
                break;
        }
    }

}
