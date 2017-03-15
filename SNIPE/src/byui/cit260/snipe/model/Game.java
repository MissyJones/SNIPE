/*]
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

import java.io.Serializable;

/**
 *
 * @author Missy
 */
public class Game implements Serializable {

    private double moveCounter;
    private double noCodes;
    Code[] codes = new Code[9];
    private Player player;
    private Map map;
    Challenge[] challenges = new Challenge[4];

    public Game() {
    }

    public Code[] getCodes() {
        return codes;
    }

    public void setCodes(Code[] codes) {
        this.codes = codes;
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

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

}