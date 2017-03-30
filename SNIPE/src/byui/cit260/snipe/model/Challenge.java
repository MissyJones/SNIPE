/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

import java.io.Serializable;
import java.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author elizabethkirby
 */
public class Challenge implements Serializable {

    private String description;
    private boolean usedFlag;
    private Code code;
    
    
    public Challenge() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public boolean isUsedFlag() {
        return usedFlag;
    }

    public void setUsedFlag(boolean usedFlag) {
        this.usedFlag = usedFlag;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

   
}
