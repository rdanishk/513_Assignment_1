public class BattleshipSearch {
    BattleshipSearch(Grid grid) {
        search(grid);
    }

    public void search(Grid grid) {
        SearchStrategy strategy = new HorizontalSweepStrategy();
        boolean gridArr[][] = grid.getGrid();
        strategy.search(gridArr);
    }
}
