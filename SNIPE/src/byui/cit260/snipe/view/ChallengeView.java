/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.ChallengeControl;
import byui.cit260.snipe.enums.ChallengeDescriptionEnum;
import byui.cit260.snipe.exceptions.ChallengeControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.SNIPE;

/**
 *
 * @author Maxwell
 */
public class ChallengeView extends View {

    public ChallengeView() {
        super("");

    }

    public boolean doAction(String value) {

        try {
            Double number = Double.parseDouble(value);

        } catch (NumberFormatException nf) {
            System.out.println("Please enter a nuimber. I assume you know"
                    + "\n what those are, don't you?");
        }
        return true;
    }

    public void MathPuzzleTwo() {
        try {
            String playerAnswer1 = keyboard.readLine();
            double playerAnswer1Num = Double.parseDouble(playerAnswer1);

            ChallengeControl cc = new ChallengeControl();
            double correctAnswer = cc.mathPuzzleTwo(1.0, 2.0, 3.0, 4.0);
            //answer is 4825.49
            if (playerAnswer1Num == correctAnswer) {
                console.write("A compartment opens and you, exercising the\n"
                        + "utmost of caution, retrieve the code.\n"
                        + "the code. Be careful! It's a trap! Well,\n"
                        + "maybe. It could be perfectly safe too.\n");
            } else {
                console.write("Oops! You won't be getting this code you fool!\n"
                        + "Too bad for you!\n");
            }
        } catch(ChallengeControlException cce) {
            ErrorView.display(ChallengeView.class.getName(), cce.getMessage());
        } catch(IOException ioe) {
            ErrorView.display(ChallengeView.class.getName(), ioe.getMessage());
        }catch(NumberFormatException nfe) {
            ErrorView.display(ChallengeView.class.getName(), "Aw! Come on! Please\n"+
                    "enter a positive, rational number, you fool!");
        }
        }
    }
