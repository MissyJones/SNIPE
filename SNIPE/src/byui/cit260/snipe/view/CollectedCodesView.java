/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import snipe.SNIPE;
import byui.cit260.snipe.exceptions.CodeControlException;
import byui.cit260.snipe.model.Code;
import java.io.IOException;
import byui.cit260.snipe.model.Player;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.SNIPE;
import java.util.ArrayList;
import static snipe.SNIPE.inFile;
import java.util.Scanner;
import java.io.Reader;
/**
 *
 * @author elizabethkirby
 */
public class CollectedCodesView extends View {

    Scanner keyboard = new Scanner(System.in);
    
    private static PrintWriter outFile = null;
    private static BufferedReader infile = null;

    private static PrintWriter logFile = null;
    
    public CollectedCodesView(String message) {
        super(message + "\nPress 'R' to return to game;\n");
    
        try {
            SNIPE.inFile = new BufferedReader(new InputStreamReader(System.in));
            SNIPE.outFile = new PrintWriter(System.out, true);
      
            String filePath = "log.txt";
        
            SNIPE.logFile = new PrintWriter(filePath);
        } catch (Exception e) {
            System.out.println("Gaceful Exeption: " + e.toString() +
                                "\nGraceful Cause: " + e.getCause() +
                                "\nGraceful Message: " + e.getMessage());
            e.printStackTrace();;
    }
        finally {
        try {
            if (SNIPE.inFile != null)
            SNIPE.inFile.close();
            if (SNIPE.outFile != null)
            SNIPE.outFile.close();
            if (SNIPE.logFile != null)
                SNIPE.logFile.close();
        } catch (IOException ex) {
            System.out.println("Gracefull error closing files");
            return;
        }
      }
    }
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
    
    public String getInput() {
        boolean valid = false;
        String selection = null;
        try {
            while (!valid) {
                selection = this.keyboard.readLine();
                selection = selection.trim();
            if (selection.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                            "We gracefully ask that you enter a value.");
                continue;
            }
            break;
            }
            } catch (Exception e) {
                ErrorView.display(this.getClass().getName(),
                                "Graceful Error reading input: " + e.getMessage());
            }
        return null;
        }
    }
