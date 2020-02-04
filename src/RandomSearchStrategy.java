import java.util.Random;

public class RandomSearchStrategy implements SearchStrategy {
    private int cells;
    private String carrierLocation = "";
    private String submarineLocation = "";

    RandomSearchStrategy() {
        cells = 0;
    }

    public String strategyName() {
        return "Random Search";
    }

    public int numberOfCellsSearched() {
        return cells;
    }
    public void search(boolean[][] grid) {
        int hitcounter = 0;
        Random rand = new Random();
        Grid checkedGrid = new Grid();
        boolean checked[][] = checkedGrid.getGrid();
        while (hitcounter < 8) {
            int randomOne = rand.nextInt(25);
            int randomTwo = rand.nextInt(25);
            if (!checked[randomOne][randomTwo]) {
                checked[randomOne][randomTwo] = true;
                if (grid[randomOne][randomTwo])
                    hitcounter++;
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
