/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

/**
 *
 * @author elizabethkirby
 */
public class HealthPointsView extends View {
    
    public HealthPointsView() {
        super("\n*----------------------------------*"
            + "\n|  Menu Options                    |"
            + "\n*----------------------------------*"
            + "\n|  H  | Help Menu                  |"
            + "\n|----------------------------------|"
            + "\n|  M  | Main Menu                  |"
            + "\n|----------------------------------|"
            + "\n|  R  | Return to Player Location  |"
            + "\n*----------------------------------*");
System.out.print("You have "+points+" points of helth left.");
        
    }
@Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "H":
                new HelpMenuView().display();
                break;
            case "M":
                new MainMenuView().display();
                break;
            default:
                System.out.println("Sorry kid! We do not understand"
                        + "\n\nyour command. Try again!");
                break;
        }
        return false;
    }

    private void displayMainMenu() {
        System.out.println("Going to the main menu...");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }   

    private void displayHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
