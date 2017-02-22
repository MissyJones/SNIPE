/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;
import java.util.Scanner;

/**
 *
 * @author Missy
 */
public class TravelMenuView {
    
    private final String menu;
    
    public TravelMenuView() {
        this.menu
         ="\n##################################"
         +"\n|           Travel Menu          |"
         +"\n##################################"
         +"\n1 -- USA SNIPE Academy"
         +"\n2 -- USA Library of Congress"
         +"\n3 -- USA Gateway Arch"
         +"\n4 -- Germany Berlin Wall"
         +"\n5 -- Germany Cologne Cathedral"
         +"\n6 -- Germany Rhine River"
         +"\n7 -- England Big Ben"
         +"\n8 -- England Westminster Abbey"
         +"\n9 -- England Buckingham Palace"
         +"\n10 -- Spain Tarragona"
         +"\n11 -- Spain Cathedral of Seville"
         +"\n12 -- Spain Valencia"
         +"\n13 -- France Eiffel Tower"
         +"\n14 -- France The Louvre"
         +"\n15 -- France A Sidewalk Cafe"
         +"\n16 -- Canada Montreal Olympic Stadium"
         +"\n17 -- Canada Library of Parliment"
         +"\n18 -- Canada CN Tower"
         +"\n19 -- Brazil Beach, Rio de Janeiro"
         +"\n20 -- Brazil Amazon Forest"
         +"\n21 -- Brazil Sao Paulo, Capital"
         +"\n22 -- Australia, Sydney Opera House"
         +"\n23 -- Australia, Old Melbourne jail"
         +"\n24 -- Australia, Bridge"
         +"\n25 -- Russia, St. Peter's Square"
         +"\n26 -- Russia, Lenin's Mausoleum"
         +"\n27 -- Russia, St. Basil's Cathedral"
         +"\nV -- View Map"
         +"\nM -- Main Menu"
         +"\nH -- Help Menu"  
         +"\n\n";
        }
    public void displayTravelMenuView(){
        boolean done = false;
        do {
            //prompt for ang get things
            String menuOption = this.getHelpMenuOption(this.menu);
            if (menuOption.toUpperCase().equals("M")) {
                System.out.println("Going to the main menu.........");
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
            System.out.println("\n Please select an option:");
            value = keyboard.nextLine();
            value = value.trim();
            switch (value) {
                case "1":
                    break OUTER;
                case "2":
                    break OUTER;
                case "3":
                    break OUTER;
                case "4":
                    break OUTER;
                case "5":
                    break OUTER;
                case "6":
                    break OUTER;
                case "7":
                    break OUTER;
                case "8":
                    break OUTER;
                case "9":
                    break OUTER;
                case "10":
                    break OUTER;
                case "11":
                    break OUTER;
                case "12":
                    break OUTER;
                case "13":
                    break OUTER;
                case "14":
                    break OUTER;
                case "15":
                    break OUTER;
                case "16":
                    break OUTER;
                case "17":
                    break OUTER;
                case "18":
                    break OUTER;
                case "19":
                    break OUTER;
                case "20":
                    break OUTER;
                case "21":
                    break OUTER;
                case "22":
                    break OUTER;
                case "23":
                    break OUTER;
                case "24":
                    break OUTER;
                case "25":
                    break OUTER;
                case "26":
                    break OUTER;
                case "27":
                    break OUTER;
                case "V":
                    break OUTER;
                case "M":
                    break OUTER;
                case "H":
                    break OUTER;
                default:
                    System.out.println("\nInvalid input: That doesn't make sense, silly!");
            }
        }
        return value;
    }
         
    private boolean doAction(String menuOption) {
        switch (menuOption) {
             case "1":
                    this.usaSnipeView();
                break;
                case "2":
                    this.usaCongressView();
                    break;
                case "3":
                    this.usaArchView();
                    break;
                case "4":
                    this.germanyBerlinView();
                    break;
                case "5":
                    this.germanyCologneView();
                    break;
                case "6":
                    this.germanyRhineView();
                    break;
                case "7":
                    this.englandBenView();
                    break;
                case "8":
                    this.englandAbbeyView();
                    break;
                case "9":
                    this.englandPalaceView();
                    break;
                case "10":
                    this.englandBuckinghamView();
                    break;
                case "11":
                    this.spainTarragonaView();
                    break;
                case "12":
                    this.spainSevilleView();
                    break;
                case "13":
                    this.spainValenciaView();
                    break;
                case "14":
                    this.franceTowerView();
                    break;
                case "15":
                    this.franceCafeView();
                    break;
                case "16":
                    this.canadaMontrealView();
                    break;
                case "17":
                    this.canadaParlimentView();
                    break;
                case "18":
                    this.canadaCNTowerView();
                    break;
                case "19":
                    this.brazilBeachView();
                    break;
                case "20":
                    this.brazilAmazonView();
                    break;
                case "21":
                    this.brazilSaoPauloView();
                    break;
                case "22":
                    this.australiaOperaView();
                    break;
                case "23":
                    this.australiaJailView();
                    break;
                case "24":
                    this.australiaBridgeView();
                    break;
                case "25":
                    this.russiaSquareView();
                    break;
                case "26":
                    this.russiaLeninView();
                    break;
                case "27":
                    this.russiaCathedralView();
                    break;
                case "V":
                    this.viewMap();
                    break;
                case "M":
                    new MainMenuView().displayMainMenuView();
                    break;
                case "H":
                    new HelpMenuView().displayHelpMenuView();
                    break;
            default:
                System.out.println("Why did you choose an invalid option? Try again!");
                break;
        }
        return false;
    }

    private void usaSnipeView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void usaCongressView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void usaArchView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void germanyBerlinView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void germanyCologneView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void germanyRhineView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void englandBenView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void englandAbbeyView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void englandPalaceView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void englandBuckinghamView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void spainTarragonaView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void spainSevilleView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void spainValenciaView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void franceTowerView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void franceCafeView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void canadaMontrealView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void canadaParlimentView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void canadaCNTowerView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void brazilBeachView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void brazilAmazonView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void brazilSaoPauloView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void australiaOperaView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void australiaJailView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void australiaBridgeView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void russiaSquareView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void russiaLeninView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void russiaCathedralView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

       }

    
    
    
