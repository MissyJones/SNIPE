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
import byui.cit260.snipe.view.MainMenuView;
import byui.cit260.snipe.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Maxwell, Missy
 */
public class SNIPE {

    private static Game currentGame = null;
    private static Player player = null;
    private static String passportList = null;

    public static PrintWriter outFile = null;
    public static BufferedReader inFile = null;

    public static PrintWriter logFile = null;

    public static void main(String[] args) {
        StartProgramView startProgramView = new StartProgramView();

        try {
            SNIPE.inFile = new BufferedReader(new InputStreamReader(System.in));
            SNIPE.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            SNIPE.logFile = new PrintWriter(filePath);

            startProgramView.displayStartProgramView();
        } catch (Throwable te) {
            System.out.println("Your game has crashed. Gracefully. The specific error will"
                    + " be displayed below. Your game will be restarted.");
            te.printStackTrace();
            startProgramView.displayStartProgramView();

        } finally {
            try {
                if (SNIPE.inFile != null) {
                    SNIPE.inFile.close();
                }
                if (SNIPE.outFile != null) {
                    SNIPE.outFile.close();
                }
                if (SNIPE.logFile != null) {
                    SNIPE.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("There has been an error closing the files."
                        + "\nConsider it gracefully caught.");
                return;
            }
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        SNIPE.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        SNIPE.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        SNIPE.logFile = logFile;
    }

}
