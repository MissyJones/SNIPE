/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.enums;

import java.io.PrintStream;
import java.io.Serializable;

/**
 *
 * @author elizabethkirby
 */
public enum Credits implements Serializable {

    BROTHER_DANIEL_GILLILAND("Brother Daniel Gilliland, AKA Bro G: Our "
            + "Instructor: This semester and project could not exist without "
            + " Bro G's direction, encouragement, and help. Thank you Bro G!"),
    MAXWELL_GARIETY("Maxwell Gariety: one of the creators of this game and "
            + "\nhe was a great source of knoweldge and understanding. He also"
            + "\npaitently explained what we did not understand at first. He is"
            + "\ndefinitely Super, Nice, and Interesting. Thank yoou Maxwell!"),
    MISSY_JONES("Missy Jones, one of the creators of this game who also  helped "
            + "\nkeep the team orgainzed. Her friendlieness and helpfulness were "
            + "\nof great benefit to the team. See? She too is Supper, Nice "
            + "\nand Interesting. Thank you Missy!"),
    BETH_KIRBY("Beth Kirby, the last of the creators of this game. She just "
            + "\nasked a bunch of questions, and tried to make sure each "
            + "\nassignment's rubic was met. She was an intrepid programmer who "
            + "\nkept going even when she was ready to quit. But, is she Super, "
            + "\nNice, and Interesting? It's a myster. Thank you Beth!"),
    DISCLAIMER("This is only a game, not real life, and is meant to be purely "
            + "fictional. No humans or critters were harmed during this project."
            + "The destuction of computers is an entirely different story, but"
            + "totally unintentional, and beyond the creators' control.");

    private final String description;

    Credits(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        System.out.println(java.util.Arrays.asList(Credits.values()));
        return null;
    }
}
