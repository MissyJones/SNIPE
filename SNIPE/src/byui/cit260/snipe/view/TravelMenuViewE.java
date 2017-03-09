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
    USA SNIPE("This land is your land, this land is my land."),
    USA Library of Congress("This is a super important library"),
    Gateway Arch("It's this big ...um....arch...yeah"),
    Germany Gradenburg Gate("So Germany's favorite gate has a name.Do not leave it open!"),
    Germany Colonge Cathedral("The top midnight mass vacation destination."),
    Germany, Rhine River("Wilder than a mile, I'm passing you in style someday."),
    England, Big Ben("AKA Benny.Hey Benny! What time you got?"),
    England, Westminster Abbey("One of the least famous Jane Austen books."),
    England, Buckingham Palace("God save the queen!"),
    Spain, Tarragona("My favorite spice."),
    Spain, Valencia("Isn't that the name of an orange?"),
    France, Eiffel Tower("A big fancy tower."),
    France, The Louvre("Mona Lisa smile was filmed here."),
    France, A Sidewalk Cafe("I'll have an order of freedom fries with that."),
    Canada, Montreal Olympic Stadium("Oh Canada, our home and native land!"),
    Canada, CN Tower("Very tall space needle. Ive been there."),
    Brazil, Beach, Rio de Janeiro("Her name is Rio and she dances on the sand."),
    Brazil, Amazon Rain Forest("Save the rain forests!!!"),
    Brazil, Sao Paulo("IDK, this is getting old."),
    Austrailia, Sydney Opera House("The phantom of the opera is there mate."),
    Austrail, Bride("Dude, I've totally seen a bridge before!"),
    Russia, StPeters Square("Blah blah blah"),
    Russia, Lenins Mausoleum("RIP dawg."),
    Russia, StBasils Cathedral("A big church");
    
    private final String description;
    TravelMenuViewE(String description) {
        this.description;
}

    /**
     *
     * @return
     */
    public String getDescription(){
       return description;
   } 
}
