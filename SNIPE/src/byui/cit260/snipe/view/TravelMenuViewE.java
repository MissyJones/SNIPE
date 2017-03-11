/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import java.io.Serializable;

/**
 *
 * @author Home
 */
public enum TravelMenuViewE implements Serializable {
    USA_SNIPE("This land is your land, this land is my land."),
    USA_LIBRARY_OF_CONGRESS("This is a super important library"),
    Gateway_Arch("It's this big ...um....arch...yeah"),
    Germany_Bradenburg_Gate("So Germany's favorite gate has a name.Do not leave it open!"),
    Germany_Colonge_Cathedral("The top midnight mass vacation destination."),
    Germany_Rhine_River("Wilder than a mile, I'm passing you in style someday."),
    England_Big_Ben("AKA Benny.Hey Benny! What time you got?"),
    England_Westminster_Abbey("One of the least famous Jane Austen books."),
    England_Buckingham_Palace("God save the queen!"),
    Spain_Tarragona("My favorite spice."),
    Spain_Valencia("Isn't that the name of an orange?"),
    France_Eiffel_Tower("A big fancy tower."),
    France_The_Louvre("Mona Lisa smile was filmed here."),
    France_A_Sidewalk_Cafe("I'll have an order of freedom fries with that."),
    Canada_Montreal_Olympic_Stadium("Oh Canada, our home and native land!"),
    Canada_CN_Tower("Very tall space needle. Ive been there."),
    Brazil_Beach_Rio_de_Janeiro("Her name is Rio and she dances on the sand."),
    Brazil_Amazon_Rain_Forest("Save the rain forests!!!"),
    Brazil_Sao_Paulo("IDK, this is getting old."),
    Austrailia_Sydney_Opera_House("The phantom of the opera is there mate."),
    Austrail_Bride("Dude, I've totally seen a bridge before!"),
    Russia_StPeters_Square("Blah blah blah"),
    Russia_Lenins_Mausoleum("RIP dawg."),
    Russia_StBasils_Cathedral("A big church");
    
    private final String description;
    TravelMenuViewE(String description) {
        this.description = description;
}

    /**
     *
     * @return
     */
    public String getDescription(){
       return description;
   } 
}
