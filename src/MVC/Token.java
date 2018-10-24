package MVC;

public enum Token {

    EMPTY (" ", 0), X ("X", 1), O ("O", -1);

    private final String symbol;
    private final int value;

    Token (String symbol, int value) {

        //constructor
        this.symbol = symbol;
        this.value = value;
    }

    public String getSymbol () {

        //getter symbol
        return this.symbol;
    }

    public int getValue () {

        //getter value
        return this.value;
    }
}