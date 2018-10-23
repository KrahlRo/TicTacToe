package MVC;

public class Model {

    int[][] array;
    String symbol;
    int counter;

    public Model(){

        counter = 0;
        array = initialize(new int[3][3]);
    }

    public void setChoice(){

        if (counter % 2 == 0){
            symbol = "X";
        }else{
            symbol = "O";
        }
        counter++;
    }

    private static int[][] initialize(int[][] array) {

        //fill the empty array with spaces
        for(int counterInnerArray = 0; counterInnerArray < array.length; counterInnerArray++) {
            for(int counterElem = 0; counterElem < array[0].length; counterElem++)
                array[counterInnerArray][counterElem] = 0;
        }
        return array;
    }
}