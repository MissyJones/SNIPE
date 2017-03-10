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
public class Country implements Serializable {

    private String name;
    private double countryID;
    private double visited;
    
    private MentalChallenge mentalChallenge;
    private PhysChallenge physChallenge;
    private Location location;

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCountryID() {
        return countryID;
    }

    public void setCountryID(double countryID) {
        this.countryID = countryID;
    }

    public double getVisited() {
        return visited;
    }

    public void setVisited(double visited) {
        this.visited = visited;
    }
    
    public MentalChallenge getMentalChallenge() {
        return mentalChallenge;
    }
    public void setMentalChallenge(MentalChallenge mentalChallenge) {
        this.mentalChallenge = mentalChallenge;
    }
    public PhysChallenge getPhysChallenge() {
        return physChallenge;
    }
    public void setPhysChallenge(PhysChallenge physChallenge) {
        this.physChallenge = physChallenge;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation (Location location) {
        this.location =  location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.countryID) ^ (Double.doubleToLongBits(this.countryID) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.visited) ^ (Double.doubleToLongBits(this.visited) >>> 32));
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
        final Country other = (Country) obj;
        if (Double.doubleToLongBits(this.countryID) != Double.doubleToLongBits(other.countryID)) {
            return false;
        }
        if (Double.doubleToLongBits(this.visited) != Double.doubleToLongBits(other.visited)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", countryID=" + countryID + ", visited=" + visited + '}';
    }

}
