package a.b.bsk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import a.b.bsk.implementation.BowlingGame;
import a.b.bsk.implementation.Frame;

public class US03 {

    @Test
    public void testGameWithFramesIsCreated () {
        final BowlingGame game = new BowlingGame();
        for ( int i = 1; i < 11; i++ ) {
            game.addFrame( new Frame( 1, 1 ) );
        }

        assertNotNull( game );
    }

    @Test
    public void testEmptyGameIsCreated () {
        final BowlingGame game = new BowlingGame();
        assertNotNull( game );
    }

    @Test
    public void testGameObjectIsCreated () {
        final BowlingGame game = new BowlingGame();
        assertEquals( "BowlingGame", game.getClass().getSimpleName() );

    }
}
