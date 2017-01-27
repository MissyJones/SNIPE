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
 * @author elizabethkirby
 */
public class MentalChallenge implements Serializable {
    private String description;
    private double reward;
    private double challengeID;
    private String challengType;

    public MentalChallenge() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getChallengeID() {
        return challengeID;
    }

    public void setChallengeID(double challengeID) {
        this.challengeID = challengeID;
    }

    public String getChallengType() {
        return challengType;
    }

    public void setChallengType(String challengType) {
        this.challengType = challengType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.reward) ^ (Double.doubleToLongBits(this.reward) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.challengeID) ^ (Double.doubleToLongBits(this.challengeID) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.challengType);
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
        final MentalChallenge other = (MentalChallenge) obj;
        if (Double.doubleToLongBits(this.reward) != Double.doubleToLongBits(other.reward)) {
            return false;
        }
        if (Double.doubleToLongBits(this.challengeID) != Double.doubleToLongBits(other.challengeID)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.challengType, other.challengType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MentalChallenge{" + "description=" + description + ", reward=" + reward + ", challengeID=" + challengeID + ", challengType=" + challengType + '}';
    }
    
    
    
}
