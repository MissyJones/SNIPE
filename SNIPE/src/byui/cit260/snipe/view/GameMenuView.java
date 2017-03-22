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

    private void startNewGame() {
        GameControl.createNewGame(SNIPE.getPlayer());

    }

    private void saveGame() {
        System.out.println("called saveGame*******");
    }

    private void codeView() {

    }

    private void loadGame() {
        System.out.println("called loadGame*******");
    }

    void displayMenu() {
        System.out.println("called GameMenuView.displayMenu*******");
    }

    private void lookAround() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void travelMenu() {
        TravelMenuView travelMenu = new TravelMenuView();
        travelMenu.display();
    }

    private void passportsMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
