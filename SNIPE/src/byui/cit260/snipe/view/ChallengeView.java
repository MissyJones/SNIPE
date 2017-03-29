/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.enums.ChallengeDescriptionEnum;
import java.io.BufferedReader;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import snipe.SNIPE;

/**
 *
 * @author Maxwell
 */
public class ChallengeView extends View{
    private int type;
    public ChallengeView(String message, int challengeType) {
        super(message);
        this.type = challengeType;
    }

    @Override
    public boolean doAction(String value) {

        try {
            Double number = Double.parseDouble(value);
            
        } catch (NumberFormatException nf) {
            System.out.println("Please enter a nuimber. I assume you know"
                    + "\n what those are, don't you?");
        }
        return true;
    }
}
