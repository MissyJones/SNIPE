/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.exceptions.CodeControlException;
import byui.cit260.snipe.model.Code;
import byui.cit260.snipe.model.Player;
import java.util.ArrayList;

/**
 *
 * @author Maxwell
 */
public class CodeControl {

    public void addCode(Code code, Player player) throws CodeControlException {
        ArrayList <Code> codeList = player.getCodeInventory();
        if (codeList.contains(code)) {
            throw new CodeControlException("This code has already been acquired."
                    + "\nYou're going to have to find a different code for this to work.");
        } else {
            player.addObjectToCodeInventory(code);
            System.out.println("You've got a new code!");

        }
    }
}
