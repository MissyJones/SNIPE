/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import java.io.Serializable;

/**
 *
 * @author Maxwell
 */
public enum ChallengeDescriptionEnum implements Serializable {
    mentalOne(""),
    mentalTwo(""),
    mentalThree(""),
    physOne(""),
    physTwo(""),
    physThree(""),
    physFour(""),
    physFive(""),
    physSix("");

    private final String description;

    private ChallengeDescriptionEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
