/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.enums;

import java.io.Serializable;

/**
 *
 * @author Maxwell
 */
public enum ChallengeDescriptionEnum implements Serializable {
    mentalOne("As you gaze at the keypad in front of you, you think of the "
            + "\nnumerous possibilities the code to unlock it could be. You "
            + "\nhave to get into the apartment to find the disk with the code!"
            + "\nBy covertly watching the residents come and go throughout the "
            + "\nday you know that it’s a 4-digit number. Suddenly, a young "
            + "\nteenage boy comes flying around the corner and slams into "
            + "you. \"Hey, don’t be a square!\" he yells as he discreetly "
            + "\nshoves a wad of paper into your hands. He grins and runs off. "
            + "\nYou look down at the crumbled paper; as you unfold it you see "
            + "\nthe number 20,857,489. What could it mean?  What’s up with "
            + "\nthe archaic expression?! What year was it?!? Could it be "
            + "\na clue?"),
    mentalTwo("You have made your way into a storehouse full of kegs, which are "
            + "\nperfect cylinders and are, oddly, filled to the top, looking "
            + "\nfor your code. The keg you need is slightly different from "
            + "\nregular kegs and has been specially weighted to disguise the "
            + "\nfact it has a secret compartment. Since you were your high "
            + "\nschool and college’s math trivia master you know that the "
            + "\nvolume of a regular full-sized keg is 4,770.58 cubic inches. "
            + "\nYou notice a keg that you THINK is different from the rest. "
            + "\nYour eagle-eye tells you the diameter is 16 inches and its "
            + "\nheight is 24 inches. Is this the keg that hold your code? "
            + "\nEnter its volume to find out. Note: You do not need to "
            + "\n include \"cubic inches\" or \"inches^3j\" in your answer."),
    mentalThree("You stand at the Louvre, pondering the Mona Lisa. Has it "
            + "\nalways been this size? If it has been replaced.... Then there "
            + "\nmust be a dossier behind it! You know that the original Mona "
            + "\nLisa had an area of 630 inches^2. Just from looking at it, "
            + "\nyou can tell that this painting (the supposed Mona Lisa) has "
            + "\na height of 24 inches and a width of 16 inches. Is this the "
            + "\nreal Mona Lisa? Input the area to find out. Note: You do not "
            + "\n need to add \"inches squared\" or \"inches^2\". "),
    USARIDDLE("This free-standing world record holding manmade structure is "
            + "\n630 feet (or 192 meters) high and is a monument to the USA’ s "
            + "\nwestern expansion. What is it?"),
    GERMANYRIDDLE("Who said \"Ich bin ein Berliner\" during his speech at the "
            + "\nBrandenburg Gate?"),
    ENGLANDRIDDLE("The official name for this site is the Collegiate Church of "
            + "\nSt Peter at Westminster. What is the more commonly known name?"),
    SPAINRIDDLE("What place is located on the Costa Dorada or Golden Coast, "
            + "\nand is a great site to explore Catalonian history and culture?"),
    FRANCERIDDLE("Who created the famous pyramid outside of the Louvre museum?"),
    CANADARIDDLE("The adventurous, or perhaps foolhardy, can take a walk on "
            + "\nthe outside along the circumference of the roof of this famous "
            + "\nstructure of the Toronto skyline. What structure is this? "),
    BRAZILRIDDLE("This widely known iconic statue stands in Rio de Janeiro. "
            + "]nWhat is it called?"),
    AUSTRALIARIDDLE("What iconic landmark takes up the whole of Bennelong "
            + "\nPoint in Sydney Harbor?"),
    RUSSIARIDDLE("Vladimir Ilyich Ulyanov is entombed at Red Square, and is "
            + "\nbetter known by what name?"),
    physOne(""),
    physTwo(""),
    physThree(""),
    physFour(""),
    physFive(""),
    physSix("");

    private final String description;

    private ChallengeDescriptionEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
