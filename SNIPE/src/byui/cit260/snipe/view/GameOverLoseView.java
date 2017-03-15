/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

/**
 *
 * @author Home
 */
public class GameOverLoseView {

    private final String displayMessage;

    public GameOverLoseView() {
        this.displayMessage = "\nEPIC Mission FAIL!Go back to the Main Menu and try again.";
    }

    private void MainMenuView() {
        System.out.print("Back to the Main Menu.");
    }

    private void Credits() {
        System.out.print("The usual credit block:");
    }

    private void FamousSNIPGrads() {
        System.out.print("Maybe talk to these SNIPE graduates?");
    }
}
