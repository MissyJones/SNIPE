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
class HelpMenuView {
    
    private final String menu;
public HelpMenuView() {
    this.menu =
              "\n#################################"
            + "\n|        Help Menu              |"
            + "\n#################################"
            + "\nS -- Saving Your Game"
            + "\nT -- Travel Help"
            + "\nD -- Dossier Inventory Help"
            + "\nC -- Collecting Codes"
            + "\nM -- Main Menu"
            + "\nR -- Return to Player Location"
            + "\n#################################"
            + "\n\n";
}
    
    public void displayMainMenuView() {
        boolean done = false;
        do {
            //prompt for ang get things
            String menuOption = this.getMenuOption(this.menu);
            if (menuOption.toUpperCase().equals("R"))
                return;
            
            done = this.doAction(menuOption);
            
        }  while (!done);
        
        
        
    }

    private String getMenuOption(String menu) {
 
        Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not be void
        System.out.println(menu);
        OUTER:
        while (!valid) {
            System.out.println("\n Please select an option:");
            value = keyboard.nextLine();
            value = value.trim();
                switch (value) {
                    case "S":
                        break OUTER;
                    case "T":
                        break OUTER;
                    case "D":
                        break OUTER;
                    case "C":
                        break OUTER;
                    case "M":
                        break OUTER;
                    case "R":
                        break OUTER;
                    case "s":
                        break OUTER;
                    case "t":
                        break OUTER;
                    case "d":
                        break OUTER;
                    case "c":
                        break OUTER;
                    case "m":
                        break OUTER;
                    case "r":
                        break OUTER;
                    default:
                        System.out.println("\nInvalid input: That doesn't make sense. You so silly!");
                }
            }
        return value;
    }

   public boolean doAction(String choice) {
choice = choice.toUpperCase();
    switch (choice) {
        case "S":
            this.savingYourGame();
            break;
        case "T":
            this.travelHelp();
            break;
        case "D":
            this.dossierIventroyHelp();
            break;
        case "C":
            this.collectingCodes();
            break;
        case "M":
            this.mainMenu();
            break;
        case "R":
            this.playerLocation();
            break;
        default:
            System.out.println("Why did you choose an invalid option? Try again!");
            break;
    }
        return false;
    }

    private void savingYourGame() {
        System.out.println("Saves the game to a file based on the player’s assigned Agent Name. Don't forget your agent name when you come back!");
    }

    private void travelHelp() {
        System.out.println("Information coming soon. You will see a list of local locations that you can visit. Don't forget to check your dossier, mate! Important happy little hints live there.");
    }

    private void dossierIventroyHelp() {
        System.out.println("Information about how the Dossier Inventory features work, opening the Dossier menu, and see a list of the dossiers acquired. Also you will be able to select a dossier to see the challenges you face in the current country/location. Mwahaahahaha!");
    }

    private void collectingCodes() {
        System.out.println("Comming to an assignment soon. Learn what codes are and how to use them, You must collect ALL codes or you flunk out SNIPE academy, and that would be so sad.");
    }

    private void mainMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void playerLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
