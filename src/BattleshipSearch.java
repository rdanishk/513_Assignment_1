public class BattleshipSearch {
    BattleshipSearch(Grid grid) {
        search(grid);
    }

    public void search(Grid grid) {
        boolean gridArr[][] = grid.getGrid();
        SearchStrategy strategy = new HorizontalSweepStrategy();
        strategy.search(gridArr);
        System.out.println("Strategy: " + strategy.strategyName());
        System.out.println("Number of cells searched: " + strategy.numberOfCellsSearched());
        System.out.println("Carrier found: " + strategy.getCarrierLocation() + " Submarine found: " + strategy.getSubmarineLocation());

        strategy = new RandomSearchStrategy();
        strategy.search(gridArr);
        System.out.println("Strategy: " + strategy.strategyName());
        System.out.println("Number of cells searched: " + strategy.numberOfCellsSearched());
        System.out.println("Carrier found: " + strategy.getCarrierLocation() + " Submarine found: " + strategy.getSubmarineLocation());

        strategy = new StrategicSearch();
        strategy.search(gridArr);
        System.out.println("Strategy: " + strategy.strategyName());
        System.out.println("Number of cells searched: " + strategy.numberOfCellsSearched());
        System.out.println("Carrier found: " + strategy.getCarrierLocation() + " Submarine found: " + strategy.getSubmarineLocation());
    }
}
