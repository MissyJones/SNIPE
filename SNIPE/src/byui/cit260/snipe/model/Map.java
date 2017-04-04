/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

import byui.cit260.snipe.enums.SceneDescriptionsEnum;
import byui.cit260.snipe.enums.TravelEnum;

/**
 *
 * @author Maxwell
 */
public class Map {

    private int rowCount;
    private Location[] locations;
    private String[] sceneTable = new String[27];
    private String[] travelTable = new String[27];

    public Map(int rowCount, Challenge[] challenge) {
        if (rowCount < 1) {
            System.out.println("Nice try, but hacking won't get you anywhere in this game.");
            return;
        }
        createTravelTable();
        createSceneTable();
        this.rowCount = rowCount;

        this.locations = new Location[rowCount];

        for (int i = 0; i < rowCount; i++) {
            Location location = new Location();
            location.setRow(i);
            location.setPassportAdd(false);
            location.setScene(this.sceneTable[i]);
            location.setLocationType(LocationType.Nothing);
            location.setChallenge(challenge[9]);
            locations[i] = location;
        }

        locations[1].setChallenge(challenge[3]);
        locations[4].setChallenge(challenge[4]);
        locations[8].setChallenge(challenge[5]);
        locations[10].setChallenge(challenge[6]);
        locations[13].setChallenge(challenge[2]);
        locations[15].setChallenge(challenge[8]);
        locations[17].setChallenge(challenge[0]);
        locations[21].setChallenge(challenge[7]);
        locations[25].setChallenge(challenge[1]);

    }

    public String[] getTravelTable() {
        return travelTable;
    }

    public void setTravelTable(String[] travelTable) {
        this.travelTable = travelTable;
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

    private void createTravelTable() {
        this.travelTable[0] = TravelEnum.SNIPE_HQ.getDescription();
        this.travelTable[1] = TravelEnum.Lib_Of_Congress.getDescription();
        this.travelTable[2] = TravelEnum.Gateway_Arch.getDescription();
        this.travelTable[3] = TravelEnum.Bradenburg_gate.getDescription();
        this.travelTable[4] = TravelEnum.Cologne_Cathedral.getDescription();
        this.travelTable[5] = TravelEnum.Rhine_river.getDescription();
        this.travelTable[6] = TravelEnum.Large_Ben.getDescription();
        this.travelTable[7] = TravelEnum.Westminster_Abbey.getDescription();
        this.travelTable[8] = TravelEnum.Buckingham_palace.getDescription();
        this.travelTable[9] = TravelEnum.Tarragona.getDescription();
        this.travelTable[10] = TravelEnum.Cathedral_Seville.getDescription();
        this.travelTable[11] = TravelEnum.Valencia.getDescription();
        this.travelTable[12] = TravelEnum.Eiffel_tower.getDescription();
        this.travelTable[13] = TravelEnum.The_Louvre.getDescription();
        this.travelTable[14] = TravelEnum.Some_random_Cafe.getDescription();
        this.travelTable[15] = TravelEnum.Olympic_Stadium.getDescription();
        this.travelTable[16] = TravelEnum.Lib_Parliment.getDescription();
        this.travelTable[17] = TravelEnum.CN_tower.getDescription();
        this.travelTable[18] = TravelEnum.Rio.getDescription();
        this.travelTable[19] = TravelEnum.Amazon_Rainforest.getDescription();
        this.travelTable[20] = TravelEnum.Sao_paulo.getDescription();
        this.travelTable[21] = TravelEnum.Sydney_Opera_House.getDescription();
        this.travelTable[22] = TravelEnum.Melbourne_Jail.getDescription();
        this.travelTable[23] = TravelEnum.Bridge.getDescription();
        this.travelTable[24] = TravelEnum.StPeters_Square.getDescription();
        this.travelTable[25] = TravelEnum.Lenins_Mausoleum.getDescription();
        this.travelTable[26] = TravelEnum.StBasils_Cathedral.getDescription();

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
