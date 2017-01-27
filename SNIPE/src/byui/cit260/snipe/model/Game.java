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
 * @author Missy
 */
public class Game implements Serializable{
   private String moveCounter;
   private double noCodes;

    public Game() {
    }
   
   

    public String getMoveCounter() {
        return moveCounter;
    }

    public void setMoveCounter(String moveCounter) {
        this.moveCounter = moveCounter;
    }

    public double getNoCodes() {
        return noCodes;
    }

    public void setNoCodes(double noCodes) {
        this.noCodes = noCodes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.moveCounter);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.noCodes) ^ (Double.doubleToLongBits(this.noCodes) >>> 32));
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
        final Game other = (Game) obj;
        return true;
    }

     @Override
    public String toString() {
        return "Game{" + "moveCounter=" + moveCounter + ", noCodes=" + noCodes + '}';
    }

    public void setMoveCounter(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setMoveCounter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNoCodes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}
