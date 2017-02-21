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
 * @author Home
 */
public class PhysChallenge implements Serializable {

    private String description;
    private double country;
    private double challengeID;

    public PhysChallenge() {
    }

    public double getChallengeID() {
        return challengeID;
    }

    public void setChallengeID(double challengeID) {
        this.challengeID = challengeID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCountry() {
        return country;
    }

    public void setCountry(double country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.description);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.country) ^ (Double.doubleToLongBits(this.country) >>> 32));
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
        final PhysChallenge other = (PhysChallenge) obj;
        return true;
    }

    @Override
    public String toString() {
        return "PhysChallenge{" + "description=" + description + ", country=" + country + '}';
    }

    public void setDescription(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCountry(String america) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
