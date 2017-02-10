/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.PhysChallenge;
import byui.cit260.snipe.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maxwell
 */
public class PhysicalChallengeControlTest {
    
    public PhysicalChallengeControlTest() {
    }

    /**
     * Test of dmgCalc method, of class PhysicalChallengeControl.
     */
    @Test
    public void testDmgCalc() {
        System.out.println("dmgCalc");
        PhysChallenge physChallenge = new PhysChallenge();
        physChallenge.setDescription("You narrowly dodge the bullets, however one gets your leg! You have ");
        Player player = new Player();
        PhysicalChallengeControl instance = new PhysicalChallengeControl();
        String expResult = "";
        String result = instance.dmgCalc(physChallenge, player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
