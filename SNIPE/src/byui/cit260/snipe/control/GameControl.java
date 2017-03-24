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
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import byui.cit260.snipe.exceptions.GameControlException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
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


        MapControl.setStartingLocation(map, player);

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
        codes[CodeList.Code_USA.ordinal()] = codeOne;

        Code codeTwo = new Code();
        codeTwo.setItemDescription(CodeList.Code_Germany.getDescription());
        codes[CodeList.Code_Germany.ordinal()] = codeTwo;

        Code codeThree = new Code();
        codeThree.setItemDescription(CodeList.Code_England.getDescription());
        codes[CodeList.Code_England.ordinal()] = codeThree;

        Code codeFour = new Code();
        codeFour.setItemDescription(CodeList.Code_Spain.getDescription());
        codes[CodeList.Code_Spain.ordinal()] = codeFour;

        Code codeFive = new Code();
        codeFive.setItemDescription(CodeList.Code_France.getDescription());
        codes[CodeList.Code_France.ordinal()] = codeFive;

        Code codeSix = new Code();
        codeSix.setItemDescription(CodeList.Code_Canada.getDescription());
        codes[CodeList.Code_Canada.ordinal()] = codeSix;

        Code codeSeven = new Code();
        codeSeven.setItemDescription(CodeList.Code_Brazil.getDescription());
        codes[CodeList.Code_Brazil.ordinal()] = codeSeven;

        Code codeEight = new Code();
        codeEight.setItemDescription(CodeList.Code_Austrailia.getDescription());
        codes[CodeList.Code_Austrailia.ordinal()] = codeEight;

        Code codeNine = new Code();
        codeNine.setItemDescription(CodeList.Code_Russia.getDescription());
        codes[CodeList.Code_Russia.ordinal()] = codeNine;

        return null;
    }



    public static void saveGame(Game game, String filePath) throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
            
        }
        
        
    }

    public static void loadGame(String filePath) throws GameControlException {
        Game game = null;
        
        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }catch (Exception ex) {
            throw new GameControlException(ex.getMessage());
        }
        SNIPE.setCurrentGame(game);
    }
}
