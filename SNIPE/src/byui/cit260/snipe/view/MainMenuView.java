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
 * @author Maxwell
 */
public class MainMenuView extends View {

    public MainMenuView() {
            super("\n*---------------------------*"
                + "\n|        Main Menu          |"
                + "\n*---------------------------*"
                + "\n|  N  |        New Game     |"
                + "\n|-----|---------------------|"
                + "\n|  G  |        Load Game    |"
                + "\n|-----|---------------------|"
                + "\n|  H  |        Help Menu    |"
                + "\n|-----|---------------------|"
                + "\n|  S  |        Save Game    |"
                + "\n|-----|---------------------|"
                + "\n|  Q  |        Quit         |"
                + "\n*---------------------------*"
                + "\n\n");
    }

    @Override
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
            default:
                System.out.println("Invalid entry, bro. Try again!");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(SNIPE.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        this.console.println("Where do you want this game to be saved?");
        
        String filePath = this.getInput();
        
        try {GameControl.saveGame(SNIPE.getCurrentGame(), filePath);
        }catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void loadGame() {     
        try {
            this.console.println("Where is the save file located?");
            String filePath = this.getInput();
            GameControl.loadGame(filePath);
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        

    }

}
