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
            + "\nEnter its volume to find out. Note: just enter the number,"
            + "\nNo units required."),
    mentalThree("You stand at the Louvre, pondering the Mona Lisa. Has it "
            + "\nalways been this size? If it has been replaced.... Then there "
            + "\nmust be a dossier behind it! You know that the original Mona "
            + "\nLisa had an area of 630 inches^2. Just from looking at it, "
            + "\nyou can tell that this painting (the supposed Mona Lisa) has "
            + "\na height of 24 inches and a width of 16 inches. Is this the "
            + "\nreal Mona Lisa? Input the area to find out. Note: just enter "
            + "\nthe number, no units required."),
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
    //physOne(""),
    physOne("As you peruse the books in the Library, you notice a small package attached"
            + "\nto the chandelier. As you notice it, you see a panel open above the chandelier."
            + "\nA masked figure appears in the panel and begins to lower a rope with what looks"
            + "\nlike a magnet attached to it. Do you jump off the balcony onto the chandelier"
            + "\nto try and get the package first? Or do you shoot the figure in the ceiling?"),
    physOneOptionOne("You leap gracefully off the balcony, landing securely on the chandelier."
            + "\nUnfortunately, the chandelier was not designed to handle your weight, and"
            + "\npromptly falls to the ground. You manage to grab the package and jump away"
            + "\nbefore the shards of the shattered chandelier rip you to shreds. You have"
            + "\n managed to obtain the code! As you land, you feel a twist and a pop,"
            + "\nand a pain up your leg."),
    physOneOptionTwo("You take aim and pull the trigger. The man falls out of the hole,"
            + "\nknocking into the chandelier and falling to ground, startling many readers"
            + "\nand causing a small riot. The impact knocked the package loose. It now rests,"
            + "\nslightly crumpled, on the ground next to your fallen enemy. You leap down to"
            + "\nthe first floor, scoop up the package and make your way out the door."
            + "\nRunning over the glass, however has cut up your shoes and feet, making it hard to run."),
    physTwo("You notice you're being followed. It's not even discreet! The two men in"
            + "\nlong black trench coats move between people as if they weren't even there."
            + "\n'Now's probably a good time to run,' you think. Off you dash into the"
            + "\nnearest shop, disrupting the scene around you. Do you hide in the"
            + "\nbathroom, or do you try to find a way out?"),
    physTwoOptionOne("You dash into the bathroom and stand on a toilet, preparing your"
            + "\ngun, just in case. Footsteps come crashing outside the door and fall silent."
            + "\nYou hear shouts. They must be asking where you went. Then the door opens."
            + "\nThe other stall doors are open, so it's pretty obvious where you're hiding."
            + "\nYou leap out to take your pursuers by surprise and manage to subdue both of them."
            + "\nBu not before taking a bullet. Inside the coat pocket of one of your"
            + "\npursuers you find a USB drive. This must be a code!"),
    physTwoOptionTwo("You run out the back of the store, only to find three other guys waiting for you."
            + "\n You pull a sick ninja move and take out all three at once, but the scuffle has called your"
            + "\noriginal tail from inside the store. They manaage to get a shot off before you take care of them."
            + "\nYou find a USB inside one of their pockets. This must be a code."),
    physThree("You notice one of the soldiers glancing at you inconspicuously. This must be the inside man"
            + "\nyou were supposed to meet. You casually walk up and he hands you the code. Just"
            + "\nthen you see a man appear from the shadow. He seems to have noticed your interaction"
            + "\nwith the palace guard. Do you start a fight with the guards as a diversion? Or do you run for it?"),
    physThreeOptionOne("You punch the undercover guard in the face, and then duck out of the way as he"
            + "\ntries to tackle you. He manages to tackle a large man behind you who immediately"
            + "\nbegins to fight back. You take a couple hard hits in the fray, butyou are able"
            + "\nto duck away and escape unseen."),
    physThreeOptionTwo("You break into a dead sprint, away from the suspicoius figure. "
            + "\nTurns out that it wasn't anything, as he did not pursue. But in your hurry, you trip"
            + "\non the steps and break your face. Embarassing. Hope nobody saw that."),
    physFour(""),
    physFourOptionOne(""),
    physFourOptionTwo(""),
    physFive(""),
    physFiveOptionOne(""),
    physFiveOptionTwo(""),
    physSix(""),
    physSixOptionOne(""),
    physSixOptionTwo("");

    private final String description;

    private ChallengeDescriptionEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}


