/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.enums;

import java.io.Serializable;

/**
 *
 * @author elizabethkirby
 */
public enum FamousSNIPEGrads implements Serializable {
    //List of Famous SNIPE Graduates who can help, though you might be better off without the help of some of them
    JAMES_BOND("James Bond: The Brits were so happy with how well we trained him," 
            +"\nthey gave us money to expand our operations!"),
    MAXWELLL_SMART("Maxwell Smart: We promise you when he graduated he really "
            +"\nwas top notch. We don't know what happened."),
    SECRET_SQUIRREL("Secret Squirrel: Yep. We train talking critters too."),
    LANCELOT_LINK("Lancelot Link: AKA Lance Link, Secret Chimp. Hey! IF chimps "
            +"\nan go into space, they certainly can do secret spy type stuff."),
    SIDNEY_BRISTOW("Sidney Bristow: One of our finest graduates. We were so "
            +"\nhappy for her when she got to show her grit and smarts on TV."),
    JACK_BAUER("Jack Bauer: Another top notch graduate, after all he got the "
            + "job done in 24 hours!"),
    NIKITA("Nikita: Sometimes referd to as Nikita Le Femme. But we just call "
            +"\nher Nikita."),
    ANGUS_MACGYVER("Angus MacyverOur most innovative and clever graduate. EVER!"),
    BORIS_AND_NATASHA("Boris and Natasha: They don't like Moose or Squirrel. We "
            +"\nadmit to failure with these two. At least they alwalys seemed "
            +"\nsuper nice!"),
    INSPECTOR_GADGET("Inspector Gadget: Another very clever and innovative "
            +"\ngraduate. We wish he ould share all his cool toys with us!"),
    BULLWINKLE("Bullwinkle: Covert, so don't tell anyone he is one of us. We "
            +"\nstill can't figure out if he's just acting like a he's not very "
            +"\nbright or if he really is that dim. He loves to always try new "
            +"\nthings, even though all his attempts at tricks end disastrously,"
            +"\nso we given him an A for sheer grit and determination. He is"
            +"\nthe \"Moose\" Boris and  Natasha don't like for some odd reason."),
    ROCKET_J_SQUIRREL("Rocket J. Squirrel: Another covert, so you must never "
            +"\nThis one has super powers! We suspect he picked them up whe he "
            +"\nwhen he got bit by the irradiated golden goose during one of his"
            +"\nassignments with us. He is the \"Squirrel\" Boris and Natasha "
            +"\ndon't ike. But, Squirrel is such a super nice and interesting "
            +"\npeople, e make that squirrel."),
   AUSTIN_POWERS("Austin Powers: He's so shaggadelic. Also another one who "
            + "\nturned away from super nice to the dark side. What can we say?"
            +"\nYou win some. You lose some."),
    SECRET_AGENT_MAN("Secret Agent Man: The best of the best. He's so good he "
            +"ngot is own song."),
    AGENT_X("Agent X. Like X and bacon!");

    private final String description;

    FamousSNIPEGrads(String description) {
        this.description = description;
    }

    public String getDescriptionJ() {
        return description;
    }

    @Override
    public String toString() {
        System.out.println(java.util.Arrays.asList(FamousSNIPEGrads.values()));
        return null;
    }

    private void FamousSNIPEGrads() {
        System.out.println("You are in good company; well mostly good company.");
    }
}
