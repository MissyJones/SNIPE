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

public class MentalChallengeControl{
public boolean mathPuzzleThree(double height, double width, double answer){
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
public String mathPuzzleOne(double number){
String answer;
    if (number == Math.sqrt(20857489)){
answer = "The door unlocks, enter at your own risk.";
}
else
{
answer = "Think again sucker!";
}
return answer;
    
}   

}

