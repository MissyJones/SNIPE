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
public class DeathView {
    
    private String deathString = "It seems as though you have failed your mission..."
                               + "\n\n\nIn a somewhat... permanent way.\n"
                               + "Would you like to load your game,\n"
                               + "or would it be more helpful to go to the main menu?";
    private String deathMenu = "*------------------------*"
                           + "\n|  You have been offed   |"
                           + "\n*------------------------*"
                           + "\n|  L  |       Load Game  |"
                           + "\n|------------------------|"
                           + "\n|  M  |       Main Menu  |"
                           + "\n|------------------------|"
                           + "\n|  Q  |       Quit Game  |"
                           + "\n*------------------------*";
    public void DeathView() {
        
        
        
        
    }
    
public void displayDeathMenuView() {
        boolean done = false;
        do {
            System.out.println(deathString);
            String menuOption = this.getMenuOption(this.deathMenu);
            if (menuOption.toUpperCase().equals("Q")) {
                System.out.println("Game over, man. Game over.");
                return;
            }
            done = this.doAction(menuOption);

        } while (!done);

    }

    private String getMenuOption(String menu) {

        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not be void
        OUTER:
        while (!valid) {
            System.out.println("\n" + menu + "\n\n Please select an option:");
            value = keyboard.nextLine();
            value = value.trim();
            switch (value) {
                case "L":
                    break OUTER;
                case "M":
                    break OUTER;
                case "l":
                    break OUTER;
                case "m":
                    break OUTER;
                default:
                    System.out.println("\nInvalid input: You gotta make some sense, breh.");
            }
        }
        return value;
    }

    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "L":
                this.loadGame();
                break;
            case "M":
                this.displayMainMenu();
                break;
            default:
                System.out.println("Invalid entry, bro. Try again!");
                break;
        }
        return false;
    }

    private void loadGame() {
        System.out.println("You've called the Load Game function! Or did it call you..? *INCEPTION BWAHHHNNNNN*");
    }

    private void displayMainMenu() {
        System.out.println("Going to the main menu...");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMainMenuView();
    }
    
    
    
}
