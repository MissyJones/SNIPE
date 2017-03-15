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
public class DeathView extends View {

    public DeathView() {
        super("It seems as though you have failed your mission..."
                + "\n\n\nIn a somewhat... permanent way.\n"
                + "Would you like to load your game,\n"
                + "or would it be more helpful to go to the main menu?\n\n"
                + "*------------------------*"
                + "\n|  You have been offed   |"
                + "\n*------------------------*"
                + "\n|  L  |       Load Game  |"
                + "\n|------------------------|"
                + "\n|  M  |       Main Menu  |"
                + "\n|------------------------|"
                + "\n|  Q  |       Quit Game  |"
                + "\n*------------------------*");
    }

    @Override
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
        mainMenuView.display();
    }

}
