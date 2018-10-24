package MVC;
import java.util.Scanner;

public class View {

    private Model model;
    private int[] coordinates;
    int[][] gameGrid = model.getGameGrid();

    public View (Model model) {

        //constructor
        this.model = model;
        coordinates = new int[2];
    }

    public void IO () {

        //calls the 'printGameGrid' method and lets the user do his inputs (coordinates of a cell)
        printGameGrid(gameGrid);//
        Scanner scanner = new Scanner(System.in);
        System.out.println("player " + model.playerToken.getSymbol() + "\ninput x-coordinate(0-2)");
        coordinates[0] = scanner.nextInt();
        System.out.println("input y-coordinate(0-2)");
        coordinates[1] = scanner.nextInt();
    }

    private static void printGameGrid (int[][] array) {

        //prints out the game grid visually in characters
        for (int i = 0; i < array.length; i++) {
            StringBuilder singleLine = new StringBuilder();
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == Token.EMPTY.getValue()) {
                    singleLine.append(Token.EMPTY.getSymbol());
                } else if (array[i][j] == Token.X.getValue()) {
                    singleLine.append(Token.X.getSymbol());
                } else {
                    singleLine.append(Token.O.getSymbol());
                }
                if (j < array[0].length - 1) {
                    singleLine.append("|");
                }
            }
            System.out.println(singleLine);
            if (i < 2) {
                System.out.println("-----");
            }
        }
    }

    public int[] getCoordinates () {

        //getter coordinates
        return coordinates;
    }
}