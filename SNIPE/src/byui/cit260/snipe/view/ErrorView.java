/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
x` * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import java.io.PrintWriter;
import snipe.SNIPE;

/**
 *
 * @author Maxwell
 */
public class ErrorView {

    private static final PrintWriter errorFile = SNIPE.getOutFile();
    private static final PrintWriter logFile = SNIPE.getLogFile();

    public static void display(String className, String errorMessage) {
        errorFile.println(
                "*----------------------------------------------------*"
                + "\n|-GRACEFUL ERROR-\n\n" + errorMessage
                + "\n*----------------------------------------------------*");

        logFile.println(className + " - " + errorMessage);
    }

    static void display(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
