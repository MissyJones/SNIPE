/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Challenge;
import byui.cit260.snipe.model.Game;
import byui.cit260.snipe.model.Code;
import byui.cit260.snipe.enums.CodeList;
import byui.cit260.snipe.model.Map;
import byui.cit260.snipe.model.Player;
import static jdk.nashorn.internal.objects.NativeArray.map;
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

        Map map = new Map(3, 9);
        game.setMap(map);

        Code[] item = GameControl.createCodes();
        game.setCodes(item);

        Challenge[] challenges = GameControl.createChallenges();
        game.setChallenges(challenges);

        MapControl.setStartingLocation(map);


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

    private static Code[] createCodes() {
        Code[] codes = new Code[9];

        Code codeOne = new Code();
        codeOne.setItemDescription(CodeList.Code_USA.getDescription());
        codeOne.setOwned(false);
        codes[CodeList.Code_USA.ordinal()] = codeOne;

        Code codeTwo = new Code();
        codeTwo.setItemDescription(CodeList.Code_Germany.getDescription());
        codeTwo.setOwned(false);
        codes[CodeList.Code_Germany.ordinal()] = codeTwo;

        Code codeThree = new Code();
        codeThree.setItemDescription(CodeList.Code_England.getDescription());
        codeThree.setOwned(false);
        codes[CodeList.Code_England.ordinal()] = codeThree;

        Code codeFour = new Code();
        codeFour.setItemDescription(CodeList.Code_Spain.getDescription());
        codeFour.setOwned(false);
        codes[CodeList.Code_Spain.ordinal()] = codeFour;

        Code codeFive = new Code();
        codeFive.setItemDescription(CodeList.Code_France.getDescription());
        codeFive.setOwned(false);
        codes[CodeList.Code_France.ordinal()] = codeFive;

        Code codeSix = new Code();
        codeSix.setItemDescription(CodeList.Code_Canada.getDescription());
        codeSix.setOwned(false);
        codes[CodeList.Code_Canada.ordinal()] = codeSix;

        Code codeSeven = new Code();
        codeSeven.setItemDescription(CodeList.Code_Brazil.getDescription());
        codeSeven.setOwned(false);
        codes[CodeList.Code_Brazil.ordinal()] = codeSeven;

        Code codeEight = new Code();
        codeEight.setItemDescription(CodeList.Code_Austrailia.getDescription());
        codeEight.setOwned(false);
        codes[CodeList.Code_Austrailia.ordinal()] = codeEight;

        Code codeNine = new Code();
        codeNine.setItemDescription(CodeList.Code_Russia.getDescription());
        codeNine.setOwned(false);
        codes[CodeList.Code_Russia.ordinal()] = codeNine;

        return null;
    }

    private static Challenge[] createChallenges() {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        return null;
    }
}
