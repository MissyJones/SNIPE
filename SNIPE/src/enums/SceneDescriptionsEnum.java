/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.io.Serializable;

/**
 *
 * @author Home
 */
public enum SceneDescriptionsEnum implements Serializable {
    SNIPE_HQ("This land is your land, this land is my land."),
    LIB_OF_Congress("This is a super important library"),
    Gateway_Arch("It's this big ...um....arch...yeah"),
    Gradenburg_gate("So Germany's favorite gate has a name.Do not leave it open!"),
    Cologne_Cathedral("The top midnight mass vacation destination."),
    Rhine_river("Wilder than a mile, I'm passing you in style someday."),
    Large_Ben("AKA Benny. Hey Benny! What time you got?"),
    Westminster_Abbey("One of the least famous Jane Austen books."),
    Buckingham_palace("God save your mom!"),
    Tarragona("My favorite spice."),
    Cathedral_Seville("So I guess some people like to look at this building. It's alright."),
    Valencia("Isn't that the name of an orange?"),
    Eiffel_tower("A big fancy tower."),
    The_Louvre("Mona Lisa smile was filmed here."),
    Some_random_Cafe("I'll have an order of freedom fries with that."),
    Olympic_Stadium("Oh Canada, our home and native land!"),
    Lib_Parliment("Things happen here"),
    CN_tower("Very tall space needle. Ive been there."),
    Rio("Her name is Rio and she dances on the sand."),
    Amazon_Rainforest("Save the rain forests!!!"),
    Sao_paulo("IDK, this is getting old."),
    Sydney_Opera_House("The phantom of the opera is there mate."),
    Melbourne_Jail("Got some shrimp on the barbie"),
    Bridge("Dude, I've totally seen a bridge before!"),
    StPeters_Square("Blah blah blah"),
    Lenins_Mausoleum("RIP dawg."),
    StBasils_Cathedral("A big church");
    
    private final String description;
    
    SceneDescriptionsEnum(String description) {
        this.description = description;
}

    public String getDescription(){
       return description;
   } 
}
