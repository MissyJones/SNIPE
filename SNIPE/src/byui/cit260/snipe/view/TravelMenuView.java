/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.model.Player;
import java.util.Scanner;
import snipe.SNIPE;

/**
 *
 * @author Missy
 */
public class TravelMenuView extends View{
        GameMenuView gameMenu;
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
                + "\n| M  |   Main Menu           |"
                + "\n|----|-----------------------|"
                + "\n| H  |   Help Menu           |"
                + "\n*----------------------------*"
                + "\n\n");
        this.gameMenu = new GameMenuView();
    }
@Override
    public boolean doAction(String menuOption) {
        switch (menuOption) {
            case "1":
                this.usaSnipeView(SNIPE.getPlayer());
                break;
            case "2":
                this.usaCongressView(SNIPE.getPlayer());
                break;
            case "3":
                this.usaArchView(SNIPE.getPlayer());
                break;
            case "4":
                this.germanyBerlinView(SNIPE.getPlayer());
                break;
            case "5":
                this.germanyCologneView(SNIPE.getPlayer());
                break;
            case "6":
                this.germanyRhineView(SNIPE.getPlayer());
                break;
            case "7":
                this.englandBenView(SNIPE.getPlayer());
                break;
            case "8":
                this.englandAbbeyView(SNIPE.getPlayer());
                break;
            case "9":
                this.englandPalaceView(SNIPE.getPlayer());
                break;
            case "10":
                this.englandBuckinghamView(SNIPE.getPlayer());
                break;
            case "11":
                this.spainTarragonaView(SNIPE.getPlayer());
                break;
            case "12":
                this.spainSevilleView(SNIPE.getPlayer());
                break;
            case "13":
                this.spainValenciaView(SNIPE.getPlayer());
                break;
            case "14":
                this.franceTowerView(SNIPE.getPlayer());
                break;
            case "15":
                this.franceCafeView(SNIPE.getPlayer());
                break;
            case "16":
                this.canadaMontrealView(SNIPE.getPlayer());
                break;
            case "17":
                this.canadaParlimentView(SNIPE.getPlayer());
                break;
            case "18":
                this.canadaCNTowerView(SNIPE.getPlayer());
                break;
            case "19":
                this.brazilBeachView(SNIPE.getPlayer());
                break;
            case "20":
                this.brazilAmazonView(SNIPE.getPlayer());
                break;
            case "21":
                this.brazilSaoPauloView(SNIPE.getPlayer());
                break;
            case "22":
                this.australiaOperaView(SNIPE.getPlayer());
                break;
            case "23":
                this.australiaJailView(SNIPE.getPlayer());
                break;
            case "24":
                this.australiaBridgeView(SNIPE.getPlayer());
                break;
            case "25":
                this.russiaSquareView(SNIPE.getPlayer());
                break;
            case "26":
                this.russiaLeninView(SNIPE.getPlayer());
                break;
            case "27":
                this.russiaCathedralView(SNIPE.getPlayer());
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

    private void usaSnipeView(Player player) {
        player.setRow(0);
        this.console.println("You traveled to the SNIPE HQ");
        gameMenu.display();
    }
    
    private void usaCongressView(Player player) {
        player.setRow(1);
            this.console.println("You traveled to the US Congress Building");
            gameMenu.display();
            
    }

    private void usaArchView(Player player) {
        player.setRow(2);
        this.console.println("You traveled to the Gateway Arch!");
        gameMenu.display();
    }

    private void germanyBerlinView(Player player) {
        player.setRow(3);
        this.console.println("Ahhhhh Germany. This is Berlin!");
        gameMenu.display();
    }

    private void germanyCologneView(Player player) {
        player.setRow(4);
        this.console.println("You arrived in Cologne. Germany!");
        gameMenu.display();
    }

    private void germanyRhineView(Player player) {
        player.setRow(5);
        this.console.println("Welcome to the Rhine River!");
        gameMenu.display();
    }

    private void englandBenView(Player player) {
        player.setRow(6);
        this.console.println("The most iconic");
        gameMenu.display();
    }

    private void englandAbbeyView(Player player) {
        player.setRow(7);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void englandPalaceView(Player player) {
        player.setRow(8);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void englandBuckinghamView(Player player) {
        player.setRow(9);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void spainTarragonaView(Player player) {
        player.setRow(10);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void spainSevilleView(Player player) {
         player.setRow(11);
         this.console.println("You traveled to the US Congress Building");
         gameMenu.display();
    }

    private void spainValenciaView(Player player) {
        player.setRow(12);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void franceTowerView(Player player) {
         player.setRow(13);
         this.console.println("You traveled to the US Congress Building");
         gameMenu.display();
    }

    private void franceCafeView(Player player) {
        player.setRow(14);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void canadaMontrealView(Player player) {
         player.setRow(15);
         this.console.println("You traveled to the US Congress Building");
         gameMenu.display();
    }

    private void canadaParlimentView(Player player) {
        player.setRow(16);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void canadaCNTowerView(Player player) {
        player.setRow(17);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void brazilBeachView(Player player) {
        player.setRow(18);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void brazilAmazonView(Player player) {
        player.setRow(19);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
        
    }

    private void brazilSaoPauloView(Player player) {
        player.setRow(20);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void australiaOperaView(Player player) {
        player.setRow(21);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void australiaJailView(Player player) {
        player.setRow(22);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
        
    }

    private void australiaBridgeView(Player player) {
         player.setRow(23);
         this.console.println("You traveled to the US Congress Building");
         gameMenu.display();
    }

    private void russiaSquareView(Player player) {
        player.setRow(24);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void russiaLeninView(Player player) {
        player.setRow(25);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }

    private void russiaCathedralView(Player player) {
        player.setRow(26);
        this.console.println("You traveled to the US Congress Building");
        gameMenu.display();
    }


}
