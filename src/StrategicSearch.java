import java.util.Random;

public class StrategicSearch implements SearchStrategy {
    private int cells;
    private String location;
    private String carrierLocation;
    private String submarineLocation;
    private boolean carrierFound;
    private boolean submarineFound;


    public String strategyName() {
        return "Strategic search";
    }

    public int numberOfCellsSearched() {
        return cells;
    }

    public void search(boolean[][] grid) {
        int hitcounter = 0;
        Random rand = new Random();
        Grid checkedGrid = new Grid();
        boolean checked[][] = checkedGrid.getGrid();
        while (!submarineFound && !carrierFound) {
            int randomOne = rand.nextInt(25);
            int randomTwo = rand.nextInt(25);
            if (!checked[randomOne][randomTwo]) {
                checked[randomOne][randomTwo] = true;
                if (grid[randomOne][randomTwo]) {
                    for(int j = 0; j < 25; j++) {
                        if (grid[randomOne][j]) {
                            hitcounter++;
                            if(hitcounter == 1)
                                location  = "(" + randomOne + "," + j + ")";
                        }
                        if (hitcounter == 1 && !carrierFound)
                            carrierLocation = location;
                        if (hitcounter == 5) {
                            submarineFound = false;
                            carrierFound = true;
                            hitcounter = 0;
                        }
                        if (!submarineFound && hitcounter == 3) {
                            submarineLocation = location;
                            submarineFound = true;
                        }
                    }
                }
                cells++;
            }
        }
    }

    public String getCarrierLocation() {
        return carrierLocation;
    }

    public String getSubmarineLocation() {
        return submarineLocation;
    }
}
