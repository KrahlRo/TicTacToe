package MVC;

public class Controller {

    Model model;
    View view;

    public Controller (Model model, View view) {

        //constructor
        this.model = model;
        this.view = view;
    }

    public void update () {

        //updates a specific digit in the game grid dependent on the given coordinates
        switch (view.coordinates[1]) {
            case 0:
                view.coordinates[1] = 2;
                break;
            case 2:
                view.coordinates[1] = 0;
                break;
        }
        if (model.gameGrid[view.coordinates[1]][view.coordinates[0]] == Token.EMPTY.getValue()) {
            model.gameGrid[view.coordinates[1]][view.coordinates[0]] = model.playerToken.getValue();
        } else {
            System.out.println("cell is already filled!");
        }
    }

    public boolean checker () {

        //checks if the game status is determined
        int diagonalAscendingSum = 0;
        int diagonalDescendingSum = 0;
        for (int i = 0; i < model.gameGrid.length; i++) {
            diagonalAscendingSum += model.gameGrid[i][i];
            diagonalDescendingSum += model.gameGrid[i][2 - i];
        }
        if (Math.abs(diagonalAscendingSum) == 3 || Math.abs(diagonalDescendingSum) == 3) {
            return true;
        }
        for (int i = 0; i < model.gameGrid.length; i++) {
            int rowSum = 0;
            int columnsSum = 0;
            for (int j = 0; j < model.gameGrid.length; j++) {
                rowSum += model.gameGrid[i][j];
                columnsSum += model.gameGrid[j][i];
            }
            if (Math.abs(rowSum) == 3 || Math.abs(columnsSum) == 3) {
                return true;
            }
        }
        return false;
    }
}