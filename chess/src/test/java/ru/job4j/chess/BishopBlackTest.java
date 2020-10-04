package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static ru.job4j.chess.firuges.Cell.*;
//import static sun.jvm.hotspot.runtime.VMOps.Exit;

public class BishopBlackTest {

    @Test
    public void whenPositionSame() {
        BishopBlack  bishopBlack = new BishopBlack(Cell.B1);
        bishopBlack.position();
        assertThat(bishopBlack.position(), is(Cell.B1));
    }
    @Test
    public void whenCopyCorrect() {
        BishopBlack  bishopBlack = new BishopBlack(C8);
        bishopBlack.copy(Cell.C8);
        assertThat(bishopBlack.position().equals(C8), is(true));
    }
    @Test
    public void whenWayCorrect() {
          BishopBlack  bishopBlack = new BishopBlack(C1);
        //BishopBlack  bishopBlack1 = new BishopBlack(A8);
        //BishopBlack  bishopBlack2 = new BishopBlack(H8);
        //BishopBlack  bishopBlack3 = new BishopBlack(H1);
           assertThat(bishopBlack.way(G5), is(new Cell[]{D2,E3,F4,G5}));
         //assertThat(bishopBlack1.way(D5), is(new Cell[]{B7,C6,D5}));
         //assertThat(bishopBlack2.way(E5), is(new Cell[]{G7,F6,E5}));
         //assertThat(bishopBlack3.way(E4), is(new Cell[]{G2,F3,E4}));
    }
    @Test
    public void whenWayIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(C1);
        assertThat(bishopBlack.isDiagonal(C1,G5), is(true));
    }

}
