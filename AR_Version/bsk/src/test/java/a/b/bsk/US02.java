package a.b.bsk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import a.b.bsk.implementation.Frame;

public class US02 {

    @Test
    public void test () {
        Frame f = new Frame( 2, 4 );
        assertEquals( 6, f.score() );

        f = new Frame( 0, 0 );
        assertEquals( 0, f.score() );

        f = new Frame( 10, 0 );

        assertEquals( 10, f.score() );

        try {
            f = new Frame( 12, 12 );
            f.score();
            fail();
        }
        catch ( final Exception e ) {
            // exception expected
        }

    }

}
