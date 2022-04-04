package a.b.bsk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import a.b.bsk.implementation.BowlingGame;
import a.b.bsk.implementation.Frame;

public class US04 {

    @Test
    public void test () {
        BowlingGame game = new BowlingGame();
        Frame frame1 = new Frame( 1, 0 );

        game.addFrame( frame1 );

        final Frame frameTest = new Frame( frame1.getThrow1(), frame1.getThrow2() );

        assertEquals( frame1.getThrow1(), frameTest.getThrow1() );
        assertEquals( frame1.getThrow2(), frameTest.getThrow2() );

        game = new BowlingGame();
        frame1 = new Frame( 1, 2 );
        final Frame frame2 = new Frame( 5, 4 );
        final Frame frame3 = new Frame( 4, 3 );
        game.addFrame( frame1 );
        game.addFrame( frame2 );
        game.addFrame( frame3 );
        assertEquals( frame1.getThrow1(), new Frame( frame1.getThrow1(), frame1.getThrow2() ).getThrow1() );
        assertEquals( frame1.getThrow2(), new Frame( frame1.getThrow1(), frame1.getThrow2() ).getThrow2() );

        assertEquals( frame2.getThrow1(), new Frame( frame2.getThrow1(), frame2.getThrow2() ).getThrow1() );
        assertEquals( frame2.getThrow2(), new Frame( frame2.getThrow1(), frame2.getThrow2() ).getThrow2() );

        assertEquals( frame3.getThrow1(), new Frame( frame3.getThrow1(), frame3.getThrow2() ).getThrow1() );
        assertEquals( frame3.getThrow2(), new Frame( frame3.getThrow1(), frame3.getThrow2() ).getThrow2() );

        game = new BowlingGame();

        try {
            game.addFrame( new Frame( 1, 2 ) );
        }
        catch ( final Exception e ) {
            e.printStackTrace();
            fail();
        }

        game.addFrame( new Frame( 2, 3 ) );
        assertEquals( 8, game.score() );

        game.addFrame( new Frame( 5, 4 ) );
        assertEquals( 17, game.score() );

    }

}
