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
            + "\ndelay starting your mission now. Carefully you go into the "
            + "\nlibrary to go the the specific location of the record you need"
            + "\nto\"borrow\" but you have to be careful, there is a duplicate"
            + "\nthat may really be a booby trap. You see both records side by"
            + "\nside. They look identical.It is a trap! Or maybe it's perfectly"
            + "\nsafe. You decide at your own peril."),
    CN_tower("You have come to Toronto, eh? B. C. D... As you look at the city"
            + "\nskyline at dusk, you can make out what is perhaps Toronto's "
            + "best nown attraction: the CN Tower. You approach the tower from"
            + "Front Street and begin climbing the concrete steps (Elevators"
            + "and escalators are for wimps!) and the parking roadway is too "
            + "crowded, and you are on a covert mission after all. It starts"
            + "to get a a little crowded because people are still coming and"
            + "going at the Convention Centre. \"Darned Canucks can't even"
            + "spell properly!\" you think to yourself. The Rogers Centre is on"
            + "your right; too bad it's not baseball season or you could have"
            + "taken in a Blue Jays game, to unwind from the stress of your"
            + "training. Oh! There are murals of people at a baseball game doing"
            + "baseball fan things. GO ahead and admire the murals for a few "
            + "minutes, but do not get too absorbed you lose awareness of your "
            + "surroundings. That would be very, very bad. To the left, beyond "
            + "another set of stairs and Ripley's Aquarium (a very popular "
            + "place even at this time) is the CN Tower - your whole reason for "
            + "being here."
            + "You make your way to the observatory, where you see Lake Ontario"
            + "and all its greatness, as well as the lit skyline of the Toronto."
            + "Somewhere up there is a message, or dossier - maybe - but where "
            + "is it? Maybe you have to go to the edge. Nudge, nudge, wink wink."
            + " Please be lert; we would truly hate to hear you \"fell\" from "
            + "way up there. Those kinds of things don't end well at all."
            + "\nknown attraction: the CN Tower. The roads are failry busy, so "
            + "\nyou nmust try to make your way to the observatory where you see"
            + "\nLake Ontario in all its glory. Somewhere up there is a message,"
            + "\nor nperhaps a dossier, but where is it? Maybe you have to go "
            + "\nto the edge. Nudge nudge, wink wink. Please be alert, we would"
            + "\nhate tohear you \"fel\" to your death way, way up there."),
    Rio("Ah! The beach. And it is Carnival time here in Rio de Janeiro."
            + "\nThere are parades every day, but be mighty careful because"
            + "\nthere two million revelers around you, and you can never know"
            + "\nwho might be in the crowd. Now head to that famous statue... "
            + "\nwhat's it called again? Whatever, you must get there or else."
            + "\nbwahahahahahahahahahahahahaha!"),
    Amazon_Rainforest("You have made the long and ardous journey to Manaus,"
            + "\nBrazil, a booming Metropolis of two million people sitting"
            + "\na dense and otherwise sparsely populsted part of the"
            + "\nAmazon Basin to meet your supposedly \"reputable\" guide, to"
            + "\nlead you through the Amazon Rainforest, but first you take in"
            + "\nsome of the historic areas built by the rubber boon,"
            + "\nincluding the Municipal Market which looks oddly familiar,"
            + "\n almost Parisian is this de ja vu? You can hear Macaws and"
            + "\nHarpy Eagles in the distant jungle. Dare  you trek through"
            + "\n\\nthe jungle as assigned? Ah! You can see dolphins, golden"
            + "\nlion tamarin and maybe a sloth or two. BUT! Beware of the man-"
            + "\neating anacondas, the poison dart frogs, and jaguars. Are you"
            + "\nbrave enough to carry on with your mission? Or are you a wimp?"),
    Sao_paulo("The capital of Brazil Sao Paulo is. Your Portugues, not Spanish,"
            + "\n is up to par we hope is. You are in the most populous and "
            + "wealthiest city in Brazil. The city is surrounded by rivers"
            + "\nthat fan out into the interior of the city. Perhaps you can"
            + "\ntake the sties in later, but you start to head to Parque do"
            + "\nIbirapuera. First you go to Professor Aristotes Orsini"
            + "\nplanetarium. There is a secret message in the lecture you "
            + "\nattend. Then stroll through the beautiful gardens of"
            + "\nManequinbo Lopes Vivarium, but watch carefully. You never know"
            + "\nwhat - or who - lurks in the gardens. Your final stop is at"
            + "\nthe Monumento as Bandeiras, a tribute to the explorers who"
            + "\nhelped create Sao Paulo. There may be something or someone"
            + "\nvery important, but who is it What do they look like?"
            + "\ncity in Brazil, the Americas, and in the Southern Hemisphere"),
    Sydney_Opera_House("G'day mate! You are outside the iconic Sydney Opera"
            + "\nHouse. You arrived on one of many boats that operate in"
            + "\nSydney Harbour \"Australians cannot spell!\" you think. You"
            + "\nare waling along Macquarie Street that extends between Hyde"
            + "\nPark and the opera house. Since the opera house is a multi-"
            + "\nvenue, there are people everywhere eagerly waiting to see one"
            + "\nof many shows happening. However, you are not here to see a"
            + "\nperformance, you head to the historic St. James church. You"
            + "\nhave business to attend to. Get to it, mate! "
            + "\nthe 20th century's most famous & distinctive buildings"),
    Melbourne_Jail("Old Melbourne Gaol is now a museum. So go on in and"
            + "\ntake the tour. You walk down a hallway lined with jail cells."
            + "\nHowever, you are on the night tour because somewhere within"
            + "\nthe ghost stories is important information. The Old Melbourne"
            + "\nJai has a dark history. You better not become a part of itl"),
    Bridge("G'day mate! Welcome to STory Bridge in Brisbane, Australia. The"
            + "\ncantilever bridge spans the Brisbane River. The bridge is for"
            + "\nvehicles, pedestrians and bikes, so you start taking a "
            + "leisurely stroll from North Brisbane to South Brisbane, and "
            + "\nthen back to North Brisbane. We just wanted to see how "
            + "\nphysically fit you are. However! There have been many"
            + "\nsuicdes on this bridge. So be careful, we don't want to"
            + "\nfind out you \"committed suicide\" those baddies know how"
            + "\nto make it look like a suicide, so just be alert mate."),
    StPeters_Square("aint Petersburg is a big city, like twice as big as"
            + "Cincinnati. There are height restrictions on new construction"
            + "\nand because of the preservation of older architecture so, it"
            + "\nmight feel like a small city. You are drawn back into the"
            + "\nhistory of this former imperial capital of Russia as you gaze"
            + "\nat the old architecture and broken cobblestones, though you"
            + "\nnote there seems to be more road dust than concrete in any"
            + "\ncity. You marvel at all the canals at the city's center. Since"
            + "\nit is night, you see the bridges of the Neva River open to let"
            + "\nthe boats through. If only you had known that so you could"
            + "\nhave left for your hotel sooner. But, now the dawn is breaking"
            + "\nand, tired as you are, you must head to the Winter Palace for"
            + "\nyour assignment. The subways are rumbling awake, so you take"
            + "\nride to the Palace. As you walk down the stairs of the Winter"
            + "\nPalace, you are awed by the fact that you are taking the very"
            + "\npath so many Tzars and Tzarinas took so long ago. The hair on "
            + "your back raises and your hands tingle as you run your hand along"
            + "\nthe marble rail. You must bring yourself back to the present "
            + "\nbefore you end up like Nichol II, his wife Alexandra, and their"
            + " five children Olga, Tatiana, Marie, and the heir apparent Alexei."
            + "\n You take one last moment to wonder the other child's true "
            + "\nfate: what really became of Anastasia. No time to solve that "
            + "\npuzzle now, you have an assignment to complete if you hope to "
            + "\nbecome one the elite SNIPE Academy graduates."),
    Lenins_Mausoleum("Moscow! A large bustling city that rivals New York City."
            + "\nYou carefully make your way to Red Square. There you see an"
            + "\nold fortress complex now called \"The Kremlin\". Within walking"
            + "\ndistance of the Kremlin are GUM, an yuge gallery style mall"
            + "\nmostly filled with high-end stores, and your destination - "
            + "\nLenin's Mausoleum, a drab gray structure reminiscent of"
            + "\nStalinist architecture. You must go through it to find what"
            + "\nyou are looking for, but don't take too long to view the body"
            + "\nof Lenin behind glass and list within a dark room, lest you"
            + "\nget barked in trouble with  the guards. Trouble is the last"
            + "\nthing you meed. Now, go find what you eed."),
    StBasils_Cathedral("St. Basil's Cathedral. You've seen pictures of it and"
            + "\nit does not disappoint you. It looks so very large! But, when"
            + "\nwhen you walk in you are amazed to find how small it really is "
            + "\nYou head to the specified pew, bench really, and wait, but" 
            + "\nfor what?");

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
        try (PrintWriter out = new PrintWriter(outputLocation)) {

            //print title 
            out.println("\n\n       Scence Description        ");
            out.printf(description);
        }
    }
}
