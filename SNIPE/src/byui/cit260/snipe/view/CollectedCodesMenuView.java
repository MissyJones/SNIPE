/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.GameControl;
import java.util.Scanner;
import snipe.SNIPE;
/**
 *
 * @author elizabethkirby
 */
public class CollectedCodesMenuView extends View {

    private String menu;
    private boolean hasCode = false;
      
    public CollectedCodesMenuView() {
        this.menu
         ="\n*----------------------------------------------*"
         +"\n|             Collected Codes Menu             |"
	 +"\n*----------------------------------------------*"
         +"\n| 1  |		 USA                        |"
         +"\n|----|-----------------------------------------|"
         +"\n| 2  |	      	Germany                     |"
         +"\n|----|-----------------------------------------|"
         +"\n| 3  | 		England                     |"
         +"\n|----|-----------------------------------------|"
         +"\n| 4  | 		Spain                       |"
         +"\n|----|-----------------------------------------|"
         +"\n| 5  | 		France                      |"
         +"\n|----|-----------------------------------------|"
         +"\n| 6  | 		Canada                      |"
         +"\n|----|-----------------------------------------|"
         +"\n| 7  | 		Brazil                      |"
         +"\n|----|-----------------------------------------|"
         +"\n| 8  | 		Australia                   |"
         +"\n|----|-----------------------------------------|"
         +"\n| 9  | 		Russia                      |"
         +"\n*----------------------------*-----------------*"
         +"\n|       Other Options                        |"
         +"\n|--------------------------------------------|"
         +"\n| V  |   View Map                            |"
         +"\n|----|---------------------------------------|"
         +"\n| M  |   Main Menu                           |"
         +"\n|----|---------------------------------------|"
         +"\n| H  |   Help Menu                           |"
	 +"\n|----|---------------------------------------|"
	 +"\n| R  |   Return to Location	     	  |"
         +"\n*--------------------------------------------*"
         +"\n\n";
    }
     public void displayCollectedCodesMenuView(){
        boolean done = false;
        do {
            //prompt for player to choose something
            String menuOption = this.getExitMenuOption(this.menu);
            if (menuOption.toUpperCase().equals("R")) {
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
             case "1":
                this.usaCode();
                break OUTER;
             case "2":
                this.germanyCode();
                break OUTER;
             case "3":
                this.englandCode();
                break OUTER;
             case "4":
                this.spainCode();
		break OUTER;
             case "5":
                this.franceCode();
		break OUTER;
             case "6":
                this.canadaCode();
                break OUTER;
             case "7":
                this.brazilCode();
                break OUTER;
             case "8":
                this.australiaCode();
                break OUTER;
             case "9":
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
	     case "R":
                   break OUTER;
            default:
                System.out.println("Sorry kid! We do not understand"
                        + "\n\nyour command. Try again!");
                break;
            }
        }
        return chosen;
    }

     private void usaCode() {
        if(hasCode = true) {
	    System.out.println("This code you have. Yes.");
	}
	else {
	    System.out.println("This code you have not. No.");
	}
    }
    
    private void germanyCode() {
        if(hasCode = true) {
	    System.out.println("This code you have. Yes.");
	}
	else {
	    System.out.println("This code you have not. No.");
	}
    }

    private void englandCode() {
        if(hasCode = true) {
	    System.out.println("This code you have. Yes.");
	}
	else {
	    System.out.println("This code you have not. No.");
	}
    }

    private void spainCode() {
        if(hasCode = true) {
	    System.out.println("This code you have. Yes.");
	}
	else {
	    System.out.println("This code you have not. No.");
	}
    }

    private void canadaCode() {
        if(hasCode = true) {
	    System.out.println("This code you have. Yes.");
	}
	else {
	    System.out.println("This code you have not. No.");
	}
    }

    private void brazilCode() {
        if(hasCode = true) {
	    System.out.println("This code you have. Yes.");
	}
	else {
	    System.out.println("This code you have not. No.");
	}
    }

    private void australiaCode() {
        if(hasCode = true) {
	    System.out.println("This code you have. Yes.");
	}
	else {
	    System.out.println("This code you have not. No.");
	}
    }

    private void russiaCode() {
        if(hasCode = true) {
	    System.out.println("This code you have. Yes.");
	}
	else {
	    System.out.println("This code you have not. No.");
	}
    }

    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean doAction(String menuOption) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getExitMenuOption(String menu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void franceCode() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Super(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}