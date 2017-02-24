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
public class PassportMenuView {
    private String passportMenuStart = 
              "\n*--------------------------------------*"
             +"\n|               Passports              |"
             +"\n";            
    private String passportMenuEnd = 
               "*--------------------------------------*";
    private String beginString = 
               "|-----------|--------------------------|\n"
             + "| ";
    private String middleString = 
               " |  ";
    private String endString = 
               "|\n";
    private String passportConstructed;
    
    public PassportMenuView() {
        this.displayPassportMenu();
    }
    
    private void constructPassportMenu() {
        System.out.println("This methosd has been called");
        
    }

    private void displayPassportMenu() {
        
        System.out.println("THIS IS THE PASSPORT MENU. Good Job.");
    }
}
