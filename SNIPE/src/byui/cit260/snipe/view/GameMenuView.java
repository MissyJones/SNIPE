/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.ChallengeControl;
import byui.cit260.snipe.control.GameControl;
import byui.cit260.snipe.control.SafeHouseControl;
import byui.cit260.snipe.exceptions.ChallengeControlException;
import byui.cit260.snipe.exceptions.CodeControlException;
import byui.cit260.snipe.model.Code;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                + "\n|  H  |       Safe House    |"
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
            case "L": {
                try {
                    this.lookAround();
                } catch (ChallengeControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (CodeControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
            case "A":
                attemptChallenge();
                break;
            case "H":
                safeHouse();
                break;
            case "Q":
                this.quitGame();
            default:
                System.out.println("Invalid entry, bro. Try again!");
                break;
        }
        return false;
    }

    private void saveGame() {
        this.console.println("Where do you want this game to be saved?");

        String filePath = this.getInput();

        try {
            GameControl.saveGame(SNIPE.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", ex.getMessage());
        }
    }

    private void codeView() {
        int i = 0;
        ArrayList codeInventory = SNIPE.getPlayer().getCodeInventory();
        String string = "*----------------------*"
                + "\n|   Aquired Codes      |"
                + "\n*----------------------*"
                + "\n";
        String sub = "";
        do {
            sub = "\n" + codeInventory.get(i);
            string = string + sub;
            i++;
        } while (i < codeInventory.size());

        CollectedCodesView codeMenu = new CollectedCodesView(string);
        codeMenu.display();

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

    private void lookAround() throws ChallengeControlException, CodeControlException {
        this.console.println(findScene());
        ChallengeControl.challengeEncounter(SNIPE.getPlayer().getRow());
    }

    private void travelMenu() {
        TravelMenuView travelMenu = new TravelMenuView();
        travelMenu.display();
    }

    private void passportsMenu() {
        this.console.println("passports");
    }

    private String findScene() {
        int row = SNIPE.getPlayer().getRow();
        String place = SNIPE.getCurrentGame().getMap().getLocations()[row].getScene();

        return place;
    }

    private void quitGame() {
        QuitGameView quit = new QuitGameView();
        quit.display();
    }

    private void attemptChallenge() {

        Random rand = new Random();
        int length = rand.nextInt(10) + 1;
        int width = rand.nextInt(10) + 1;

        System.out.println("Please find the area if length=" + length + " and width=" + width + "\n");
        try {
            String playerAnswer = keyboard.readLine();

            int playerAnswerNum = Integer.parseInt(playerAnswer);

            ChallengeControl cc = new ChallengeControl();
            int correctAnswer = cc.calcArea(length, width);

            if (playerAnswerNum == correctAnswer) {
                console.write("Congratulations! You got it right!\n");
            } else {
                console.write("Wrong!\n");
            }
        } catch (ChallengeControlException cce) {
            ErrorView.display(GameMenuView.class.getName(), cce.getMessage());
        } catch (IOException ioe) {
            ErrorView.display(GameMenuView.class.getName(), ioe.getMessage());
        } catch (NumberFormatException nfe) {
            ErrorView.display(GameMenuView.class.getName(), "Please enter a number");
        }

    }

    private void safeHouse() {
        int country = SNIPE.getPlayer().getLocation().getCountry();
        boolean response = SafeHouseControl.riddleFun(country);
        if (response = true) {
            SafeHouseView safeHouse = new SafeHouseView();
            safeHouse.display();
        } else if (response = false) {

        }
    }
}
