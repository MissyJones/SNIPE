/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author elizabethkirby
 */
public class CollectedCodesView extends View {

    public CollectedCodesView(String message) {
        super(message+"\nPress 'R' to return to game;\n");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "R":
                this.returnToMenu();
                break;
            default:
                this.returnToMenu();
                break;
        }
        return false;
    }


    private void returnToMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
