/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import snipe.SNIPE;

/**
 *
 * @author Maxwell
 */
public class Player implements Serializable {

    private String name;
    private double numberOfMoves;
    private double healthPoints = 100;
    private String codeName;
    private Game game;
    ArrayList<Code> codeInventory = new ArrayList<>();
    private int row;
    private int column;
    private Location location;

    public Player() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Code> getCodeInventory() {
        return codeInventory;
    }

    public void setCodeInventory(ArrayList<Code> codeInventory) {
        this.codeInventory = codeInventory;
    }

    public void addObjectToCodeInventory(Code code) {
        this.codeInventory.add(code);
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
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

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.numberOfMoves) ^ (Double.doubleToLongBits(this.numberOfMoves) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.healthPoints) ^ (Double.doubleToLongBits(this.healthPoints) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.codeName);
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
        if (!Objects.equals(this.codeName, other.codeName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", numberOfMoves=" + numberOfMoves + ", healthPoints=" + healthPoints + ", codeName=" + codeName + '}';
    }

}
