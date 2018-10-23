package MVC;

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {

        this.model = model;
        this.view = view;
    }

    public void update() {

        //update a specific location in the array
        if (model.array[view.coordinates[1]][view.coordinates[0]] == 0) {
            if (model.symbol.equals("X")) {
                model.array[view.coordinates[1]][view.coordinates[0]] = 1;
            } else {
                model.array[view.coordinates[1]][view.coordinates[0]] = -1;
            }
        } else {
            System.out.println("cell is already filled!");
        }
    }

    public boolean checker() {
        int sumDiagonalAscending = 0;
        int sumDiagonalDescending = 0;

        for (int i = 0; i <= 2; i++) {
            sumDiagonalAscending += model.array[i][i];
            sumDiagonalDescending += model.array[i][2 - i];
        }
        if (Math.abs(sumDiagonalAscending) == 3 || Math.abs(sumDiagonalDescending) == 3) {
            return true;
        }
        for (int i = 0; i <= 2; i++) {
            int sumRows = 0;
            int sumColumns = 0;
            for (int j = 0; j <= 2; j++) {
                sumRows += model.array[i][j];
                sumColumns += model.array[j][i];

            }
            if (Math.abs(sumRows) == 3 || Math.abs(sumColumns) == 3) {
                return true;
            }
        }
        return false;
    }
}