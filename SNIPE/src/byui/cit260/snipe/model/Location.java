/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Maxwell
 */
public class Location implements Serializable {
/**
 *
 * +"| WORDS     | MORE WORDS               |\n"
 * +"|-----------|--------------------------|\n"
 * 
 * 
 */
    private String name;
    private String description;
    private String challengeType;
    private double placeID;
    private Boolean passportAdd;
    private double puzzleTrigger;
    private String passportView;
    private Country country;

    public Location() {
    }

    public String getPassportView() {
        return passportView;
    }

    public void setPassportView(String passportView) {
        this.passportView = passportView;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChallengeType() {
        return challengeType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChallengeType(String challengeType) {
        this.challengeType = challengeType;
    }

    public double getPlaceID() {
        return placeID;
    }

    public void setPlaceID(double placeID) {
        this.placeID = placeID;
    }

    public Boolean getPassportAdd() {
        return passportAdd;
    }

    public void setPassportAdd(Boolean passportAdd) {
        this.passportAdd = passportAdd;
    }

    public double getPuzzleTrigger() {
        return puzzleTrigger;
    }

    public void setPuzzleTrigger(double puzzleTrigger) {
        this.puzzleTrigger = puzzleTrigger;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.challengeType);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.placeID) ^ (Double.doubleToLongBits(this.placeID) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.puzzleTrigger) ^ (Double.doubleToLongBits(this.puzzleTrigger) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.placeID) != Double.doubleToLongBits(other.placeID)) {
            return false;
        }
        if (Double.doubleToLongBits(this.puzzleTrigger) != Double.doubleToLongBits(other.puzzleTrigger)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.challengeType, other.challengeType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", description=" + description + ", challengeType=" + challengeType + ", placeID=" + placeID + ", passportAdd=" + passportAdd + ", puzzleTrigger=" + puzzleTrigger + '}';
    }

}
