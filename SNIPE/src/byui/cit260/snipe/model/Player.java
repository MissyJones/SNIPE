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
public class Player implements Serializable{
    private String name;
    private double numberOfMoves;   
    private double healthPoints = 100;
    public Player() {
    }
    
    public String getName() {
        return name;
    }

    public double getNumberOfMoves() {
        return numberOfMoves;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfMoves(double numberOfMoves) {
        this.numberOfMoves = numberOfMoves;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.numberOfMoves) ^ (Double.doubleToLongBits(this.numberOfMoves) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.healthPoints) ^ (Double.doubleToLongBits(this.healthPoints) >>> 32));
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.numberOfMoves) != Double.doubleToLongBits(other.numberOfMoves)) {
            return false;
        }
        if (Double.doubleToLongBits(this.healthPoints) != Double.doubleToLongBits(other.healthPoints)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", numberOfMoves=" + numberOfMoves + ", healthPoints=" + healthPoints + '}';
    }

   

    
}
