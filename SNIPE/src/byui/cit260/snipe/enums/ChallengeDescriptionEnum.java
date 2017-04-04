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
    mentalOne("Behind the wall art in the hotel room next to yours, you find a safe and a key pad."
            + "\nThey don't always make your job easy, but when they"
            + "\ndo, they really do. As you gaze at it, you think of the "
            + "\nnumerous possibilities the code to unlock it could be. You "
            + "\nhave to get into the safe to find the the code!"
            + "\nBy covertly watching the residents come and go throughout the "
            + "\nday you know that it’s a 4-digit number. Suddenly, a rock "
            + "\ncomes flying through the window and slams into "
            + "you. \"Hey, don’t be a square!\" you hear, immediately after the initial crash. "
            + "\nA wad of paper is attached to the stone that just entered the room. "
            + "\nYou look down at the crumbled paper; as you unfold it you see "
            + "\nthe number 20,857,489. What could it mean?  What’s up with "
            + "\nthe strange yell you heard?! Could it be a clue?"),
    mentalTwo("You have made your way into a storehouse full of kegs, which are "
            + "\nperfect cylinders and are, oddly, filled to the top;you're looking "
            + "\nfor your code. The keg you need is slightly different from "
            + "\nregular kegs and has been specially weighted to disguise the "
            + "\nfact it has a secret compartment. Since you were your high "
            + "\nschool and college’s math trivia master, you know that the "
            + "\nvolume of a regular full-sized keg is 4,770.58 cubic inches. "
            + "\nYou notice a keg that you THINK is different from the rest. "
            + "\nYour eagle-eye tells you the diameter is 16 inches and its "
            + "\nheight is 24 inches. Is this the keg that holds your code? "
            + "\nEnter its volume to find out. Note: Note: just enter your "
            + "\nresponse out to two decimal places. No units required."),
    mentalThree("You stand at the Louvre, pondering the Mona Lisa. Has it "
            + "\nalways been this size? If it has been replaced.... Then there "
            + "\nmust be a dossier behind it! You know that the original Mona "
            + "\nLisa had an area of 630 inches^2. Just from looking at it, "
            + "\nyou can tell that this painting (the 'supposed' Mona Lisa) has "
            + "\na height of 24 inches and a width of 16 inches. Is this the "
            + "\nreal Mona Lisa? Input the area of the painting to find out. Note: just enter "
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
            + "\nWhat is it called?"),
    AUSTRALIARIDDLE("What iconic landmark takes up the whole of Bennelong "
            + "\nPoint in Sydney Harbor?"),
    RUSSIARIDDLE("Vladimir Ilyich Ulyanov is entombed at Red Square, and is "
            + "\nbetter known by what name?"),
    //physOne(""),
    physOne("As you peruse the books in the Library, you notice a small package attached"
            + "\nto the chandelier. As you notice it, you see a panel open above the chandelier."
            + "\nA masked figure appears in the panel and begins to lower a rope with what looks"
            + "\nlike a magnet attached to it. Do you jump off the balcony onto the chandelier"
            + "\nto try and get the package first? Or do you shoot the figure in the ceiling?"
            + "\n\n*-----------------------------------*"
            + "\n|       What do you want to do?     |"
            + "\n*-----------------------------------*"
            + "\n|   O   |         Option One        |"
            + "\n|-----------------------------------*"
            + "\n|   T   |         Option Two        |"
            + "\n*-----------------------------------*"),
    physOneOptionOne("You leap gracefully off the balcony, landing securely on the chandelier."
            + "\nUnfortunately, the chandelier was not designed to handle your weight and"
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
            + "\nbathroom, or do you try to find a way out?"
            + "\n\n*-----------------------------------*"
            + "\n|       What do you want to do?     |"
            + "\n*-----------------------------------*"
            + "\n|   O   |         Option One        |"
            + "\n|-----------------------------------*"
            + "\n|   T   |         Option Two        |"
            + "\n*-----------------------------------*"),
    physTwoOptionOne("You dash into the bathroom and stand on a toilet, preparing your"
            + "\ngun, just in case. Footsteps come crashing outside the door and fall silent."
            + "\nYou hear shouts. They must be asking where you went. Then the door opens."
            + "\nThe other stall doors are open, so it's pretty obvious where you're hiding."
            + "\nYou leap out to take your pursuers by surprise and manage to subdue both of them."
            + "\nBut not before taking a bullet. Inside the coat pocket of one of your"
            + "\npursuers you find a USB drive. This must be a code!"),
    physTwoOptionTwo("You run out the back of the store, only to find three other guys waiting for you."
            + "\n You pull a sick ninja move and take out all three at once, but the scuffle has called your"
            + "\noriginal tail from inside the store. They manage to get a shot off before you take care of them."
            + "\nYou find a USB inside one of their pockets. This must be a code."),
    physThree("You notice one of the soldiers glancing at you inconspicuously. This must be the inside man"
            + "\nyou were supposed to meet. You casually walk up and he hands you the code. Just"
            + "\nthen you see a man appear from the shadow. He seems to have noticed your interaction"
            + "\nwith the palace guard. Do you start a fight with the guards as a diversion? Or do you run for it?"
            + "\n\n*-----------------------------------*"
            + "\n|       What do you want to do?     |"
            + "\n*-----------------------------------*"
            + "\n|   O   |         Option One        |"
            + "\n|-----------------------------------*"
            + "\n|   T   |         Option Two        |"
            + "\n*-----------------------------------*"),
    physThreeOptionOne("You punch the undercover guard in the face, and then duck out of the way as he"
            + "\ntries to tackle you. He manages to tackle a large man behind you who immediately"
            + "\nbegins to fight back. You take a couple hard hits in the fray, but you are able"
            + "\nto duck away and escape unseen."),
    physThreeOptionTwo("You break into a dead sprint, away from the suspicoius figure. "
            + "\nTurns out that it wasn't anything, as he did not pursue. But in your hurry, you trip"
            + "\non the steps and break your face. Embarassing. Hope nobody saw that."),
    physFour("Raindrops begin to speckle the window of your cab as the driver pulls up to the curb next"
            + "\nto your stop. You yell to the cabby 'Yo Homes, smell ya later!'"
            + "\nas you throw some money through the window. Just as you turn toward the curb, an old lady"
            + "\non a ten speed slams into you....hard. Your wallet flys out of your hands. Before you know"
            + "\nwhat's happening, a black SUV drives up and throws open the door. Granny grabs your wallet and"
            + "\ndives into the vechicle as it peels away with a screech. All your IDs, your money, your"
            + "\ncredit cards are in that wallet! You turn back to the cabbie, 'Wanna lift?'"
            + "\nhe yells. That's when you notice the Aston Martin One-77 on the other side"
            + "\nof the street. Coinsidence? I think...uh..hope not! You consider your"
            + "\noptions. Do you jump in the cab or jack the Aston Martin?"
            + "\n\n*-----------------------------------*"
            + "\n|       What do you want to do?     |"
            + "\n*-----------------------------------*"
            + "\n|   O   |         Option One        |"
            + "\n|-----------------------------------*"
            + "\n|   T   |         Option Two        |"
            + "\n*-----------------------------------*"),
    physFourOptionOne("You shake your head with a laugh at the thought. This isn't Grand Theft Auto."
            + "\nYou jump in the cab and the cabbie floors it.'This guy is "
            + "\ngooooood', you think as you tail Betty White. Then, without warning, the SUV"
            + "\nspins around and starts driving right at you. 'You wanna GO?!' the cabbie yells."
            + "\nJust in time the SUV swerves around the cab and throws something through the"
            + "\nwindow. A grenade?! No...a wig? Tied to a piece of curly, white hair is"
            + "\nthe wallet, a USB now inside. Your next clue?"),
    physFourOptionTwo("Is this even a choice? You jump in the Aston Martin and hot wire that"
            + "\nnbaby. Within seconds you are on Grandy's tail. You drive up"
            + "\nnext to her and steer right into the SUV. You both swerve all over the road."
            + "\nWith a spin the SUV stops suddenly and something flys from the "
            + "\nopen window. A dead animal? No, a wig rolled up in supportive hosiery."
            + "\nIn the center is your wallet and an USB drive."),
    physFive("You are starvin' like marvin. You run into a nearby restraunt for a quick"
            + "\nsnack. The sign says Italian. You're hoping for pizza, but when the waiter"
            + "\nappears with your order you wonder if they misunderstood your poor"
            + "\nattempt at the language. There might be dough and cheese under that grease,"
            + "\nit's pretty hard to say. You stalk back to the kitchen to have a"
            + "\nword with the chef. 'What is this....?' you start to demand. No one is there."
            + "\nThen you notice the ticking. You look around quickly. Is it coming"
            + "\nfrom the oven? You open the oven door and discover a ticking time bomb, counting down."
            + "\nThere are two wires one red one blue. Which do you cut?"
            + "\n\n*-----------------------------------*"
            + "\n|       What do you want to do?     |"
            + "\n*-----------------------------------*"
            + "\n|   O   |         Option One        |"
            + "\n|-----------------------------------*"
            + "\n|   T   |         Option Two        |"
            + "\n*-----------------------------------*"),
    physFiveOptionOne("You grab the butcher knife and slash through the blue wire. The timer stops and a"
            + "\nsmall compartment opens with a slight hiss. Inside is a USB drive."),
    physFiveOptionTwo("You grab the butcher knife and slice through the red wire. The timer starts"
            + "\ngoing faster! You run to the front of the restaurant yelling"
            + "\n'RUN!'but no one is there. You keep running out the front door. As you cross"
            + "\nthe street you hear the explosion,dust and debris cloud the air"
            + "\nand a small, silver container lands at your feet. Could there be a USB"
            + "\ndrive inside? You glance back at the destroyed building. 'Not really a loss'"
            + "\nyou think as you flee the scene."),
    physSix("The ring tone on your phone wakes you in the middle of the night 'Ah..Ah..Ah..Ah.."
            + "\nstayin' alive, stayin' alive' You grab for it and answer."
            + "\nA cool female voice replys 'Meet me in the vault of the local bank in 10 mintues.'"
            + "\nThe line goes dead. You reach the building, silently cut a"
            + "\nhole in the glass and then slip inside. A woman dressed in black waits"
            + "\nfor you at the entrance a long hallway leading the the vault. She"
            + "\nintroduces herself as agent Blue Steel and explains that the next code is"
            + "\nlocated inside the vault. She sprays something into the hallway"
            + "\nuntil it is filled with the vapor, and you now see a laser maze before you."
            + "\n'I have already opened the vault for you' she explains,'You just have to choose. Go down"
            + "\nthe hallway or through the vents?' She points to the open vent above you. Which do you choose?"
            + "\n\n*-----------------------------------*"
            + "\n|       What do you want to do?     |"
            + "\n*-----------------------------------*"
            + "\n|   O   |         Option One        |"
            + "\n|-----------------------------------*"
            + "\n|   T   |         Option Two        |"
            + "\n*-----------------------------------*"),
    physSixOptionOne("You're very grateful for your training in power yoga. You decide to"
            + "\ntry the laser hallway. After rolling, bending, stooping and jumping over"
            + "\nseveral high powered lasers you make it through the corridor an into the"
            + "\nvault where the USB is waiting. Is that the smell of victory or singed hair?"),
    physSixOptionTwo("You're very grateful for your training in power yoga. You jump up"
            + "\nand grab the open mouth of the vent and pull yourself in. The south beach diet your"
            + "\nspouse is forcing you to try may have its benfits. Trying to ignore the"
            + "\nlarge family of cockroaches, you squeeze and scoot your way through the small"
            + "\ncrawlways until you finally find a vent underneath you that drops down"
            + "\nto the vault. The next USB is now yours.");
    ;

    private final String description;

    private ChallengeDescriptionEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
