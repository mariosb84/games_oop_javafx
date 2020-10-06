package ru.job4j.chess;

import org.hamcrest.Matcher;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.QueenBlack;
import ru.job4j.chess.firuges.white.QueenWhite;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.chess.firuges.Cell.*;
import static ru.job4j.chess.firuges.Cell.G5;

public class
LogicTest {

   @Ignore
    @Test (expected = FigureNotFoundException.class)
    public void whenMoveFindLost()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C2,Cell.H6);
    }
    @Test (expected = IllegalStateException.class)
    public void whenMoveWayLost()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1,Cell.H8);
    }
    @Test (expected = OccupiedCellException.class)
    public void whenMoveFreeLost()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C8));
        logic.add(new QueenWhite(Cell.B7));
        logic.move(Cell.C8,Cell.A6);
    }

}