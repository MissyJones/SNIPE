/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

/**
 *
 * @author Home
 */
public class MentalChallengeControl{
public Boolean mathPuzzleThree(double height, double width, double answer){
 double area= height*width;
 Boolean response;
if (answer <1){
response = false;
}
else if (area != answer){
response= false;}

else { 
response=true;
}
return response;
}
}

    
