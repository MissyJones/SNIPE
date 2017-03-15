/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import java.util.Scanner;

/**
 *
 * @author elizabethkirby
 */
public class CollectedCodesMenuView {

    private boolean hasCode;
    private final String menu;

    public CollectedCodesMenuView() {
        this.menu
                = "\n*-------------------------------------------*"
                + "\n|             Collected Codes Menu          |"
                + "\n*-------------------------------------------*"
                + "\n| U  |		 USA                     |"
                + "\n|----|--------------------------------------|"
                + "\n| G  |	      	Germany   		 |"
                + "\n|----|--------------------------------------|"
                + "\n| E  | 		England                  |"
                + "\n|----|--------------------------------------|"
                + "\n| S  | 		Spain                    |"
                + "\n|----|--------------------------------------|"
                + "\n| F  | 		France                   |"
                + "\n|----|--------------------------------------|"
                + "\n| C  | 		Canada   		 |"
                + "\n|----|--------------------------------------|"
                + "\n| B  | 		Brazil    	         |"
                + "\n|----|--------------------------------------|"
                + "\n| A  | 		Australia 		 |"
                + "\n|----|--------------------------------------|"
                + "\n| R  | 		Russia        		 |"
                + "\n*----------------------------*--------------*"
                + "\n|       Other Options        |"
                + "\n|----------------------------|"
                + "\n| V  |   View Map            |"
                + "\n|----|-----------------------|"
                + "\n| M  |   Main Menu           |"
                + "\n|----|-----------------------|"
                + "\n| H  |   Help Menu           |"
                + "\n|----|-----------------------|"
                + "\n| X  |   Exit Menu	     	  |"
                + "\n*----------------------------*"
                + "\n\n";
    }

    public void displayCollectedCodesMenuView() {
        boolean done = false;
        do {
            //prompt for player to choose something
            String menuOption = this.getExitMenuOption(this.menu);
            if (menuOption.toUpperCase().equals("X")) {
                System.out.println("Hi ho! Hi ho! It's back to our location we go.");
                return;
            }
            done = this.doAction(menuOption);

        } while (!done);

    }

    private String getHelpMenuOption(String menu) {
        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        String chosen = ""; //return the chosen option
        boolean valid = false; //initialize to not be void
        System.out.println(menu);
        OUTER:
        while (!valid) {
            System.out.println("\n Please enter your choice:");
            chosen = keyboard.nextLine();
            chosen = chosen.trim();

            switch (chosen) {
                case "U":
                    this.usaCode();
                    break OUTER;
                case "G":
                    this.germanyCode();
                    break OUTER;
                case "E":
                    this.englandCode();
                    break OUTER;
                case "S":
                    this.spainCode();
                    break OUTER;
                case "F":
                    this.franceCode();
                    break OUTER;
                case "C":
                    this.canadaCode();
                    break OUTER;
                case "B":
                    this.brazilCode();
                    break OUTER;
                case "A":
                    this.australiaCode();
                    break OUTER;
                case "R":
                    this.russiaCode();
                    break OUTER;
                case "V":
                    this.viewMap();
                    break OUTER;
                case "M":
                    new MainMenuView().display();
                    break OUTER;
                case "H":
                    new HelpMenuView().display();
                    break OUTER;
                case "X":
                    break OUTER;
                default:
                    System.out.println("Sorry kid! We do not understand your command. Try again!");
                    break;
            }
        }
        return chosen;
    }

    private void usaCode() {
        if (hasCode == true) {
            System.out.println("This code you have. Yes.");
        } else {
            System.out.println("This code you have not. No.");
        }
    }

    private void germanyCode() {
        if (hasCode == true) {
            System.out.println("This code you have. Yes.");
        } else {
            System.out.println("This code you have not. No.");
        }
    }

    private void englandCode() {
        if (hasCode == true) {
            System.out.println("This code you have. Yes.");
        } else {
            System.out.println("This code you have not. No.");
        }
    }

    private void spainCode() {
        if (hasCode == true) {
            System.out.println("This code you have. Yes.");
        } else {
            System.out.println("This code you have not. No.");
        }
    }

    private void canadaCode() {
        if (hasCode == true) {
            System.out.println("This code you have. Yes.");
        } else {
            System.out.println("This code you have not. No.");
        }
    }

    private void brazilCode() {
        if (hasCode == true) {
            System.out.println("This code you have. Yes.");
        } else {
            System.out.println("This code you have not. No.");
        }
    }

    private void australiaCode() {
        if (hasCode == true) {
            System.out.println("This code you have. Yes.");
        } else {
            System.out.println("This code you have not. No.");
        }
    }

    private void russiaCode() {
        if (hasCode == true) {
            System.out.println("This code you have. Yes.");
        } else {
            System.out.println("This code you have not. No.");
        }
    }

    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean doAction(String menuOption) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getExitMenuOption(String menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void franceCode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
