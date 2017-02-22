/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Player;

/**
 *
 * @author Maxwell
 */
public class CodeNameGenerator {
    
    private String codeName;
    private int rand1;
    private int rand2;
    private String code1;
    private String code2;
    
    public void CodeNameGenerator() {
 

    }
    
    public String codeNameGen () {
        this.rand1 = (int) Math.ceil(Math.random()*5);
        this.rand2 = (int) Math.ceil(Math.random()*5);
        
        switch (rand1) {
            case 0:
                this.code1 = "Silent ";
                break;
            case 1:
                this.code1 = "Deadly ";
                break;
            case 2:
                this.code1 = "Spectacular ";
                break;
            case 3:
                this.code1 = "Flying ";
                break;
            case 4:
                this.code1 = "Steel ";
                break;
            case 5:
                this.code1 = "Golden";
                break;
            default:
                this.code1 = "Broken ";
                break;
        }
        switch (rand2) {
            case 0:
                this.code2 = "Tiger";
                break;
            case 1:
                this.code2 = "Possum";
                break;
            case 2:
                this.code2 = "Scorpion";
                break;
            case 3:
                this.code2 = "Panda";
                break;
            case 4:
                this.code2 = "Gun";
                break;
            case 5:
                this.code2 = "Eagle";
                break;
            default:
                this.code2 = "Code";
                break;
        }
        
        this.codeName = code1+code2;

        System.out.println("\nYour codename is: "+codeName+". "
                + "\n\n Go get the bad guys, "+codeName+"!");
        return null;

    }
    
}
