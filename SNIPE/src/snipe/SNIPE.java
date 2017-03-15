/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snipe;

import byui.cit260.snipe.model.Game;
import byui.cit260.snipe.model.Challenge;
import byui.cit260.snipe.model.Player;
import byui.cit260.snipe.model.Code;
import byui.cit260.snipe.model.Location;
import byui.cit260.snipe.view.StartProgramView;

/**
 *
 * @author Maxwell, Missy
 */
public class SNIPE {

    private static Game currentGame = null;
    private static Player player = null;
    private static String passportList = null;

    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();
        try { 
            startProgramView.displayStartProgramView();
        }
        catch (Throwable te) {
            System.out.println("Your game has crashed. The specific error will"
                    + "\n be displayed below. Your game will be restarted.");
            te.printStackTrace();
            startProgramView.displayStartProgramView();
            
        }

    }

    public static String getPassportList() {
        return passportList;
    }

    public static void setPassportList(String passportList) {
        SNIPE.passportList = passportList;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SNIPE.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SNIPE.player = player;
    }

}
