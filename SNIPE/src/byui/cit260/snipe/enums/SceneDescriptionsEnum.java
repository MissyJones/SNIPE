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
    Olympic_Stadium(" Built in the mid-1970s as the main venue for the 1976 "
            + "\nSummer Olympics."),
    Lib_Parliment("The main information repository and research resource for "
            + "\nthe Parliament of Canada. "),
    CN_tower("The third tallest tower in the world and remains the tallest "
            + "\nfree-standing structure in the Western Hemisphere.."),
    Rio("One of the most visited cities in the Southern Hemisphere and is "
            + "\nknown for its natural settings, Carnival, samba, bossa nova,"
            + "\nand balneario beaches."),
    Amazon_Rainforest("The Amazon represents over half of the planet's "
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


            

       
   





