/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Player;

/**
 *
 * @author Maxwell
 */
public class EndGameControl {

    public String checkHealth(Player player) {
        double healthPoints = player.getHealthPoints();
        String check;
        if (healthPoints > 10) {
            check = "You made it past that one easy peasy. You're so good, maybe you should ask for a pay raise.";
        } else if (healthPoints > 1 || healthPoints < 10) {
            check = "You barely survived... Looks like you'll live to fight again";
        } else {
            check = "You have tragically fallen in the service of your vague, english-speaking, yet, ambiguous country. Your loss will be mourned by those who knew you existed.";
        }
        return check;
    }

}
