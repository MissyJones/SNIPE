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
class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n*-------------------------------*"
                + "\n|           Help Menu           |"
                + "\n*-------------------------------*"
                + "\n| S |  Saving Your Game         |"
                + "\n|---|---------------------------|"
                + "\n| T |  Travel Help              |"
                + "\n|---|---------------------------|"
                + "\n| D |  Dossier Help             |"
                + "\n|---|---------------------------|"
                + "\n| C |  Collecting Codes         |"
                + "\n|---|---------------------------|"
                + "\n| M |  Main Menu                |"
                + "\n|---|---------------------------|"
                + "\n| R |  Return to Player Location|"
                + "\n*-------------------------------*"
                + "\n\n");
    }

 @Override
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
        System.out.println("Coming to an assignment soon. Learn what codes are and how to use them, You must collect ALL codes or you flunk out SNIPE academy, and that would be so sad.");
    }

    private void playerLocation() {
        System.out.println("called playerLocation*******");
    }

}
