/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

/**
 *
 * @author Missy
 */

public class MentalChallengeControl {

    public boolean mathPuzzleThree(double height, double width, double answer) {
        double area = height * width;
        Boolean response;
        if (answer < 1) {
            response = false;
        } else if (area != answer) {
            response = false;
        } else {
            response = true;
        }
        return response;
    }

    public String mathPuzzleTwo(double radius, double height1, double number1) {
        double volume = Math.PI * height1 * radius * radius;
        String answer;
        if (number1 <= 0) {
            answer = "Please enter a positive, rational number, silly!";
        } else if (number1 == 4825.49) {
            answer = "A compartment opens and you safely retrieve the code.";
        } else {
            answer = "Oops! You won’t be getting this code!";
        }
        return answer;
    }

    public String mathPuzzleOne(double number) {
        String answer;
        if (number == Math.sqrt(20857489)) {
            answer = "The door unlocks, enter at your own risk.";
        } else {
            answer = "Think again sucker!";
        }
        return answer;

    }

}
