package ru.job4j.chess;

import org.hamcrest.Matcher;
import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.chess.firuges.Cell.*;
import static ru.job4j.chess.firuges.Cell.G5;

public class
LogicTest {

    @Ignore
    @Test //(expected = new ImpossibleMoveException())
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        //logic.move(Cell.C1, Cell.H8);
        //assertThat(logic.move(Cell.C1, Cell.H8), is (new throw new ImpossibleMoveException()));
    }

}