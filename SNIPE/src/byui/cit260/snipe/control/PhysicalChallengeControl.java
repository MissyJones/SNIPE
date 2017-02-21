/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import java.util.Random;
import byui.cit260.snipe.model.PhysChallenge;
import byui.cit260.snipe.model.Player;

/**
 *
 * @author Maxwell
 */
public class PhysicalChallengeControl {

    public String dmgCalc(PhysChallenge physChallenge, Player player) {
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
