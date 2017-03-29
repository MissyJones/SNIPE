/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Challenge;
import byui.cit260.snipe.model.Player;
import java.util.Random;
import byui.cit260.snipe.exceptions.ChallengeControlException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public void challengeEncounter() {
        Random rand = new Random();
        int chance = (int) ((Math.ceil(rand.nextInt(100))));
        if (chance > 29) {
            
            
        }
    }
    
}
