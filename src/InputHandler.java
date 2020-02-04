import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class InputHandler {
    public String readInput() {
        String input = "";
        String path = "/Users/danish/Documents/Northern Illinois University/Assignments and Projects/513_Assignment_1/input.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
            input = content.toString();
        } catch(Exception e) {
            System.out.println(e);
        }
        return input;
    }

    public String[][] tokenizer(String input) {
        StringTokenizer battleshipTokenizer = new StringTokenizer(input, "()\n");
        int lineCounter = 0;
        int gameCounter = 0;
        String[][] tokenizedInput = new String[3][8];
        while(battleshipTokenizer.hasMoreTokens()) {
            if(lineCounter < 8) {
                tokenizedInput[gameCounter][lineCounter] = battleshipTokenizer.nextToken();
                lineCounter++;
            } else {
                lineCounter = 0;
                gameCounter++;
                tokenizedInput[gameCounter][lineCounter] = battleshipTokenizer.nextToken();
                lineCounter++;
            }
        }
        return tokenizedInput;
    }
}
