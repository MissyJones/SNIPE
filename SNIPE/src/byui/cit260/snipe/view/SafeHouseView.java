/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.exceptions.ChallengeControlException;
import byui.cit260.snipe.model.Player;

/**
 *
 * @author Maxwell
 */
public class SafeHouseView extends View {

    public SafeHouseView() {
        super("You arrive in the safe houseThere is a pile of large barrels "
                + "\nis to be found stacked in a shadowy stone recess on the"
                + "\n right-hand side of the corridor. The barrel two from the "
                + "\nbottom, middle of the second row, will open if tapped in"
                + "\nthe rhythm of the 'Mission Impossible' theme.A sloping, "
                + "\nearthy passage inside the barrel travels upwards a little "
                + "\nway until a cosy, round, low-ceilinged room is revealed, "
                + "\nreminiscent of a badger's set. The room is decorated in "
                + "\nthe cheerful, bee-like colours of yellow and black, e"
                + "\nmphasised by the use of highly polished, honey-coloured "
                + "\nwood for the tables and the round doors which lead to the "
                + "\nmen's and women's dormitories (furnished with comfortable "
                + "wooden bedsteads, all covered in patchwork quilts). Yes, the"
                + "\nSafe House is the common room for the House of Hufflepuff."
                + "\nNow you know you're at Hogwarrs. Welcome Muggle!"
                + "\nNow, are you feeling rested and healed? Are you ready to"
                + "\nreturn to the game? Are you reall ready? Are you sure?"
                + "\nPress 'R' to return to the game.");
    }

    public static String addHealth(Player player) throws ChallengeControlException {
        String reply = null;
        int currentHealth = player.getHealthPoints();
        if (currentHealth < 100) {

            currentHealth = 100;
            reply = "You now have " + currentHealth + "points. Go forth and make SNIPE Academy proud";
        }
        return reply;
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
