/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author elizabethkirby
 */
public enum FamousSNIPGrads implements Serializable {
    //List of Famous SNIPE Graduates who can help, though you might be better off without the help of some of them
    JAMES_BOND("The Brits were so happy with how well we trained, they gave us money to grow"),
    MAXWELLL_SMART("We promise you when he graduated he really was top notch. We don't know what happened."),
    SECRET_SQUIRREL("Yep. We train talking critters too."),
    LANCELOT_LINK("AKA Lance Link, Secret Chimp. Hey! IF chimps an go into space, they certainly can do spy type stuff."),
    SIDNEY_BRISTOW("One of our finest graduates. We were so happy for her when she got to show her grit and smarts on TV."),
    JACK_BAUER("Another top notch graduate, after all he got the job done in 24 hours!"),
    NIKITA("Sometimes referd to as Nikita Le Femme. But we just call her Nikita."),
    MACGUYVER("Our most innovative and clever graduate. EVER!"),
    NATASHA("Female half of the team known as Boris and Natasha. The don't like Moose. Wwe admit to failure on this one."),
    SECRET_AGENT_MAN("The best of the best. He's so good he got is own song.");
    
    private final String description;
    private final Point coordinates;

    FamousSNIPGrads(String description) {
        this.description = description;
        coordinates = new Point(1,1);
}
    public String getDescriptionJ() {
        return description;
    }
    public Point getCoordinates() {
        return coordinates;
    }
}
