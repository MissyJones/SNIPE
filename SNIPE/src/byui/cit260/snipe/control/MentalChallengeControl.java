/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;
import java.io.Serializable;
import java.util.Objects;
import byui.cit260.snipe.model.Game;
/**
 *
 * @author Home
 */
public class MentalChallengeControl{
public String mathPuzzleThree(double height, double width, double answer){
 double area= height*width;
 String response;
if (answer <1){
response="validation error";
}
else if (area != answer){
response= "No script for you!";}

else { 
response="CONGRATS!";
}
return response;
}
}

    
