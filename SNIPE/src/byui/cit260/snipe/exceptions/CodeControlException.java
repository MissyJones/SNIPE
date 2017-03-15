/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.exceptions;

/**
 *
 * @author Maxwell
 */
public class CodeControlException extends Exception {

    public CodeControlException() {
    }

    public CodeControlException(String message) {
        super(message);
    }

    public CodeControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public CodeControlException(Throwable cause) {
        super(cause);
    }

    public CodeControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
