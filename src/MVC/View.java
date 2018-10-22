package MVC;
import java.util.Scanner;

public class View {


    private int[][] array;
    private String symbol;


    public View (int[][] array, String symbol) {
        this.array = array;
        this.symbol = symbol;
        printGrid(this.array);
    }


    public int[] IO () {

        int[] coordinates = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("player " + symbol + "\ninput x-coordinate(0-2)");
        coordinates[0] = scanner.nextInt();
        System.out.println("input y-coordinate(0-2)");
        coordinates[1] = scanner.nextInt();
        printGrid(array);
        return coordinates;
    }


    private static void printGrid (int[][] array) {

        for (int counterInnerArray = 0; counterInnerArray < array.length; counterInnerArray++) {
            String singleLine = "";
            for (int counterElem = 0; counterElem < array[0].length; counterElem++) {
                singleLine += array[counterInnerArray][counterElem];
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