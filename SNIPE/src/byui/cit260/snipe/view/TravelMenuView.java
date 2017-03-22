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
public class TravelMenuView extends View{

    public TravelMenuView() {
            super("\n*-------------------------------------------*"
                + "\n|                 Travel Menu               |"
                + "\n*-------------------------------------------*"
                + "\n| 1  | USA       |  SNIPE Academy           |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 2  | USA       |  Library of Congress     |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 3  | USA       |  Gateway Arch            |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 4  | Germany   |  Grandenburg Gate        |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 5  | Germany   |  Cologne Cathedral       |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 6  | Germany   |  Rhine River             |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 7  | England   |  Big Ben                 |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 8  | England   |  Westminster Abbey       |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 9  | England   |  Buckingham Palace       |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 10 | Spain     |  Tarragona               |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 11 | Spain     |  Cathedral of Seville    |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 12 | Spain     |  Valencia                |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 13 | France    |  Eiffel Tower            |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 14 | France    |  The Louvre              |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 15 | France    |  A Sidewalk Cafe         |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 16 | Canada    |  Montreal Olympic Stadium|"
                + "\n|----|-----------|--------------------------|"
                + "\n| 17 | Canada    |  Library of Parliment    |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 18 | Canada    |  CN Tower                |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 19 | Brazil    |  Beach, Rio de Janeiro   |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 20 | Brazil    |  Amazon Forest           |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 21 | Brazil    |  Sao Paulo, Capital      |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 22 | Australia |  Sydney Opera House      |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 23 | Australia |  Old Melbourne jail      |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 24 | Australia |  Bridge                  |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 25 | Russia    |  St. Peter's Square      |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 26 | Russia    |  Lenin's Mausoleum       |"
                + "\n|----|-----------|--------------------------|"
                + "\n| 27 | Russia    |  St. Basil's Cathedral   |"
                + "\n*----------------------------*--------------*"
                + "\n|       Other Options        |"
                + "\n|----------------------------|"
                + "\n| V  |   View Map            |"
                + "\n|----|-----------------------|"
                + "\n| M  |   Main Menu           |"
                + "\n|----|-----------------------|"
                + "\n| H  |   Help Menu           |"
                + "\n*----------------------------*"
                + "\n\n");
    }
@Override
    public boolean doAction(String menuOption) {
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

    private void usaSnipeView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void usaCongressView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void usaArchView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void germanyBerlinView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void germanyCologneView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void germanyRhineView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void englandBenView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void englandAbbeyView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void englandPalaceView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void englandBuckinghamView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void spainTarragonaView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void spainSevilleView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void spainValenciaView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void franceTowerView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void franceCafeView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void canadaMontrealView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void canadaParlimentView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void canadaCNTowerView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void brazilBeachView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void brazilAmazonView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void brazilSaoPauloView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void australiaOperaView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void australiaJailView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void australiaBridgeView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void russiaSquareView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void russiaLeninView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void russiaCathedralView() {
        System.out.print("You chose a place! Congrats.");
    }

    private void viewMap() {
        System.out.print("You chose a place! Congrats.");
    }

}
