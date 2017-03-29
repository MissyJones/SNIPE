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
    private int healthPoints = 100;
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

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

   }
