import java.util.StringTokenizer;

public class Grid {
    private boolean[][] grid;

    public Grid(String[] input) {
        grid = new boolean[25][25];
        populateGrid(input);
    }

    private void populateGrid(String[] input) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < input.length; i++) {
            StringTokenizer coordTokenizer = new StringTokenizer(input[i], ",");
            x = Integer.parseInt(coordTokenizer.nextToken());
            y = Integer.parseInt(coordTokenizer.nextToken());
            grid[x][y] = true;
        }
    }

    public boolean[][] getGrid() {
        return grid;
    }
}