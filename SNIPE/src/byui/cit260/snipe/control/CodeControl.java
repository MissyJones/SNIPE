/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Code;
import byui.cit260.snipe.model.Player;

/**
 *
 * @author Maxwell
 */
public class CodeControl {
    public int addCode(Code code, Player player) {
        boolean owned = code.isOwned();
        if(owned=true){
            System.out.println("Yeah, you've already got that.");
            return -1;
        }
        else {
            code.setOwned(true);
            player.addObjectToCodeInventory(code);
            System.out.println("You've got a new code!");
            return 0;
        }
    }
}
