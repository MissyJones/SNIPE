/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.enums.CodeList;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import snipe.SNIPE;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elizabethkirby
 */
public class CollectedCodesView extends View {
    
    public CollectedCodesView(String message) {
        super(message);
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        switch (choice) {
            case "P":
                this.console.println("");
                break;
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
    private void printCodeList(ArrayList<CodeList> enums,
                                String outputLocation) {
        //create BufferedReader object for input file
        try (PrintWriter out = new PrintWriter(outputLocation)) {
            //print title and column headings
            out.println("\n\n               Code List                  ");
            out.printf("%n%-66s%15%", "Code", "Location");
            out.printf("%n%-66s%15s%", "-------", "------------");
            Iterable<String> CodeList = null;
            
            //print the code and its location
            for (String Enums : CodeList) {
                out.printf("n%-20s%110%s", enums.getCodeList()
                                         , enums.getLocation());
        }
    }   catch (IOException ex) {   
            System.out.println("Graceful I/O error: " + ex.getMessage()); 
            //Logger.getLogger(CollectedCodesView.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
  
