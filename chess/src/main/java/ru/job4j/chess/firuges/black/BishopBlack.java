package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        if (!isDiagonal(position, dest)) {
            throw new IllegalStateException(
                    String.format("Could not way by diagonal from %s to %s", position, dest)
            );
        }
        int size = Math.abs(dest.getY() - position.getY());
        Cell[] steps = new Cell[size];
        int a = position.getX();
        int b = position.getY();
        int deltaX = dest.getX() > a ? 1 : -1;
        int deltaY = dest.getY() > b ? 1 : -1;
        for (int index = 0; index < size; index++) {
            int x = index + deltaX + a;
           // a++;
            int y = index + deltaY - b;
            //b--;
            steps[index] = Cell.findBy(x, y);
        }
        return steps;
    }
    public boolean isDiagonal(Cell source, Cell dest) {

        return  ((dest.getX() > source.getX() && dest.getY() > source.getY())
                || (dest.getX() < source.getX() && dest.getY() > source.getY())
                || (dest.getX() < source.getX() && dest.getY() < source.getY())
                || (dest.getX() > source.getX() && dest.getY() < source.getY()));
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
