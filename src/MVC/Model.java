package MVC;

public class Model {

    private int[][] gameGrid;
    public int turnCounter;
    public Token playerToken;

    public Model () {

        //constructor
        turnCounter = 0;
        gameGrid = new int[3][3];
    }

    public void setToken () {

        //sets the Token dependent on the turn counter
        if (turnCounter % 2 == 0) {
            playerToken = Token.X;//
        } else {
            playerToken = Token.O;//
        }
        turnCounter++;
    }

    public int[][] getGameGrid () {

        //getter gameGrid
        return gameGrid;
    }
}