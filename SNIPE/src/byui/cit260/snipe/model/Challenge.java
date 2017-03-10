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
public class Challenge implements Serializable {

    private String description;
    private double reward;
    private double challengeID;
    private String challengeType;
    private boolean usedFlag;
    private Game game;

    public Challenge() {
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
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

    public String getChallengeType() {
        return challengeType;
    }

    public void setChallengeType(String challengeType) {
        this.challengeType = challengeType;
    }

    public boolean isUsedFlag() {
        return usedFlag;
    }

    public void setUsedFlag(boolean usedFlag) {
        this.usedFlag = usedFlag;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.description);
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.reward) ^ (Double.doubleToLongBits(this.reward) >>> 32));
        hash = 43 * hash + (int) (Double.doubleToLongBits(this.challengeID) ^ (Double.doubleToLongBits(this.challengeID) >>> 32));
        hash = 43 * hash + Objects.hashCode(this.challengeType);
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
        final Challenge other = (Challenge) obj;
        if (Double.doubleToLongBits(this.reward) != Double.doubleToLongBits(other.reward)) {
            return false;
        }
        if (Double.doubleToLongBits(this.challengeID) != Double.doubleToLongBits(other.challengeID)) {
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
        return "MentalChallenge{" + "description=" + description + ", reward=" + reward + ", challengeID=" + challengeID + ", challengeType=" + challengeType + '}';
    }

}
