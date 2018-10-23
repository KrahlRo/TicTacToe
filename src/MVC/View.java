package MVC;
import java.util.Scanner;

public class View {

    Model model;
    int[] coordinates;

    public View (Model model) {

        //constructor
        this.model = model;
        coordinates = new int[2];
    }

    public void IO () {

        //manages the user in- and outputs
        printGameGrid(model.gameGrid);//
        Scanner scanner = new Scanner(System.in);
        System.out.println("player " + model.token + "\ninput x-coordinate(0-2)");
        coordinates[0] = scanner.nextInt();
        System.out.println("input y-coordinate(0-2)");
        coordinates[1] = scanner.nextInt();
    }

    private static void printGameGrid (int[][] array) {

        //prints out the game grid in characters
        for (int i = 0; i < array.length; i++) {
            StringBuilder singleLine = new StringBuilder();
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 0) {
                    singleLine.append(" ");
                } else if (array[i][j] == 1) {
                    singleLine.append("X");
                } else {
                    singleLine.append("O");
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
}