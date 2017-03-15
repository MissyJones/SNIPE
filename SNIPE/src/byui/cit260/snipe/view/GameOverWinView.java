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
public class GameOverWinView {

    private final String displayMessage;

    public GameOverWinView(){
        this.displayMessage = "\nCONGRATULATIONS! YOU WON! Welcome to the elite S.N.I.P.E.";
}
                          
      private void MainMenuView(){
                System.out.print("Back to the Main Menu.");
    }   
      private void Credits(){
                System.out.print("The usual credit block:");
      }
    
}
