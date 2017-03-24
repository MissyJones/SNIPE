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
    private int columnCount;
    private Location[][] locations;
    private String[][] sceneTable;

    public Map(int rowCount, int columnCount) {
        if (rowCount < 1 || columnCount < 1) {
            System.out.println("Nice try, but hacking won't get you anywhere in this game.");
            return;
        }
        createSceneTable();
        this.rowCount = rowCount;
        this.columnCount = columnCount;

        this.locations = new Location[rowCount][columnCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {

                Location location = new Location();
                location.setColumn(j);
                location.setRow(i);
                location.setPassportAdd(false);
                location.setScene(this.sceneTable[i][j]);
                locations[i][j] = location;
            }
        }
    }

    public String[][] getSceneTable() {
        return sceneTable;
    }

    public void setSceneTable(String[][] scene_table) {
        this.sceneTable = scene_table;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    private void createSceneTable() {
        this.sceneTable[0][0] = SceneDescriptionsEnum.SNIPE_HQ.getDescription();
        this.sceneTable[0][1] = SceneDescriptionsEnum.Lib_Of_Congress.getDescription();
        this.sceneTable[0][2] = SceneDescriptionsEnum.Gateway_Arch.getDescription();
        this.sceneTable[0][3] = SceneDescriptionsEnum.Bradenburg_gate.getDescription();
        this.sceneTable[0][4] = SceneDescriptionsEnum.Cologne_Cathedral.getDescription();
        this.sceneTable[0][5] = SceneDescriptionsEnum.Rhine_river.getDescription();
        this.sceneTable[0][6] = SceneDescriptionsEnum.Large_Ben.getDescription();
        this.sceneTable[0][7] = SceneDescriptionsEnum.Westminster_Abbey.getDescription();
        this.sceneTable[0][8] = SceneDescriptionsEnum.Buckingham_palace.getDescription();
        this.sceneTable[1][0] = SceneDescriptionsEnum.Tarragona.getDescription();
        this.sceneTable[1][1] = SceneDescriptionsEnum.Cathedral_Seville.getDescription();
        this.sceneTable[1][2] = SceneDescriptionsEnum.Valencia.getDescription();
        this.sceneTable[1][3] = SceneDescriptionsEnum.Eiffel_tower.getDescription();
        this.sceneTable[1][4] = SceneDescriptionsEnum.The_Louvre.getDescription();
        this.sceneTable[1][5] = SceneDescriptionsEnum.Some_Cafe.getDescription();
        this.sceneTable[1][6] = SceneDescriptionsEnum.Olympic_Stadium.getDescription();
        this.sceneTable[1][7] = SceneDescriptionsEnum.Lib_Parliment.getDescription();
        this.sceneTable[1][8] = SceneDescriptionsEnum.CN_tower.getDescription();
        this.sceneTable[2][0] = SceneDescriptionsEnum.Rio.getDescription();
        this.sceneTable[2][1] = SceneDescriptionsEnum.Amazon_Rainforest.getDescription();
        this.sceneTable[2][2] = SceneDescriptionsEnum.Sao_paulo.getDescription();
        this.sceneTable[2][3] = SceneDescriptionsEnum.Sydney_Opera_House.getDescription();
        this.sceneTable[2][4] = SceneDescriptionsEnum.Melbourne_Jail.getDescription();
        this.sceneTable[2][5] = SceneDescriptionsEnum.Bridge.getDescription();
        this.sceneTable[2][6] = SceneDescriptionsEnum.StPeters_Square.getDescription();
        this.sceneTable[2][7] = SceneDescriptionsEnum.Lenins_Mausoleum.getDescription();
        this.sceneTable[2][8] = SceneDescriptionsEnum.StBasils_Cathedral.getDescription();


    }

    
    
}
