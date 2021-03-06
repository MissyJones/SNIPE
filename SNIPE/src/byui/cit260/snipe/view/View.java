/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.model.Game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import snipe.SNIPE;

/**
 *
 * @author Maxwell
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    protected int points = SNIPE.getPlayer().getHealthPoints();
    protected String scene;
    protected final BufferedReader keyboard = SNIPE.getInFile();
    protected final PrintWriter console = SNIPE.getOutFile();

    public View(String message) {
        this.displayMessage = "You have " + points + " points of health left\n" + message;

    }

    @Override
    public void display() {

        boolean done = false;
        do {

            String value = this.getInput();
            done = this.doAction(value);
        } while (!done);
    }

    @Override
    public String getInput() {
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not be void

        while (!valid) {
            try {
                //loop while an invalid value is entered
                this.console.println("\n" + this.displayMessage);

                value = this.keyboard.readLine();
                value = value.trim();

                if (value.length() < 1) {
                    System.out.println("\nWe gracefully ask that you enter a "
                            + "\nvalue, fool!.");
                    continue;
                }
                break;
            } catch (IOException ex) {
                ;
            }
        }
        return value;
    }

}
