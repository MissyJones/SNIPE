/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import java.util.Scanner;

/**
 *
 * @author Maxwell
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;
    protected double points = (snipe.SNIPE.getPlayer()).getHealthPoints();

    
    public View (){
        
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false;
        do {

            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }
            done = this.doAction(value);
        } while (!done);
    }

    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not be void

        while (!valid) { //loop while an invalid value is entered 
            System.out.println("\n" + this.displayMessage);

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

}
