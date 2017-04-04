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


    public ChallengeView(String message) {
          super (message);
    }


    
    public String challengeInput() {
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not be void

        while (!valid) {
            try {
                //loop while an invalid value is entered
 
               // this.console.println(this.displayMessage);
               this.console.println("*----------------------*"
                       + "\n|      CHALLENGE       |"
                       + "\n*----------------------*\n\n"
                       +this.displayMessage);
                value = this.keyboard.readLine();
                value = value.trim();
                value = value.toUpperCase();
                if (value.length() < 1) {
                    System.out.println("\nInvalid value: value cannot be blank, fool");
                    continue;
                }
                break;
            } catch (IOException ex) {
                ;
            }
        }

        return value;
    }
    
    
    @Override
    public boolean doAction(String value) {
        return true;
    }

   
}
