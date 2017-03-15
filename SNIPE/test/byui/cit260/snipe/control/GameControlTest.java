/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maxwell
 */
public class GameControlTest {

    public GameControlTest() {
    }

    /**
     * Test of createPlayer method, of class GameControl.
     *
     * @Test public void testCreatePlayer() {
     * System.out.println("createPlayer"); String playersName = ""; Player
     * expResult = null; Player result = GameControl.createPlayer(playersName);
     * assertEquals(expResult, result); // TODO review the generated test code
     * and remove the default call to fail. fail("The test case is a
     * prototype."); }
     *
     *
     * Test of createNewGame method, of class GameControl.
     *
     * @Test public void testCreateNewGame() {
     * System.out.println("createNewGame"); Player player = null;
     * GameControl.createNewGame(player); // TODO review the generated test code
     * and remove the default call to fail. fail("The test case is a
     * prototype."); }
     */
    /**
     * Test of codeNameGen method, of class GameControl.
     */
    @Test
    public void testCodeNameGen() {
        System.out.println("codeNameGen");
        String result = GameControl.codeNameGen();
        System.out.println(result);
        if (result == "Broken Code") {
            fail("The test case is a prototype.");
        } else {
            System.out.println("The code works");
        }

    }

}
