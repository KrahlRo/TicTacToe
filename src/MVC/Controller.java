package MVC;

public class Controller {

    private Model model;
    private View view;

    int[][] gameGrid = model.getGameGrid();
    int [] coordinates = view.getCoordinates();

    public Controller (Model model, View view) {

        //constructor
        this.model = model;
        this.view = view;
    }

    public void update () {

        //updates a specific cell in the game grid dependent on the partly reverse changed coordinates
        coordinates[1] = reverseChanger(coordinates[1]);
        if (gameGrid[coordinates[1]][coordinates[0]] == Token.EMPTY.getValue()) {
            gameGrid[coordinates[1]][coordinates[0]] = model.playerToken.getValue();
        } else {
            System.out.println("cell is already filled!");
        }
    }

    public boolean checker () {

        //checks if the game status is determined
        int diagonalAscendingSum = 0;
        int diagonalDescendingSum = 0;
        for (int i = 0; i < gameGrid.length; i++) {
            diagonalAscendingSum += gameGrid[i][i];
            diagonalDescendingSum += gameGrid[i][2 - i];
        }
        if (Math.abs(diagonalAscendingSum) == 3 || Math.abs(diagonalDescendingSum) == 3) {
            return true;
        }
        for (int i = 0; i < gameGrid.length; i++) {
            int rowSum = 0;
            int columnsSum = 0;
            for (int j = 0; j < gameGrid.length; j++) {
                rowSum += gameGrid[i][j];
                columnsSum += gameGrid[j][i];
            }
            if (Math.abs(rowSum) == 3 || Math.abs(columnsSum) == 3) {
                return true;
            }
        }
        return false;
    }

    private static int reverseChanger (int yCoordinate) {

        /*reverse changes the value of the y-coordinate,
        because the game grid structure doesn't match the one of a coordinate system*/
        switch (yCoordinate) {
            case 0:
                yCoordinate = 2;
                break;
            case 2:
                yCoordinate = 0;
                break;
        }
        return yCoordinate;
    }
}