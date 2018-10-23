package MVC;

public class Model {

    int[][] gameGrid;
    int turnCounter;
    String token;

    public Model () {

        //constructor
        turnCounter = 0;
        gameGrid = initializeGameGrid(new int[3][3]);
    }

    public void setPlayer () {

        //sets the player token dependent on the current turn counter
        if (turnCounter % 2 == 0) {
            token = "X";//
        } else {
            token = "O";//
        }
        turnCounter++;
    }

    private static int[][] initializeGameGrid (int[][] array) {

        //fills the empty game grid with nulls
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = 0;
            }
        }
        return array;
    }
}