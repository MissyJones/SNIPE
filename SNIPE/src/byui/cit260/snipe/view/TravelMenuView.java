/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.ChallengeControl;
import byui.cit260.snipe.model.Location;
import byui.cit260.snipe.model.LocationType;
import byui.cit260.snipe.model.Player;
import java.util.Scanner;
import snipe.SNIPE;

/**
 *
 * @author Missy
 */
public class TravelMenuView extends View {

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
                this.changeLocation(SNIPE.getPlayer(), 0);
                break;
            case "2":
                this.changeLocation(SNIPE.getPlayer(), 1);
                break;
            case "3":
                this.changeLocation(SNIPE.getPlayer(), 2);
                break;
            case "4":
                this.changeLocation(SNIPE.getPlayer(), 3);
                break;
            case "5":
                this.changeLocation(SNIPE.getPlayer(), 4);
                break;
            case "6":
                this.changeLocation(SNIPE.getPlayer(), 5);
                break;
            case "7":
                this.changeLocation(SNIPE.getPlayer(), 6);
                break;
            case "8":
                this.changeLocation(SNIPE.getPlayer(), 7);
                break;
            case "9":
                this.changeLocation(SNIPE.getPlayer(), 8);
                break;
            case "10":
                this.changeLocation(SNIPE.getPlayer(), 9);
                break;
            case "11":
                this.changeLocation(SNIPE.getPlayer(), 10);
                break;
            case "12":
                this.changeLocation(SNIPE.getPlayer(), 11);
                break;
            case "13":
                this.changeLocation(SNIPE.getPlayer(), 12);
                break;
            case "14":
                this.changeLocation(SNIPE.getPlayer(), 13);
                break;
            case "15":
                this.changeLocation(SNIPE.getPlayer(), 14);
                break;
            case "16":
                this.changeLocation(SNIPE.getPlayer(), 15);
                break;
            case "17":
                this.changeLocation(SNIPE.getPlayer(), 16);
                break;
            case "18":
                this.changeLocation(SNIPE.getPlayer(), 17);
                break;
            case "19":
                this.changeLocation(SNIPE.getPlayer(), 18);
                break;
            case "20":
                this.changeLocation(SNIPE.getPlayer(), 19);
                break;
            case "21":
                this.changeLocation(SNIPE.getPlayer(), 20);
                break;
            case "22":
                this.changeLocation(SNIPE.getPlayer(), 21);
                break;
            case "23":
                this.changeLocation(SNIPE.getPlayer(), 22);
                break;
            case "24":
                this.changeLocation(SNIPE.getPlayer(), 23);
                break;
            case "25":
                this.changeLocation(SNIPE.getPlayer(), 24);
                break;
            case "26":
                this.changeLocation(SNIPE.getPlayer(), 25);
                break;
            case "27":
                this.changeLocation(SNIPE.getPlayer(), 26);
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
        return true;
    }

    private void changeLocation(Player player, int location) {
        player.setRow(location);
        String[] travelTable = SNIPE.getCurrentGame().getMap().getTravelTable();
        this.console.println(travelTable[location]);
        Location place = SNIPE.getCurrentGame().getMap().getLocations()[location];
        boolean passportStatus = place.getPassportAdd();
        if (passportStatus = false) {
            place.setPassportAdd(true);
        }
        
        if(place.getLocationType() == LocationType.SafeHouse) {
            System.out.println("\nYou made it to a safe house");
        }
    }

}
