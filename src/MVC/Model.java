package MVC;

public class Model {

    //todo


    private static String[][] initialize(String[][] array) {

        //fill the empty array with spaces
        for(int counterInnerArray = 0; counterInnerArray < array.length; counterInnerArray++) {
            for(int counterElem = 0; counterElem < array[0].length; counterElem++)
                array[counterInnerArray][counterElem] = " ";
        }
        return array;
    }
}
