/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.ChallengeControl;
import byui.cit260.snipe.control.CodeControl;
import byui.cit260.snipe.enums.ChallengeDescriptionEnum;
import byui.cit260.snipe.exceptions.ChallengeControlException;
import byui.cit260.snipe.exceptions.CodeControlException;
import byui.cit260.snipe.model.Challenge;
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

    private int type;
    private Challenge event;
    private double volume;
    private double answer1;

    public ChallengeView(String message, int challengeType, Challenge event) {
        super(message);
        this.type = challengeType;
        this.event = event;
    }

    public void initializeChallenge(Challenge event, int type) {

    }

    @Override
    public boolean doAction(String value) {
        GameMenuView gameMenu = new GameMenuView();
        if (this.type == 1) {
            try {
                Double number = Double.parseDouble(value);
                boolean validate = false;
                while (validate = false) {
                    try {
                        ChallengeControl.mathPuzzleOne(number);
                    } catch (ChallengeControlException ex) {
                        Logger.getLogger(ChallengeView.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } catch (NumberFormatException nf) {
                System.out.println("Please enter a number. I assume you know"
                        + "\n what those are, don't you?");
            }
            try {
                CodeControl.addCode(event.getCode(), SNIPE.getPlayer());
            } catch (CodeControlException ex) {
                Logger.getLogger(ChallengeView.class.getName()).log(Level.SEVERE, null, ex);
            }
            event.setUsedFlag(true);
            gameMenu.display();
            return true;
        } else if (this.type == 2) {
            try {

                //ChallengeControl cc = new ChallengeControl();
                Double number = Double.parseDouble(value);
                //answer is 4825.49
                if (volume == answer1) {
                    console.write("A compartment opens and you, exercising the\n"
                            + "utmost of caution, retrieve the code.\n"
                            + "the code. Be careful! It's a trap! Well,\n"
                            + "maybe. It could be perfectly safe too.\n");
                } else {
                    console.write("Oops! You won't be getting this code you fool!\n"
                            + "Too bad for you!\n");
                }
            } catch (NumberFormatException nfe) {
                ErrorView.display(ChallengeView.class.getName(), "Aw! Come on! Please\n"
                        + "enter a positive, rational number!");
            }
            SNIPE.getPlayer().addObjectToCodeInventory(event.getCode());
            event.setUsedFlag(true);
            gameMenu.display();
            return true;

        } else if (this.type == 3) {
            try {
                Double number = Double.parseDouble(value);
                boolean validate = false;
                while (validate = false) {
                    try {
                        ChallengeControl.mathPuzzleThree(number);
                    } catch (ChallengeControlException ex) {
                        Logger.getLogger(ChallengeView.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } catch (NumberFormatException nf) {
                System.out.println("Please enter a number. I assume you know"
                        + "\n what those are, don't you?");
            }
            SNIPE.getPlayer().addObjectToCodeInventory(event.getCode());
            event.setUsedFlag(true);
            gameMenu.display();
            return true;

        } else if (this.type == 4) {
            value = value.toUpperCase();
            switch (value) {
                case "O":
                    this.console.println(event.getChoiceOne());
                    CodeControl.addCode(code, player);
                    SNIPE.getPlayer().addObjectToCodeInventory(event.getCode());
                    gameMenu.display();
                    break;
                case "T":
                    this.console.println(event.getChoiceTwo());
                    SNIPE.getPlayer().addObjectToCodeInventory(event.getCode());

                    gameMenu.display();
                    break;
                default:
                    break;
            }
            return false;

        } else {

        }
        return false;
    }
}