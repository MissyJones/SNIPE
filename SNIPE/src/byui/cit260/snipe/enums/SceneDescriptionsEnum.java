/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.enums;

import byui.cit260.snipe.exceptions.LocationException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.Writer;

/**
 *
 * @author Home
 */
public enum SceneDescriptionsEnum implements Serializable {
    SNIPE_HQ("\nYou enter a pristine office"),
    Lib_Of_Congress("\nYour in a circular room lined with bookshelves."),
    Gateway_Arch("\n A simple, silver arch fills the skyline in front of you."),
    Bradenburg_gate("\n You see a large monument lined with pillars. At the top"
            + "\n is a statue of a godess with a chariot and 4 horses."),
    Cologne_Cathedral("You're inside a large sanctuary with stained glass windows"
            + "\nand craved wood benches down a narrow aisle."),
    Rhine_river("There is a beautiful river with rolling green hills on each side."
            + "\nIn the distance is the silohette of a ancient castle."),
    Large_Ben(" A red double decker bus speeds by as you cross the street and look"
            + "\nup at an enormous clock tower."),
    Westminster_Abbey("Your footsteps echo as you walk down a dark corridor of an "
            + "\nantiquated abbey."),
    Buckingham_palace("A line of soldiers wearing red coats, black pants and tall"
            + "\nblack hats passes by as you gaze at an enornous white palace."),
    Tarragona("An almost endless beach of sparkling white sand stretches out on"
            + "\neither side and slopes into gorgeous blue ocean. "),
    Cathedral_Seville("Palm trees flank the most enormous, gothic cathedral you've"
            + "\never seen."),
    Valencia("You walk towards a beautiful sprawling city on the edge of a deep"
            + "\nblue sea."),
    Eiffel_tower("One of the worlds most iconic structures towers over you."),
    The_Louvre("Light streams through the glasses ceiling above you as you stroll"
            + "\ndown a hallway lined with works of priceless art."),
    Some_Cafe("A quaint white awnig over shadows several small circular tables "
            + "\ndown the walk way. The smell of fresh baked baguettes fills the air."),
    Olympic_Stadium("Ah! Montreal, Canada, eh? B. C. D... Traffic is moving "
            + "\nsmoothly throughout Parc olympique de Montreal, otherwise "
	    + "\nknown as Olympic Park. Pedestrians go in and out of the"
	    + "\n local businesses, roam around the park, and so forth. "
	    + "\nYou are in line at the Olympic Stadium, known to the locals"
	    + "\nas the \"Big O\" because of its shape or the \"big owe\" due"
	    + "\nthe cost to buid it. The stadium became a multipurpose venue"
	    + "\nafter the Montreal Expos became the Washington Nationals. You"
	    + "\nare in a line of chatty people as you wait to get in for the"
	    + "\nMonster Spectacular; that is your cover story anyway. A contact"
	    + "\nhas indicated there is a woman who may have what you need. "
	    + "\nHowever, can you trust her? Is she really one of us? Maybe"
	    + "\nMaybe she works for \"them\"? Or maybe she's a double spy or"
	    + "\nor an assain. You see a woman who looks like who you need"
	    + "\nmeet, she is even wearing the odd clothing described to you."
	    + "\nBut then suddenly, you see two more women who als resemble the"
	    + "\nwoman, and they too are dressed in the same odd manor. Who is"
	    + "\nthe real contact? Can you trust any of them?"),
    Lib_Parliment("You have arrived at Ontario. You make your way to the Library"
            + "\nnof Parliment. Your next mission awaits you, eh? B. C. D..."
            + "\nBefore entering the main repository, you take in the view from"
            + "\narliment Hill, then carefully make your way to the Centre"
            + "\nBlock. It is odd to see this gothic building surrounded by"
            + "\nbuildings from an entirely different era, but you must not"
            + "\ndelay staring your mission now. Carefully you go into the "
            + "\nlibrary to go the the specific location of the record you need"
            + "\nto\"borrow\" but you have to be careful, there is a duplicate"
            + "\nthat may really be a booby trap. You see both records side by"
            + "\nside. The look identical.It is a trap! Or maybe it's perfectly"
            + "\nsafe. You decide at your own peril."),
    CN_tower("You have come to Toronto, eh? B. C. D... As you look at the city"
            + "\nkyline at dusk, you can make out what is perhaps Toronto's best"
            + "\nknown attraction: the CN Tower. The roads are failry busy, so "
            + "\nyou nmust try to make your way to the observatory where you see"
            + "\nLake Ontario in all its glory. Somewhere up there is a message,"
            + "\nor nperhaps a dossier, but where is it? Maybe you have to go "
            + "\nto the edge. Nudge nudge, wink wink. Please be alert, we would"
            + "\nhate tohear you \"fel\" to your death way, way up there."),
    Rio("Ah! The beach. And it is Carnival time here in Rio de Janeiro."),
    Amazon_Rainforest("The Amazon represents over half of the planet's"
            + "\nremaining rainforests,& comprises the largest and most "
            + "\nbiodiverse tract of tropical rainforest in the world."),
    Sao_paulo("The metropolis is an alpha global city & is the most populous"
            + "\ncity in Brazil, the Americas, and in the Southern Hemisphere"),
    Sydney_Opera_House(" A multi-venue performing arts centre. It is one of "
            + "\nthe 20th century's most famous & distinctive buildings"),
    Melbourne_Jail("Got some shrimp on the barbie"),
    Bridge("A bridge mate."),
    StPeters_Square("Between 1713–1728 and 1732–1918, Saint Petersburg was the "
            + "\ncapital of imperial Russia. In 1918, the central government "
            + "\nbodies moved to Moscow."),
    Lenins_Mausoleum("Currently serves as the resting place of Vladimir Lenin. "
            + "\nHis preserved body has been on public display there since "
            + "\nshortly after his death in 1924."),
    StBasils_Cathedral("Built from 1555–61 on orders from Ivan the Terrible "
            + "\nand commemorates the capture of Kazan and Astrakhan.");

    private final String description;

    SceneDescriptionsEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }   

public void printSceneDescriptions(String description) throws LocationException {
        Writer outputLocation = null;
//create BufferReader object for input file
try(PrintWriter out = new PrintWriter (outputLocation)){
    
    //print title 
    out.println("\n\n       Scence Description        ");
    out.printf(description);
    }
}
}


            

       
   





