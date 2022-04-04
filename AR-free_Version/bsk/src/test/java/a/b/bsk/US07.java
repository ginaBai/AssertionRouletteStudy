package a.b.bsk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import a.b.bsk.implementation.BowlingGame;
import a.b.bsk.implementation.Frame;

public class US07 {

    @Test
    public void testSpareAfterStrikeAtTheBeginningForm () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 2, 8 ) );
        game.addFrame( new Frame( 1, 0 ) );
        game.addFrame( new Frame( 4, 2 ) );
        game.addFrame( new Frame( 8, 0 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 70, game.score() );
    }

    @Test
    public void testSpareAfterStrikeAtTheBeginningContent () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 0, 10 ) );
        game.addFrame( new Frame( 1, 2 ) );
        game.addFrame( new Frame( 4, 2 ) );
        game.addFrame( new Frame( 8, 0 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 72, game.score() );
    }

    @Test
    public void testSpareAfterStrikeInTheMiddleForm () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 4, 5 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 1, 9 ) );
        game.addFrame( new Frame( 3, 7 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 99, game.score() );
    }

    @Test
    public void testSpareAfterStrikeInTheMiddleContent () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 3, 5 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 1, 9 ) );
        game.addFrame( new Frame( 2, 5 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 92, game.score() );
    }

    @Test
    public void testSpareAfterStrikeInTheMiddleZeroBoniForm () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 1, 5 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 2, 8 ) );
        game.addFrame( new Frame( 0, 0 ) );
        game.addFrame( new Frame( 0, 0 ) );
        game.addFrame( new Frame( 0, 0 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 55, game.score() );
    }

    @Test
    public void testSpareAfterStrikeInTheMiddleZeroBoniContent () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 1, 5 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 1, 9 ) );
        game.addFrame( new Frame( 0, 0 ) );
        game.addFrame( new Frame( 0, 0 ) );
        game.addFrame( new Frame( 1, 4 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 60, game.score() );
    }

    @Test
    public void testSpareAfterStrikeAtTheBeginningZeroBoniContent () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 2, 8 ) );
        game.addFrame( new Frame( 0, 0 ) );
        game.addFrame( new Frame( 4, 2 ) );
        game.addFrame( new Frame( 8, 0 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 68, game.score() );
    }

    @Test
    public void testDoubleStrikeDoubleSpareForm () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 0, 10 ) );
        game.addFrame( new Frame( 2, 8 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 91, game.score() );
    }

    @Test
    public void testStrikeAfterSpareAtTheBeginningForm () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 2, 8 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 1, 0 ) );
        game.addFrame( new Frame( 4, 2 ) );
        game.addFrame( new Frame( 8, 0 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 70, game.score() );
    }

    @Test
    public void testStrikeAfterSpareAtTheBeginningContent () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 0, 10 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 1, 2 ) );
        game.addFrame( new Frame( 4, 2 ) );
        game.addFrame( new Frame( 8, 0 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 74, game.score() );
    }

    @Test
    public void testStrikeAfterSpareInTheMiddleForm () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 4, 5 ) );
        game.addFrame( new Frame( 2, 4 ) );
        game.addFrame( new Frame( 3, 7 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 2, 6 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 85, game.score() );
    }

    @Test
    public void testStrikeAfterSpareInTheMiddleContent () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 5, 1 ) );
        game.addFrame( new Frame( 7, 2 ) );
        game.addFrame( new Frame( 1, 7 ) );
        game.addFrame( new Frame( 1, 9 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 82, game.score() );
    }

    @Test
    public void testStrikeAfterSpareAtTheBeginningZeroBoniContent () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 2, 8 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 0, 0 ) );
        game.addFrame( new Frame( 4, 2 ) );
        game.addFrame( new Frame( 8, 0 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 68, game.score() );
    }

    @Test
    public void testStrikeAfterSpareAtTheBeginningZeroBoniForm () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 1, 9 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 0, 0 ) );
        game.addFrame( new Frame( 4, 2 ) );
        game.addFrame( new Frame( 8, 0 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 68, game.score() );

    }

    @Test
    public void testDoubleSpareDoubleStrikeForm () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 1, 9 ) );
        game.addFrame( new Frame( 2, 8 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 1, 0 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 89, game.score() );
    }

    @Test
    public void testDoubleSpareDoubleStrikeContent () {
        final BowlingGame game = new BowlingGame();
        game.addFrame( new Frame( 1, 9 ) );
        game.addFrame( new Frame( 2, 8 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 10, 0 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 2, 3 ) );
        game.addFrame( new Frame( 1, 3 ) );
        game.addFrame( new Frame( 1, 6 ) );
        game.addFrame( new Frame( 2, 0 ) );
        game.addFrame( new Frame( 5, 1 ) );

        assertEquals( 95, game.score() );
    }

}
