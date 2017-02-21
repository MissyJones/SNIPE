/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snipe;

import byui.cit260.snipe.model.Game;
import byui.cit260.snipe.model.PhysChallenge;
import byui.cit260.snipe.model.MentalChallenge;
import byui.cit260.snipe.model.Player;
import byui.cit260.snipe.model.Character;
import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Item;
import byui.cit260.snipe.model.Location;
import byui.cit260.snipe.view.StartProgramView;

/**
 *
 * @author Maxwell, Missy
 */
public class SNIPE {

    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();

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
