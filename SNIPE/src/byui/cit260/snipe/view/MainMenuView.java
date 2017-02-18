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
class MainMenuView {
    
    private final String menu;
public MainMenuView() {
    this.menu =
              "\n#############################"
            + "\n|        Main Menu          |"
            + "\n#############################"
            + "\nN -- New Game"
            + "\nG -- Saved Game"
            + "\nH -- Help"
            + "\nS -- Save Game"
            + "\nQ -- Quit"
            + "\n#############################"
            + "\n\n";
}
    
    public void displayMainMenuView() {
        boolean done = false;
        do {
            //prompt for ang get things
            String menuOption = this.getMenuOption(this.menu);
            if (menuOption.toUpperCase().equals("Q")){
                System.out.println("Game over, man. Game over.");
                return;
            }
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
                    case "N":
                        break OUTER;
                    case "G":
                        break OUTER;
                    case "H":
                        break OUTER;
                    case "S":
                        break OUTER;
                    case "Q":
                        break OUTER;
                    case "n":
                        break OUTER;
                    case "g":
                        break OUTER;
                    case "h":
                        break OUTER;
                    case "s":
                        break OUTER;
                    case "q":
                        break OUTER;
                    default:
                        System.out.println("\nInvalid input: That doesn't make sense, dummy.");
                }
            }
        return value;
    }

   public boolean doAction(String choice) {
choice = choice.toUpperCase();
    switch (choice) {
        case "N":
            this.startNewGame();
            break;
        case "G":
            this.loadGame();
            break;
        case "H":
            this.displayHelpMenu();
            break;
        case "S":
            this.saveGame();
            break;
        case "Q":
            System.out.println("Game over, man");
            break;
        default:
            System.out.println("Tnavlid entry, bro. Try again!");
            break;
    }
        return false;
    }

    private void startNewGame() {
        System.out.println("called startNewGame*******");
    }

    private void saveGame() {
        System.out.println("called saveGame*******");
    }

    private void displayHelpMenu() {
        System.out.println("called displayHelpMenu*******");
    }

    private void loadGame() {
        System.out.println("called loadGame*******");
    }
    
}