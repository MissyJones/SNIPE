/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.GameControl;
import byui.cit260.snipe.model.Player;
import java.util.Scanner;

/**
 *
 * @author Maxwell
 */
public class StartProgramView {
        private final String promptMessage;
    
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
}
    
   
    public final void displayBanner() {
        System.out.println("\n---------------------------------------------"
                          +"\n|  This is a text based international spy   |"
                          +"\n|  adventure game. Upon completion of this  |"
                          +"\n|  final set of training missions, the user |"
                          +"\n|  becomes a secret agent. The user is      |"
                          +"\n|  assigned a secret agent name and given a |"
                          +"\n|  dossier containing a brief description of|"
                          +"\n|  the country, the names of three cities   |"
                          +"\n|  which hold clues, and details about the  |"
                          +"\n|  physical or mental challenge in each     |"
                          +"\n|  city. Upon successful completion of at   |"
                          +"\n|  least one challenge per country, the user|"
                          +"\n|  receives part of a master code that is   |"
                          +"\n|  needed to win the game. A user can become|"
                          +"\n|  injured and lose health points, or die in|"
                          +"\n|  physical challenges.                     |"
                          +"\n---------------------------------------------"
        );
        
    }

    public void displayStartProgramView() {
        
        boolean done = false;
        do{

        String playersName = this.getPlayersName();
        if (playersName.toUpperCase().equals("Q"))
            return;
        done = this.doAction(playersName);
        } while (!done);
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not be void
        
        while (!valid) { //loop while an invalid value is entered 
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() <1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break;
        }
        return value;
    }

    private boolean doAction(String playersName) {
       if (playersName.length() < 2) {
           System.out.println("You need more than one character in your name, silly. Try again.");
           return false;
       }
       Player player = GameControl.createPlayer(playersName);
            if (player == null) {
                System.out.println("Looks like that name won't work. Try again.");
                return false;
            }
        System.out.println("Welcome to the world of SNIPE, "+playersName+". \n"
                + "As you know, SNIPE stands for Super Nice Interesting People, Everywhere!\n"
                + "Good luck!");
        this.nextDisplayView();
               return true;
    }

    private void nextDisplayView() {
        System.out.println("nextDisplayView() called");
    }
            
            
            }
