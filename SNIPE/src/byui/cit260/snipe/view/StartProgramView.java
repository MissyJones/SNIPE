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
public class StartProgramView {
        private final String promptMessage;
    
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name: ";
        this.displayBanner();
}
    
   
    public final void displayBanner() {
        System.out.println("\n---------------------------------------------"
                          +"\n|  This is a text based international spy   |"
                          +"\n|  adventure game. Upon completion of this  |"
                          +"\n|  final set of training missions, the user |"
                          +"\n|  becomes a secret agent. The user is      |"
                          +"\n|  assigned a secret agent name and given a |"
                          +"\n|  dossier containing a brief description of|"
                          +"\n|  the country, the names of three cities   |"
                          +"\n|  which hold clues, and details about the  |"
                          +"\n|  physical or mental challenge in each     |"
                          +"\n|  city. Upon successful completion of at   |"
                          +"\n|  least one challenge per country, the user|"
                          +"\n|  receives part of a master code that is   |"
                          +"\n|  needed to win the game. A user can become|"
                          +"\n|  injured and lose health points, or die in|"
                          +"\n|  physical challenges.                     |"
                          +"\n---------------------------------------------"
        );
        
    }

    public void displayStartProgramView() {
        System.out.println ("\nSNARKY AND SCARCASTIC");
    }
            
            
            }
