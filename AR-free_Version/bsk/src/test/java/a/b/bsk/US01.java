package a.b.bsk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import a.b.bsk.implementation.Frame;

public class US01 {

    @Test
    public void testEmptyFrameIsCreated () {
        final Frame f = new Frame();
        assertNotNull( f );
    }

    @Test
    public void testFrameWithScoreIsCreated () {
        final Frame f = new Frame( 1, 2 );
        assertNotNull( f );
    }

    @Test ( expected = Exception.class )
    public void testExceptionMoreThan10PinsPerFrame () {
        final Frame f = new Frame( 12, 12 );
        assertNotNull( f );
    }

    @Test
    public void testFrameIsCreatedWithCorrectName () {
        final Frame f = new Frame();
        assertEquals( "Frame", f.getClass().getSimpleName() );
    }
}
