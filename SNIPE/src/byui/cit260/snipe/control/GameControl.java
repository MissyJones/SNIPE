/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Game;
import byui.cit260.snipe.model.Player;
import java.util.Map;
import snipe.SNIPE;

/**
 *
 * @author Maxwell
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        if (playersName == null) {
            return null;
        }

        Player player = new Player();
        player.setName(playersName);
        player.setCodeName(codeNameGen());

        System.out.println("\n" + playersName + "! Your codename is: " + player.getCodeName() + ". "
                + "\n\n Go get the bad guys, " + player.getCodeName() + "!");

        SNIPE.setPlayer(player);
        return player;
    }

    public static void createNewGame(Player player) {
       Game game = new Game();
       SNIPE.setCurrentGame(game);
       
       game.setPlayer(player);
       
       Map map = MapControl.createMap();
       game.setMap(map);
    }

    public static String codeNameGen() {
        int rand1 = (int) Math.ceil(Math.random() * 5);
        int rand2 = (int) Math.ceil(Math.random() * 5);

        String code1;
        String code2;

        switch (rand1) {
            case 0:
                code1 = "Silent ";
                break;
            case 1:
                code1 = "Deadly ";
                break;
            case 2:
                code1 = "Spectacular ";
                break;
            case 3:
                code1 = "Flying ";
                break;
            case 4:
                code1 = "Steel ";
                break;
            case 5:
                code1 = "Golden ";
                break;
            default:
                code1 = "Broken ";
                break;
        }
        switch (rand2) {
            case 0:
                code2 = "Tiger";
                break;
            case 1:
                code2 = "Possum";
                break;
            case 2:
                code2 = "Scorpion";
                break;
            case 3:
                code2 = "Panda";
                break;
            case 4:
                code2 = "Gun";
                break;
            case 5:
                code2 = "Eagle";
                break;
            default:
                code2 = "Code";
                break;
        }

        String codeName = code1 + code2;

        return codeName;

    }
}
