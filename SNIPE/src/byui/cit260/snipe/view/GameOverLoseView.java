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
public class GameOverLoseView extends View{

    public GameOverLoseView() {
        super("\nEPIC Mission FAIL! Go back to the Main Menu and try again.");
    }

    private void MainMenuView() {
        System.out.print("Back to the Main Menu.");
    }

    @Override
    public boolean doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
