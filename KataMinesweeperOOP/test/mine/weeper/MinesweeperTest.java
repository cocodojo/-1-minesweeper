/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mine.weeper;

import org.junit.Test;

/**
 *
 * @author ciber_000
 */
public class MinesweeperTest {

    public MinesweeperTest() {
    }

    /**
     * Test of getNeighbors method, of class Minesweeper.
     */
    @Test
    public void testGetNeighbors1() {

        int row = 4;
        int column = 4;

        char[][] data = new char[][]{
            {'*', '.', '.', '.'},
            {'.', '.', '.', '.'},
            {'.', '*', '.', '.'},
            {'.', '.', '.', '.'}
        };

        Cell[][] expected = new Cell[][]{
            {new Cell(-1, true), new Cell(1, true), new Cell(0, true), new Cell(0, true)},
            {new Cell(2, true), new Cell(2, true), new Cell(1, true), new Cell(0, true)},
            {new Cell(1, true), new Cell(-1, true), new Cell(1, true), new Cell(0, true)},
            {new Cell(1, true), new Cell(1, true), new Cell(1, true), new Cell(0, true)},};

        Minesweeper mw = new Minesweeper(data);
        Cell[][] found = mw.getData();


        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                assert found[r][c].getValue() == expected[r][c].getValue();
            }

        }

    }

    @Test
    public void testGetNeighbors2() {

        int row = 3;
        int column = 5;

        char[][] data = new char[][]{
            {'*', '*', '.', '.', '.'},
            {'.', '.', '.', '.', '.'},
            {'.', '*', '.', '.', '.'}
        };

        Cell[][] expected = new Cell[][]{
            {new Cell(-1, true), new Cell(-1, true), new Cell(1, true), new Cell(0, true), new Cell(0, true)},
            {new Cell(3, true), new Cell(3, true), new Cell(2, true), new Cell(0, true), new Cell(0, true)},
            {new Cell(1, true), new Cell(-1, true), new Cell(1, true), new Cell(0, true), new Cell(0, true)}};

        Minesweeper mw = new Minesweeper(data);
        Cell[][] found = mw.getData();


        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                assert found[r][c].getValue() == expected[r][c].getValue();
            }

        }

    }
}
