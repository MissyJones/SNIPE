/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.GameControl;
import snipe.SNIPE;

/**
 *
 * @author Maxwell
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n*---------------------------*"
            + "\n|        Game Menu          |"
            + "\n*---------------------------*"
            + "\n|  L  |       Look around   |"
            + "\n|-----|---------------------|"
            + "\n|  T  |       Travel        |"
            + "\n|-----|---------------------|"
            + "\n|  C  |       Codes         |"
            + "\n|-----|---------------------|"
            + "\n|  P  |       Passports     |"
            + "\n|-----|---------------------|"
            + "\n|  S  |       Save Game     |"
            + "\n|-----|---------------------|"
            + "\n|  Q  |       Quit          |"
            + "\n*---------------------------*"
            + "\n\n");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "L":
                this.lookAround();
                break;
            case "T":
                this.travelMenu();
                break;
            case "C":
                this.codeView();
                break;
            case "P":
                this.passportsMenu();
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



    private void saveGame() {
        this.console.println("Where do you want this game to be saved?");
        
        String filePath = this.getInput();
        
        try {GameControl.saveGame(SNIPE.getCurrentGame(), filePath);
        }catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }

    private void codeView() {

    }

    private void loadGame() {
        this.console.println("Where is the save file located?");
        
        String filePath = this.getInput();
        
        try {
            GameControl.loadGame(filePath);
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }


    private void lookAround() {
        this.console.println("lookAround");
    }

    private void travelMenu() {
        TravelMenuView travelMenu = new TravelMenuView();
        travelMenu.display();
    }

    private void passportsMenu() {
        this.console.println("passports");
    }

}
