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
public class Item implements Serializable {
    private String itemDescription;
    private String itemType;
    private double itemIDNumber;

    public Item() {
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public double getItemIDNumber() {
        return itemIDNumber;
    }

    public void setItemIDNumber(double itemIDNumber) {
        this.itemIDNumber = itemIDNumber;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.itemDescription);
        hash = 59 * hash + Objects.hashCode(this.itemType);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.itemIDNumber) ^ (Double.doubleToLongBits(this.itemIDNumber) >>> 32));
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.itemIDNumber) != Double.doubleToLongBits(other.itemIDNumber)) {
            return false;
        }
        if (!Objects.equals(this.itemDescription, other.itemDescription)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemDescription=" + itemDescription + ", itemType=" + itemType + ", itemIDNumber=" + itemIDNumber + '}';
    }
    
    
    
}
