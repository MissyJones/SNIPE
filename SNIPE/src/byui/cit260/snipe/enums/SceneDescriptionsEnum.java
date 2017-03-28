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
    SNIPE_HQ("Headquarters of the super secret SNIPE Agency"),
    Lib_Of_Congress("\nThe research library that officially serves the United "
            + "\nStates Congress and is the de facto national library of the "
            + "\nUnited States. "),
    Gateway_Arch("\nThe world's tallest arch,the tallest man-made monument in "
            + "\nthe Western Hemisphere,and Missouri's tallest accessible"
            + "\nbuilding."),
    Bradenburg_gate("\nAn 18th-century neoclassical monument in Berlin, and "
            + "\none of the best-known landmarks of Germany."),
    Cologne_Cathedral("A renowned monument of German Catholicism and Gothic "
            + "\narchitecture and was declared a World Heritage Site in 1996."),
    Rhine_river("Begins in the Swiss Alps,then flows through the Rhineland and "
            + "\neventually empties into the North Sea in the Netherlands."),
    Large_Ben(" the Great Bell of the clock at the north end of the Palace of "
            + "\nWestminster in London."),
    Westminster_Abbey("One of the United Kingdom's most notable religious "
            + "\nbuildings and the traditional place of coronation and burial "
            + "\nsite for English and, later, British monarchs."),
    Buckingham_palace(" The London residence and administrative headquarters "
            + "\nof the reigning monarch of the United Kingdom. God save "
            + "\nyour mom!"),
    Tarragona("A port city located in northeast Spain on the Costa Daurada "
            + "\nby the Mediterranean Sea."),
    Cathedral_Seville("The largest Gothic cathedral and the third-largest "
            + "\nchurch in the world."),
    Valencia("The capital of the autonomous community of Valencia and the "
            + "\nthird largest city in Spain after Madrid and Barcelona"),
    Eiffel_tower("Initially criticized by some of France's leading artists and "
            + "\nintellectuals for its design, but it has become a global "
            + "\ncultural icon of France."),
    The_Louvre("The world's largest museum and a historic monument in Paris, "
            + "\nFrance."),
    Some_Cafe("The Café de Flore is one of the oldest coffeehouses in "
            + "\nParis. "),
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


            

       
   





