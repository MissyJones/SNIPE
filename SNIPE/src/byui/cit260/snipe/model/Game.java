/*]
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
public class Game implements Serializable {

    private double moveCounter;
    private double noCodes;
    Item[] items = new Item[9];
    private Player player;
    private Country country;
    Challenge[] challenges = new Challenge[4];

    public Game() {
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Challenge[] getChallenges() {
        return challenges;
    }

    public void setChallenges(Challenge[] challenges) {
        this.challenges = challenges;
    }

 
    
    public double getMoveCounter() {
        return moveCounter;
    }

    public void setMoveCounter(double moveCounter) {
        this.moveCounter = moveCounter;
    }

    public double getNoCodes() {
        return noCodes;
    }

    public void setNoCodes(double noCodes) {
        this.noCodes = noCodes;
    }
   
    public Player getPlayer() {
        return player;
}

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Country getCountry() {
        return country;
    }
    
    public void setCountry(Country country) {
        this.country = country;
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

}
