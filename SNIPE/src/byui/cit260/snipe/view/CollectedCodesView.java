/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;
import java.util.Scanner;
/**
 *
 * @author elizabethkirby
 */
public class CollectedCodesView {

	private String collectedCodesMenu;
    private final String menu;
	
	public CollectedCodesView() {
		 this.menu
         ="\n*-------------------------------------------*"
         +"\n|             Collected Codes Menu          |"
	 +"\n*-------------------------------------------*"
         +"\n| U  |		 USA                     |"
         +"\n|----|--------------------------------------|"
         +"\n| G  |	      	Germany   		 |"
         +"\n|----|--------------------------------------|"
         +"\n| E  | 		England                  |"
         +"\n|----|--------------------------------------|"
         +"\n| S  | 		Spain                    |"
         +"\n|----|--------------------------------------|"
         +"\n| F  | 		France                   |"
         +"\n|----|--------------------------------------|"
         +"\n| C  | 		Canada   		 |"
         +"\n|----|--------------------------------------|"
         +"\n| B  | 		Brazil    	         |"
         +"\n|----|--------------------------------------|"
         +"\n| A  | 		Australia 		 |"
         +"\n|----|--------------------------------------|"
         +"\n| R  | 		Russia        		 |"
         +"\n*----------------------------*--------------*"
         +"\n|       Other Options        |"
         +"\n|----------------------------|"
         +"\n| V  |   View Map            |"
         +"\n|----|-----------------------|"
         +"\n| M  |   Main Menu           |"
         +"\n|----|-----------------------|"
         +"\n| H  |   Help Menu           |"
         +"\n*----------------------------*"
         +"\n\n";
        }

    /**
     *
     */
    public void displayCollectedCodesView(){
        boolean done = false;
        do {
            //prompt for ang get things
            String menuOption;
            menuOption = this.getHelpMenuOption(this.menu);
            if (menuOption.toUpperCase().equals("M")) {
                System.out.println("OK. Returning to Main Menu.");
                return;
            }
            done = this.doAction(menuOption);

        } while (!done);

    }
private String getHelpMenuOption(String menu) {
       Scanner keyboard = new Scanner(System.in);  //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not be void
        System.out.println(menu);
        OUTER:
        while (!valid) {
            System.out.println("\n Please select a country:");
            value = keyboard.nextLine();
            value = value.trim();
            switch (value) {
                case "U":
                    break OUTER;
                case "G":
                    break OUTER;
                case "E":
                    break OUTER;
                case "S":
                    break OUTER;
                case "F":
                    break OUTER;
                case "C":
                    break OUTER;
                case "B":
                    break OUTER;
                case "A":
                    break OUTER;
                case "R":
                    break OUTER;
                case "V":
                    break OUTER;
                case "M":
                    break OUTER;
                case "H":
                    break OUTER;
                default:
                    System.out.println("\nInvalid input: Sorry kid! We do not understand your command.");
            }
        }
        return value;
    }
         
    private boolean doAction(String menuOption) {
        switch (menuOption) {
             case "U":
                this.usaView();
                break;
            
             case "G":
                this.germanyView();
                break;
             case "E":
                this.englandView();
                break;
             case "S":
                this.spainView();
		break;
             case "F":
                this.franceView();
                break;
             case "C":
                this.canadaView();
                break;
             case "B":
                this.brazilView();
                break;
             case "A":
                this.australiaView();
                break;
             case "R":
                this.russiaView();
                break;
             case "V":
                    this.viewMap();
                    break;
                case "M":
                    new MainMenuView().display();
                    break;
                case "H":
                    new HelpMenuView().display();
                    break;
            default:
                System.out.println("Why did you choose an invalid option? Try again!");
                break;
        }
        return false;
    }

    private void australiaView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void russiaView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void usaView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void germanyView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void englandView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void spainView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void franceView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void canadaView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void brazilView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}