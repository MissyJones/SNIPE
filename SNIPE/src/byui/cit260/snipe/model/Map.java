/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

/**
 *
 * @author Maxwell
 */
public class Map {

    private int rowCount;
    private int columnCount;
    private Location[][] locations;

    public Map(int rowCount, int columnCount) {
        if (rowCount < 1 || columnCount < 1) {
            System.out.println("Nice try, but hacking won't get you anywhere in this game.");
            return;
        }

        this.rowCount = rowCount;
        this.columnCount = columnCount;

        this.locations = new Location[rowCount][columnCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; i < columnCount; j++) {

                Location location = new Location();
                location.setColumn(j);
                location.setRow(i);
                location.setPassportAdd(false);

                locations[i][j] = location;
            }
        }
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

}
