/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

import byui.cit260.snipe.enums.SceneDescriptionsEnum;

/**
 *
 * @author Maxwell
 */
public class Map {

    private int rowCount;
    private Location[] locations;
    private String[] sceneTable = new String[27];

    public Map(int rowCount) {
        if (rowCount < 1 ) {
            System.out.println("Nice try, but hacking won't get you anywhere in this game.");
            return;
        }
        createSceneTable();
        this.rowCount = rowCount;

        this.locations = new Location[rowCount];

        for (int i = 0; i < rowCount; i++) {
            Location location = new Location();
            location.setRow(i);
            location.setPassportAdd(false);
            location.setScene(this.sceneTable[i]);
            locations[i] = location;
            
        }
    }

    public String[] getSceneTable() {
        return sceneTable;
    }

    public void setSceneTable(String[] scene_table) {
        this.sceneTable = scene_table;
    }

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

 

    private void createSceneTable() {
        this.sceneTable[0] = SceneDescriptionsEnum.SNIPE_HQ.getDescription();
        this.sceneTable[1] = SceneDescriptionsEnum.Lib_Of_Congress.getDescription();
        this.sceneTable[2] = SceneDescriptionsEnum.Gateway_Arch.getDescription();
        this.sceneTable[3] = SceneDescriptionsEnum.Bradenburg_gate.getDescription();
        this.sceneTable[4] = SceneDescriptionsEnum.Cologne_Cathedral.getDescription();
        this.sceneTable[5] = SceneDescriptionsEnum.Rhine_river.getDescription();
        this.sceneTable[6] = SceneDescriptionsEnum.Large_Ben.getDescription();
        this.sceneTable[7] = SceneDescriptionsEnum.Westminster_Abbey.getDescription();
        this.sceneTable[8] = SceneDescriptionsEnum.Buckingham_palace.getDescription();
        this.sceneTable[9] = SceneDescriptionsEnum.Tarragona.getDescription();
        this.sceneTable[10] = SceneDescriptionsEnum.Cathedral_Seville.getDescription();
        this.sceneTable[11] = SceneDescriptionsEnum.Valencia.getDescription();
        this.sceneTable[12] = SceneDescriptionsEnum.Eiffel_tower.getDescription();
        this.sceneTable[13] = SceneDescriptionsEnum.The_Louvre.getDescription();
        this.sceneTable[14] = SceneDescriptionsEnum.Some_Cafe.getDescription();
        this.sceneTable[15] = SceneDescriptionsEnum.Olympic_Stadium.getDescription();
        this.sceneTable[16] = SceneDescriptionsEnum.Lib_Parliment.getDescription();
        this.sceneTable[17] = SceneDescriptionsEnum.CN_tower.getDescription();
        this.sceneTable[18] = SceneDescriptionsEnum.Rio.getDescription();
        this.sceneTable[19] = SceneDescriptionsEnum.Amazon_Rainforest.getDescription();
        this.sceneTable[20] = SceneDescriptionsEnum.Sao_paulo.getDescription();
        this.sceneTable[21] = SceneDescriptionsEnum.Sydney_Opera_House.getDescription();
        this.sceneTable[22] = SceneDescriptionsEnum.Melbourne_Jail.getDescription();
        this.sceneTable[23] = SceneDescriptionsEnum.Bridge.getDescription();
        this.sceneTable[24] = SceneDescriptionsEnum.StPeters_Square.getDescription();
        this.sceneTable[25] = SceneDescriptionsEnum.Lenins_Mausoleum.getDescription();
        this.sceneTable[26] = SceneDescriptionsEnum.StBasils_Cathedral.getDescription();


    }

    
    
}
