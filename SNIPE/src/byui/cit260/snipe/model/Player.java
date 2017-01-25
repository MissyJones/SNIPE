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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.numberOfMoves) ^ (Double.doubleToLongBits(this.numberOfMoves) >>> 32));
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", numberOfMoves=" + numberOfMoves + '}';
    }

    
    

    
}
