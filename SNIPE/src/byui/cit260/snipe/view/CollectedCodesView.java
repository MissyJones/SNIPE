/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.SNIPE;

/**
 *
 * @author elizabethkirby
 */
public class CollectedCodesView extends View {

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public CollectedCodesView(String message) {
        super("*------------------------*"
                + "\n|  Print Report?         |"
                + "\n*------------------------*"
                + "\n|  P  | Yes Print Report |"
                + "\n*------------------------*");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "P":
                this.printReport();
                break;
            default:
                break;
        }
        return false;
    }

    public static void doAction(String[] args) {
        try {
            //open codes stream files for end user input and output
            SNIPE.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            SNIPE.outFile = new PrintWriter(System.out, true);

            //log file opens
            String filePath = "log.txt";
            SNIPE.logFile = new PrintWriter(filePath);

        } catch (Throwable e) {
            System.out.println("We gracefully inform you of an Exceoption: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        } finally {
            try {
                if (SNIPE.inFile != null) {
                    SNIPE.inFile.close();
                }

                if (SNIPE.outFile != null) {
                    SNIPE.outFile.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(CollectedCodesView.class.getName()).log(Level.SEVERE, null, ex);
            }
            SNIPE.outFile.close();
        }

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

    public static void seInFile(BufferedReader inFile) {
        SNIPE.inFile = inFile;
    }

    private void printReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInput() {
        boolean valid = false;
        String selection = null;
        try {
            while (!valid) {
                selection = this.keyboard.readLine();
                selection = selection.trim();

                if (selection.length() < 1) {//blankity blank
                    ErrorView.display(this.getClass().getName(),
                            "We gracefully inform you we need a value.");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Encountered gracefull error reading input: " + e.getMessage());
        }
        return null;
    }
}
