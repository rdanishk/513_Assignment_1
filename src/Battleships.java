public class Battleships {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        String input = inputHandler.readInput();
        String tokenizedInput[][] = inputHandler.tokenizer(input);

        for (int i = 0; i < 3; i++) {
            System.out.println("Game " + (i + 1) + ":");
            Grid grid = new Grid(tokenizedInput[i]);
            BattleshipSearch game = new BattleshipSearch(grid);
            System.out.println("-------------------\n");
        }
    }
}
