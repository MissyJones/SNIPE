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
public class Code implements Serializable {

    private String itemDescription;
    private boolean owned;

    public Code[] item;

    static {
    }

    public boolean isOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Code[] getItem() {
        return item;
    }

    public void setItem(Code[] item) {
        this.item = item;
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
        final Code other = (Code) obj;
        if (!Objects.equals(this.itemDescription, other.itemDescription)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "itemDescription=" + itemDescription + '}';
    }

}
