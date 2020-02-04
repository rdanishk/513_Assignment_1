public interface SearchStrategy {
    public String strategyName();
    public int numberOfCellsSearched();
    public void search(boolean[][] grid);
}
