/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

/**
 *
 * @author Maxwell
 */
class QuitGameView extends View {

    public QuitGameView() {
        super("Are you sure you want to close the game? (Have you saved first?)"
                + "\n"
                + "\n*----------------------------------*"
                + "\n| Y |       Yes, close the game    |"
                + "\n|---+------------------------------|"
                + "\n| N | No, I'd like to keep playing |"
                + "\n*----------------------------------*");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "Y":
                this.quitGame();
                break;
            case "N":
                break;
            default:
                System.out.println("Invalid entry, bro. Try again!");
                break;
        }
        return false;
    }

    private void quitGame() {
        System.exit(0);
    }

}
