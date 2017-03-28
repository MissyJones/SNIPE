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
public class Location implements Serializable {

    /**
     *
     * +"| WORDS | MORE WORDS |\n" +"|-----------|--------------------------|\n"
     *
     *
     */
    private String name;
    private String description;
    private String challengeType;
    private double placeID;
    private Boolean passportAdd;
    private double puzzleTrigger;
    private String passportView;
    private String country;
    private int row;

    private String scene;

    public Location() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChallengeType() {
        return challengeType;
    }

    public void setChallengeType(String challengeType) {
        this.challengeType = challengeType;
    }

    public double getPlaceID() {
        return placeID;
    }

    public void setPlaceID(double placeID) {
        this.placeID = placeID;
    }

    public Boolean getPassportAdd() {
        return passportAdd;
    }

    public void setPassportAdd(Boolean passportAdd) {
        this.passportAdd = passportAdd;
    }

    public double getPuzzleTrigger() {
        return puzzleTrigger;
    }

    public void setPuzzleTrigger(double puzzleTrigger) {
        this.puzzleTrigger = puzzleTrigger;
    }

    public String getPassportView() {
        return passportView;
    }

    public void setPassportView(String passportView) {
        this.passportView = passportView;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

 
    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

}
