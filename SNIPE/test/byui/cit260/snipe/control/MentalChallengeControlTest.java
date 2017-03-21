/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maxwell
 */
public class MentalChallengeControlTest {

    private double delta;

    public MentalChallengeControlTest() {
    }

    /**
     * Test of mathPuzzleThree method, of class ChallengeControl.
     */
    @Test
    public void testMathPuzzleThree() {
        System.out.println("mathPuzzleThree");
        System.out.println("\tTest Case 1");
        double height = 6;
        double width = 3;
        double answer = 0;
        ChallengeControl instance = new ChallengeControl();
        Boolean expResult = false;
        Boolean result = instance.mathPuzzleThree(height, width, answer);
        assertEquals(expResult, result);

        System.out.println("\tTest case 2");
        height = 6;
        width = 3;
        answer = 18;
        expResult = true;
        result = instance.mathPuzzleThree(height, width, answer);
        assertEquals(expResult, result);

        System.out.println("\tTest case 3");
        height = 6;
        width = 3;
        answer = 15;
        expResult = false;
        result = instance.mathPuzzleThree(height, width, answer);
        assertEquals(expResult, result);

        System.out.println("\tTest case 4");
        height = 6;
        width = 3;
        answer = 73;
        expResult = false;
        result = instance.mathPuzzleThree(height, width, answer);
        assertEquals(expResult, result);

        System.out.println("mathPuzzleOne");
        System.out.println("\tTest Case 1");
        double number = 12032084;
        String expResult2 = "Think again sucker!";
        String result2 = instance.mathPuzzleOne(number);
        assertEquals(expResult2, result2);

        System.out.println("mathPuzzleOne");
        System.out.println("\tTest Case 2");
        number = 4567;
        expResult2 = "The door unlocks, enter at your own risk.";
        result2 = instance.mathPuzzleOne(number);
        assertEquals(expResult2, result2);

        System.out.println("mathPuzzleTwo");
        System.out.println("\tTest Case 1");
        int radius = 8;
        int height1 = 24;
        int answer1 = (int) 4825.49;
        int expResult3 = 0;
        int result3 = (int) instance.mathPuzzleTwo(radius, height1, answer1);
        assertEquals(expResult3, result3);

        System.out.println("mathPuzzleTwo");
        System.out.println("\tTest Case 2");
        radius = 8;
        height1 = 24;
        answer1 = (int) -4825.49;
        expResult3 = -1;
        result3 = (int) instance.mathPuzzleTwo(radius, height1, answer1);
        assertEquals(expResult3, result3);
        
        System.out.println("mathPuzzleTwo");
        System.out.println("\tTest Case 3");
        radius = 8;
        height1 = 24;
        answer1 = 0;
        expResult3 = -1;
        result3 = (int) instance.mathPuzzleTwo(radius, height1, answer1);
        assertEquals(expResult3, result3);

        System.out.println("mathPuzzleTwo");
        System.out.println("\tTest Case 4");
        radius = 8;
        height1 = 24;
        answer1 = (int) 4733.33;
        expResult3 = -1;
        result3 = (int) instance.mathPuzzleTwo(radius, height1, answer1);
        assertEquals(expResult3, result3);

        System.out.println("mathPuzzleTwo");
        System.out.println("\tTest Case 5");
        radius = 8;
        height1 = 24;
        answer1 = (int) 1206.47;
        expResult3 = -1;
        result3 = (int) instance.mathPuzzleTwo(radius, height1, answer1);
        assertEquals(expResult3, result3);
    }
}
