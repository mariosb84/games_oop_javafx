package ru.job4j.chess.firuges;

import ru.job4j.chess.FigureNotFoundException;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.Logic;
import ru.job4j.chess.OccupiedCellException;
import ru.job4j.chess.firuges.black.BishopBlack;

import java.util.Arrays;

import static ru.job4j.chess.firuges.Cell.C8;

public class ChessTest {

    public static void main(String[] args) throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {

        Logic logic = new Logic();
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        logic.add(bishopBlack);
        logic.move(bishopBlack.position(), Cell.H6);
       // System.out.println(bishopBlack.position());
       // System.out.println(Arrays.toString(bishopBlack.way(Cell.G5)));
       // System.out.println(bishopBlack.copy(Cell.H6).position());

    }
}
