/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Challenge;
import byui.cit260.snipe.model.Player;
import java.util.Random;

/**
 *
 * @author Missy
 */
public class ChallengeControl {

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

    public String mathPuzzleTwo(double radius, double height1, double number1) {
        double volume = Math.PI * height1 * radius * radius;
        String answer;
        if (number1 <= 0) {
            return "Please enter a positive, rational number, silly!";
        } else if (number1 == 4825.49) {
            answer = "A compartment opens and you safely retrieve the code.";
        } else {
            answer = "Oops! You won’t be getting this code!";
        }
        return answer;
}

    public String mathPuzzleOne(double number) {
        String answer;
        if (number == Math.sqrt(20857489)) {
            answer = "The door unlocks, enter at your own risk.";
        } else {
            answer = "Think again sucker!";
        }
        return answer;

    }

    public String dmgCalc(Challenge physChallenge, Player player) {
        Random rand = new Random();
        String reply;
        double damage;
        damage = (Math.ceil(rand.nextInt(29))) + 1;

        if (damage < 1) {
            reply = "ERROR '-1', you can't have negative damage.";
        } else if (damage > 30) {
            reply = "ERROR '+1', you can't do more than 30 points of damage.";
        } else {
            double currentHealth;
            currentHealth = player.getHealthPoints();
            double newHealth = currentHealth - damage;
            player.setHealthPoints(newHealth);
            if (newHealth < 1) {
                reply = "You died";
            } else {
                reply = physChallenge.getDescription() + newHealth + " points of health left.";
            }

        }
        return reply;
    }
}
