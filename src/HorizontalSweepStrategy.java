public class HorizontalSweepStrategy implements SearchStrategy {
    private int cells;
    private boolean carrierFound;
    private boolean submarineFound;
    private String location;
    private String submarineLocation;
    private String carrierLocation;

    HorizontalSweepStrategy() {
        cells = 0;
        carrierFound = false;
        submarineFound = false;
    }

    public String strategyName() {
        return "Horizontal Sweep";
    }

    public int numberOfCellsSearched() {
        return cells;
    }

    public String getSubmarineLocation() {
        return submarineLocation;
    }

    public String getCarrierLocation() {
        return carrierLocation;
    }

    public void search(boolean[][] grid) {
        int hitcounter = 0;
        search: {
            for (int i = 0; i < 25; i++) {
                for (int j = 0; j < 25; j++) {
                    if (grid[i][j]) {
                        hitcounter++;
                        if(hitcounter == 1)
                            location  = "(" + i + "," + j + ")";
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
                    if(carrierFound && submarineFound)
                        break search;
                    cells++;
                }
            }
        }
    }
}
