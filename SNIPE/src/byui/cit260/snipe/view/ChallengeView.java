/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.enums.ChallengeDescriptionEnum;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Maxwell
 */
public class ChallengeView {

    public ChallengeView(int challengeNum) {
        
        this.display(challengeNum);
    }

    public void display(int num) {

        boolean done = false;
        do {

            String value = this.getInput(num);
            if (value.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(value);
        } while (!done);
    }

    public String getInput(int num) {
        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not be void

        while (!valid) { //loop while an invalid value is entered 
            System.out.println(ChallengeDescriptionEnum.values()[num]);
            
            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank, fool");
                continue;
            }
            break;
        }
        return value;
    }

    private boolean doAction(String value) {
        
        try {
            Double number = Double.parseDouble(value);
            
        }
        catch (NumberFormatException nf) {
            System.out.println("Please enter a nuimber. I assume you know"
                    + "\n what those are, don't you?");
        }
         return true;   
    }

}
