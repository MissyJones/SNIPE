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
        double radius = 8;
        double height1 = 24;
        double number1 = 4825.49;
        String expResult3 = "A compartment opens and you safely retrieve the code.";
        String result3 = instance.mathPuzzleTwo(radius, height, number1);
        assertEquals(expResult3, result3);

        System.out.println("mathPuzzleTwo");
        System.out.println("\tTest Case 2");
        radius = 8;
        height1 = 24;
        number1 = -4825.49;
        expResult3 = "Please enter a positive, rational number, silly!";
        result3 = instance.mathPuzzleTwo(radius, height, number1);
        assertEquals(expResult3, result3);

        System.out.println("mathPuzzleTwo");
        System.out.println("\tTest Case 3");
        radius = 8;
        height1 = 24;
        number1 = 0;
        expResult3 = "Please enter a positive, rational number, silly!";
        result3 = instance.mathPuzzleTwo(radius, height, number1);
        assertEquals(expResult3, result3);

        System.out.println("mathPuzzleTwo");
        System.out.println("\tTest Case 4");
        radius = 8;
        height1 = 24;
        number1 = 4733.33;
        expResult3 = "Oops! You won’t be getting this code!";
        result3 = instance.mathPuzzleTwo(radius, height, number1);
        assertEquals(expResult3, result3);

        System.out.println("mathPuzzleTwo");
        System.out.println("\tTest Case 5");
        radius = 8;
        height1 = 24;
        number1 = 1206.47;
        expResult3 = "Oops! You won’t be getting this code!";
        result3 = instance.mathPuzzleTwo(radius, height, number1);
        assertEquals(expResult3, result3);
    }
}
