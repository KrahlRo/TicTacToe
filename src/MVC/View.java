package MVC;
import java.util.Scanner;

public class View {

    Model model;
    int[] coordinates = new int[2];

    public View (Model model) {

        this.model = model;
    }

    public int[] IO () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("player " + model.symbol + "\ninput x-coordinate(0-2)");
        coordinates[0] = scanner.nextInt();
        System.out.println("input y-coordinate(0-2)");
        coordinates[1] = scanner.nextInt();
        printGrid(model.array);
        return coordinates;
    }

    private static void printGrid (int[][] array) {

        for (int counterInnerArray = 0; counterInnerArray < array.length; counterInnerArray++) {
            String singleLine = "";
            for (int counterElem = 0; counterElem < array[0].length; counterElem++) {
                if (array[counterInnerArray][counterElem] == 0){
                    singleLine += " ";
                } else if (array[counterInnerArray][counterElem] == 1) {
                    singleLine += "X";
                } else {
                    singleLine += "O";
                }
                if (counterElem < array[0].length - 1){
                    singleLine += "|";
                }
            }
            System.out.println(singleLine);
            if (counterInnerArray < 2){
                System.out.println("-----");
            }
        }
    }
}