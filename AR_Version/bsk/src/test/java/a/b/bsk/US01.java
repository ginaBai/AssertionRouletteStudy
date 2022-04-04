package a.b.bsk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import a.b.bsk.implementation.Frame;

public class US01 {

    @Test
    public void test () {
        Frame f = new Frame();
        assertNotNull( f );

        f = new Frame( 1, 2 );

        assertNotNull( f );

        try {
            f = new Frame( 12, 12 );
            fail();
        }
        catch ( final Exception e ) {
            // Exception expected
        }

        f = new Frame();
        assertEquals( "Frame", f.getClass().getSimpleName() );
    }

}
