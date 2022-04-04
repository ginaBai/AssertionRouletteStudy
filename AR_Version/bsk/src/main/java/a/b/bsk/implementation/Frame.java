package a.b.bsk.implementation;

public class Frame {

    private Integer throwOne;
    private Integer throwTwo;

    public Frame ( final Integer a, final Integer b ) {
        if ( ( a + b ) > 10 ) {
            throw new IllegalArgumentException();
        }
        this.throwOne = a;
        this.throwTwo = b;
    }

    public Frame () {

    }

    public int score () {
        return throwOne + throwTwo;
    }

    public Integer getThrow1 () {
        return throwOne;
    }

    public Integer getThrow2 () {
        return throwTwo;
    }

}
