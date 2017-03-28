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
        this.console.println("You traveled to the SNIPE HQ. Welcome. We would tell "
                + "you where it is, but then we'd have to kill you.");
        gameMenu.display();
    }
    
    private void usaCongressView(Player player) {
        player.setRow(1);
            this.console.println("You've made it to the Library of congress, "
            + "the research library that officially serves the United "
            + "\nStates Congress and is the de facto national library of the "
            + "\nUnited States.");
            gameMenu.display();
            
    }

    private void usaArchView(Player player) {
        player.setRow(2);
        this.console.println("You traveled to the Gateway Arch! Gateway Arch is the "
            + "\nworld's tallest arch,the tallest man-made monument in "
            + "\nthe Western Hemisphere,and Missouri's tallest accessible"
            + "\nbuilding.");
        gameMenu.display();
    }

    private void germanyBerlinView(Player player) {
        player.setRow(3);
        this.console.println("Ahhhhh Germany. This is Berlin! You're at the "
                + "\nBradenburg Gate, an 18th-century neoclassical monument in"
                + " Berlin, and one of the best-known landmarks of Germany.");
        gameMenu.display();
    }

    private void germanyCologneView(Player player) {
        player.setRow(4);
        this.console.println("Guten tag! You arrived in Cologne,Germany! Right "
                + "\nin front of you is the Colonge Cathedral. A renowned monument "
                + "\nof German Catholicism and Gothic architecture and was declared "
                + "\na World Heritage Site in 1996.");
        gameMenu.display();
    }

    private void germanyRhineView(Player player) {
        player.setRow(5);
        this.console.println("Welcome to the Rhine River! The Rhine begins in the"
                + " Swiss Alps,then flows through the Rhineland and eventually "
                + "empties into the North Sea in the Netherlands.");
        gameMenu.display();
    }

    private void englandBenView(Player player) {
        player.setRow(6);
        this.console.println("You've made it to Enland! Big Ben, the Great Bell of "
                + "the clock at the north end of the Palace of Westminster in London,"
                + "is right in front of you.");
        gameMenu.display();
    }

    private void englandAbbeyView(Player player) {
        player.setRow(7);
        this.console.println("Now you have arrived at Westminster Abbey. This is "
            + "\none of the United Kingdom's most notable religious buildings and the"
            + "\ntraditional place of coronation and burial "
            + "\nsite for English and, later, British monarchs.");
        gameMenu.display();
    }

    private void englandPalaceView(Player player) {
        player.setRow(8);
        this.console.println("You stand in awe of Buckingham Palace, the London "
             + "\nresidence and administrative headquarters of the reigning monarch "
             + "\nof the United Kingdom. God save your mom!");
        gameMenu.display();
    }

    private void spainTarragonaView(Player player) {
        player.setRow(9);
        this.console.println("You're now in Tarragona, Spain, a port city located "
            + "\nin northeast Spain on the Costa Daurada by the Mediterranean Sea.");
        gameMenu.display();
    }

    private void spainSevilleView(Player player) {
         player.setRow(10);
         this.console.println("You have arrived at the Cathedral Seville. This "
                 + "is the largest Gothic cathedral and the third-largest church"
                 + " in the world.");
         gameMenu.display();
    }

    private void spainValenciaView(Player player) {
        player.setRow(11);
        this.console.println("Welcome to Valencia, the capital of the autonomous"
                + "\ncommunity of Valencia and the third largest city in Spain "
                + "\nafter Madrid and Barcelona");
        gameMenu.display();
    }

    private void franceTowerView(Player player) {
         player.setRow(12);
         this.console.println("You look up and know immedaitely where you are now"
            + "\nInitially criticized by some of France's leading artists and "
            + "\nintellectuals for its design, the Eifle Tower has become a global "
            + "\ncultural icon of France.");
         gameMenu.display();
    }
    
    private void franceLouvreView(Player player){
        player.setRow(13);
        this.console.println("Welcome to the Lourve. It's the world's largest"
                + " museum and a historic monument in Paris,");
        gameMenu.display();
    }

    private void franceCafeView(Player player) {
        player.setRow(14);
        this.console.println("Hungry? You're now at The Café de Flore, one of the "
                + "oldest coffeehouses in Paris.");
        gameMenu.display();
    }

    private void canadaMontrealView(Player player) {
         player.setRow(15);
         this.console.println("Welcome to Canada! You're at Olympic Stadium,"
                 + " built in the mid-1970s as the main venue for the 1976 "
                 + "Summer Olympics." );
         gameMenu.display();
    }

    private void canadaParlimentView(Player player) {
        player.setRow(16);
        this.console.println("Now you've made it to the Canada Parliment. It's "
            + "the main information repository and research resource for the "
            + "Parliament of Canada. ");
        gameMenu.display();
    }

    private void canadaCNTowerView(Player player) {
        player.setRow(17);
        this.console.println("Look up! You're at the Cn Tower. Located in Toronto "
                + "Canada, it's the third tallest tower in the world and remains "
                + "the tallest free-standing structure in the Western Hemisphere.");
        gameMenu.display();
    }

    private void brazilBeachView(Player player) {
        player.setRow(18);
        this.console.println("One of the most visited cities in the Southern Hemisphere"
            + " and is known for Carnival, samba, bossa nova, and balneario beaches.");
        gameMenu.display();
    }

    private void brazilAmazonView(Player player) {
        player.setRow(19);
        this.console.println("Humid? You're in a rain forrest. The Amazon "
            + "represents over half of the planet's remaining rainforests,& "
            + "comprises the largest and most biodiverse tract of tropical "
            + "rainforest in the world.");
        gameMenu.display();
        
    }

    private void brazilSaoPauloView(Player player) {
        player.setRow(20);
        this.console.println("You've arrived in SauPaulo, Brazil. The metropolis "
            + "is an alpha global city & is the most populous city in Brazil, "
            + "the Americas, and in the Southern Hemisphere");
        gameMenu.display();
    }

    private void australiaOperaView(Player player) {
        player.setRow(21);
        this.console.println("Do you hear music? You're in Australia Mate! Welcome"
                + " to the Australia Opera House, a multi-venue performing arts "
                + "centre. It is one of the 20th century's most famous & "
                + "distinctive buildings");
        gameMenu.display();
    }

    private void australiaJailView(Player player) {
        player.setRow(22);
        this.console.println("Feel a sudden chill? You're in the Melbourne jail, "
                + "or Gaol. It was built in the mid-1800s to hold dangerous "
                + "criminals, petty offenders, the homeless and the mentally ill."
                + "Now it's empty....well, of the living.");
        gameMenu.display();
        
    }

    private void australiaBridgeView(Player player) {
         player.setRow(23);
         this.console.println("You see a long bridge.");
         gameMenu.display();
    }

    private void russiaSquareView(Player player) {
        player.setRow(24);
        this.console.println("Welcome to Russia! You're now in St. Peters Square. "
                + "Between 1713–1728 and 1732–1918, Saint Petersburg was the "
                + "capital of imperial Russia. In 1918, the central government "
                + "bodies moved to Moscow.");
        gameMenu.display();
    }

    private void russiaLeninView(Player player) {
        player.setRow(25);
        this.console.println("Ready for something a little more lively? Sorry, "
                + "you've made it to Lenin's Mausoleum. Lenin's Mausoleum "
                + "Currently serves as the resting place of Vladimir Lenin. "
                + "His preserved body has been on public display there since "
                + "shortly after his death in 1924.");
        gameMenu.display();
    }

    private void russiaCathedralView(Player player) {
        player.setRow(26);
        this.console.println("Now you're at St.Basil's Cathedral. Built from"
                + " 1555–61 on orders from Ivan the Terrible, it commemorates the"
                + " capture of Kazan and Astrakhan.");
        gameMenu.display();
    }


}
