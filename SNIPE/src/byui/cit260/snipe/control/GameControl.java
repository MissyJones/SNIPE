/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.enums.ChallengeDescriptionEnum;
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
        String codeName = GameControl.codeNameGen();
        player.setCodeName(codeName);
        game.setPlayer(player);
        
        Code[] item = createCodes();
        game.setCodes(item);

        Challenge[] challenge = createChallenges();
        game.setChallenges(challenge);
        
        Map map = new Map(26, challenge);
        game.setMap(map);

        


        
        System.out.println("A busy office sits before you. \"Agent " + codeName + ". Your first assignment is as"
                + "\nfollows.\" Says a woman in dark suit, \"You must recover parts to a secret code. The code goes to a lock box found within this"
                + "\nbuilding. You must open the box. The safety of he country depends on it!\" You get the feeling"
                + "\n that you should travel to another area to look for the codes."
                + "\n\"You will undergo challenges that will strain you physically and mentally. If you become too tired or hurt,"
                + "\n find your way to one of our safe houses. If you can answer the question correctly, you can enter and rest. "
                + "\nThere will be a code in each country. Good luck!\"");
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

        return codes;
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
        } catch (Exception ex) {
            throw new GameControlException(ex.getMessage());
        }
        SNIPE.setCurrentGame(game);
    }

    public static Challenge[] createChallenges() {
        Challenge[] challenges = new Challenge[10];

        Challenge mentalOne = new Challenge();
        mentalOne.setDescription(ChallengeDescriptionEnum.mentalOne.getDescription());
        mentalOne.setChoiceOne(null);
        mentalOne.setChoiceTwo(null);
        mentalOne.setUsedFlag(false);
        mentalOne.setCode(SNIPE.getCurrentGame().getCodes()[0]);
        mentalOne.setType(1);
        challenges[0] = mentalOne;

        Challenge mentalTwo = new Challenge();
        mentalTwo.setDescription(ChallengeDescriptionEnum.mentalTwo.getDescription());
        mentalTwo.setChoiceOne(null);
        mentalTwo.setChoiceTwo(null);
        mentalTwo.setUsedFlag(false);
        mentalTwo.setCode(SNIPE.getCurrentGame().getCodes()[1]);
        mentalTwo.setType(2);
        challenges[1] = mentalTwo;

        Challenge mentalThree = new Challenge();
        mentalThree.setDescription(ChallengeDescriptionEnum.mentalThree.getDescription());
        mentalThree.setChoiceOne(null);
        mentalThree.setChoiceTwo(null);
        mentalThree.setUsedFlag(false);
        mentalThree.setCode(SNIPE.getCurrentGame().getCodes()[2]);
        mentalThree.setType(3);
        challenges[2] = mentalThree;

        Challenge physOne = new Challenge();
        physOne.setDescription(ChallengeDescriptionEnum.physOne.getDescription());
        physOne.setChoiceOne(ChallengeDescriptionEnum.physOneOptionOne.getDescription());
        physOne.setChoiceTwo(ChallengeDescriptionEnum.physOneOptionTwo.getDescription());
        physOne.setUsedFlag(false);
        physOne.setCode(SNIPE.getCurrentGame().getCodes()[3]);
        physOne.setType(4);
        challenges[3] = physOne;

        Challenge physTwo = new Challenge();
        physTwo.setDescription(ChallengeDescriptionEnum.physTwo.getDescription());
        physTwo.setChoiceOne(ChallengeDescriptionEnum.physTwoOptionOne.getDescription());
        physTwo.setChoiceTwo(ChallengeDescriptionEnum.physTwoOptionTwo.getDescription());
        physTwo.setUsedFlag(false);
        physTwo.setCode(SNIPE.getCurrentGame().getCodes()[4]);
        physTwo.setType(4);
        challenges[4] = physTwo;

        Challenge physThree = new Challenge();
        physThree.setDescription(ChallengeDescriptionEnum.physThree.getDescription());
        physThree.setChoiceOne(ChallengeDescriptionEnum.physThreeOptionOne.getDescription());
        physThree.setChoiceTwo(ChallengeDescriptionEnum.physThreeOptionTwo.getDescription());
        physThree.setUsedFlag(false);
        physThree.setCode(SNIPE.getCurrentGame().getCodes()[5]);
        physThree.setType(4);
        challenges[5] = physThree;

        Challenge physFour = new Challenge();
        physFour.setDescription(ChallengeDescriptionEnum.physFour.getDescription());
        physFour.setChoiceOne(ChallengeDescriptionEnum.physFourOptionOne.getDescription());
        physFour.setChoiceTwo(ChallengeDescriptionEnum.physFourOptionTwo.getDescription());
        physFour.setUsedFlag(false);
        physFour.setCode(SNIPE.getCurrentGame().getCodes()[6]);
        physFour.setType(4);
        challenges[6] = physFour;

        Challenge physFive = new Challenge();
        physFive.setDescription(ChallengeDescriptionEnum.physFive.getDescription());
        physFive.setChoiceOne(ChallengeDescriptionEnum.physFiveOptionOne.getDescription());
        physFive.setChoiceTwo(ChallengeDescriptionEnum.physFiveOptionTwo.getDescription());
        physFive.setUsedFlag(false);
        physFive.setCode(SNIPE.getCurrentGame().getCodes()[7]);
        physFive.setType(4);
        challenges[7] = physFive;

        Challenge physSix = new Challenge();
        physSix.setDescription(ChallengeDescriptionEnum.physSix.getDescription());
        physSix.setChoiceOne(ChallengeDescriptionEnum.physSixOptionOne.getDescription());
        physSix.setChoiceTwo(ChallengeDescriptionEnum.physSixOptionTwo.getDescription());
        physSix.setUsedFlag(false);
        physSix.setCode(SNIPE.getCurrentGame().getCodes()[8]);
        physSix.setType(4);
        challenges[8] = physSix;

        Challenge space = new Challenge();
        space.setDescription("");
        space.setChoiceOne("");
        space.setChoiceTwo("");
        space.setUsedFlag(true);
        space.setCode(null);
        space.setType(0);
        challenges[9] = space;
        
        return challenges;
    }
}
