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
    private String description;
    private String challengeType;
    private double placeID;
    private double passportAdd;
    private double puzzleTrigger;

    public Location() {
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

    public void setChallengeType(String challengeType) {
        this.challengeType = challengeType;
    }

    public double getPlaceID() {
        return placeID;
    }

    public void setPlaceID(double placeID) {
        this.placeID = placeID;
    }

    public double getPassportAdd() {
        return passportAdd;
    }

    public void setPassportAdd(double passportAdd) {
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
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.challengeType);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.placeID) ^ (Double.doubleToLongBits(this.placeID) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.passportAdd) ^ (Double.doubleToLongBits(this.passportAdd) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.puzzleTrigger) ^ (Double.doubleToLongBits(this.puzzleTrigger) >>> 32));
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
        if (Double.doubleToLongBits(this.passportAdd) != Double.doubleToLongBits(other.passportAdd)) {
            return false;
        }
        if (Double.doubleToLongBits(this.puzzleTrigger) != Double.doubleToLongBits(other.puzzleTrigger)) {
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
        return "Location{" + "description=" + description + ", challengeType=" + challengeType + ", placeID=" + placeID + ", passportAdd=" + passportAdd + ", puzzleTrigger=" + puzzleTrigger + '}';
    }
    
    
    
    
    
    
}
