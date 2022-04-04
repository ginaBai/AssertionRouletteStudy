package a.b.bsk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import a.b.bsk.implementation.Frame;

public class US02 {

    @Test
    public void testFrameScore () {
        Frame f = new Frame( 2, 4 );
        assertEquals( 6, f.score() );

        f = new Frame( 0, 0 );
        assertEquals( 0, f.score() );
    }

    @Test
    public void testAllPinsFrameScore () {
        final Frame f = new Frame( 10, 0 );
        assertEquals( 10, f.score() );
    }

    @Test ( expected = Exception.class )
    public void testExceptionMoreThan10PinsPerFrame () {
        final Frame f = new Frame( 12, 12 );
        f.score();
    }
}
