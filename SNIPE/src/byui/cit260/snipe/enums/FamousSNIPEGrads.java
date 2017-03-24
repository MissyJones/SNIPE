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
    JAMES_BOND("The Brits were so happy with how well we trained him, they gave "
            +"\nus money to grow"),
    MAXWELLL_SMART("We promise you when he graduated he really was top notch. "
            +"\nWe don't know what happened."),
    SECRET_SQUIRREL("Yep. We train talking critters too."),
    LANCELOT_LINK("AKA Lance Link, Secret Chimp. Hey! IF chimps an go into "
            +"\nspace, they certainly can do spy type stuff."),
    SIDNEY_BRISTOW("One of our finest graduates. We were so happy for her when "
            +"\nshe got to show her grit and smarts on TV."),
    JACK_BAUER("Another top notch graduate, after all he got the job done in "
            +"\n24 hours!"),
    NIKITA("Sometimes referd to as Nikita Le Femme. But we just call "
            +"\nher Nikita."),
    MACGUYVER("Our most innovative and clever graduate. EVER!"),
    BORIS_AND_NATASHA("They don't like Moose or Squirrel. We admit to failure "
            +"\non these two. At least they alwalys seemed super nice!"),
    INSPECTOR_GADGET("Another very clever and innovative graduate. We wish he "
            +"\nwould share all his cool toys with us!"),
    BULLWINKLE("Covert, so don't tell anyone he is one of us. We still can't "
            +"\nfigure out if he's just acting like a he's not very bright or "
            +"\nif he really is that dim. He is the \"Moose\" Boris and  "
            +"\nNatasha don't like."),
    ROCKET_J_SQUIRREL("AKA Rocky \"Hey Rocky! Watch this!\" Another covert. "
            +"\nThis one has super powers! We suspect he picked them  up "
            +"\nwhen he got bit by the irridiated golden goose. He is the"
            +"\n\"Squirrel\" Boris and"
            +"\nNatasha don't like."),
   AUSTIN_POWERS("He's so shaggadelic. Also another one who turned away from "
            +"\nsuper nice to the dark side. What can we say? You win some. "
            +"\nYou lose some."),
    SECRET_AGENT_MAN("The best of the best. He's so good he got is own song."),
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
