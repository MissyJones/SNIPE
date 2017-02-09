/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maxwell
 */
public class MentalChallengeControlTest {
    
    public MentalChallengeControlTest() {
    }

    /**
     * Test of mathPuzzleThree method, of class MentalChallengeControl.
     */
    @Test
    public void testMathPuzzleThree() {
        System.out.println("mathPuzzleThree");
        System.out.println("\tTest Case 1");
        double height = 6;
        double width = 3;
        double answer = 0;
        MentalChallengeControl instance = new MentalChallengeControl();
        String expResult = "validation error";
        String result = instance.mathPuzzleThree(height, width, answer);
        assertEquals(expResult, result);

        
        System.out.println("\tTest case 2");
        height = 6;
        width = 3;
        answer = 18;
        expResult = "CONGRATS!";
        result = instance.mathPuzzleThree(height, width, answer);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case 3");
        height = 6;
        width = 3;
        answer = 15;
        expResult = "No script for you!";
        result = instance.mathPuzzleThree(height, width, answer);
        assertEquals(expResult, result);
        
        System.out.println("\tTest case 4");
        height = 6;
        width = 3;
        answer = 73;
        expResult = "No script for you!";
        result = instance.mathPuzzleThree(height, width, answer);
        assertEquals(expResult, result);
    }
    
}
