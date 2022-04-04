package a.b.bsk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import a.b.bsk.implementation.BowlingGame;
import a.b.bsk.implementation.Frame;

public class US05 {

    @Test
    public void test () {
        BowlingGame game = new BowlingGame();

        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 0, 0 ) );
        game.addFrame( new Frame( 4, 2 ) );
        game.addFrame( new Frame( 8, 0 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 52, game.score() );

        game = new BowlingGame();

        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 2, 5 ) );
        game.addFrame( new Frame( 0, 0 ) );
        game.addFrame( new Frame( 4, 2 ) );
        game.addFrame( new Frame( 8, 0 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 62, game.score() );

        game = new BowlingGame();

        game.addFrame( new Frame( 4, 5 ) );
        game.addFrame( new Frame( 2, 4 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 1, 8 ) );
        game.addFrame( new Frame( 0, 5 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 72, game.score() );

        game = new BowlingGame();

        game.addFrame( new Frame( 5, 1 ) );
        game.addFrame( new Frame( 7, 2 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 9, 0 ) );
        game.addFrame( new Frame( 0, 5 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 72, game.score() );

        game = new BowlingGame();

        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 0, 0 ) );
        game.addFrame( new Frame( 0, 0 ) );
        game.addFrame( new Frame( 4, 2 ) );
        game.addFrame( new Frame( 8, 0 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 48, game.score() );

    }

}
