/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mine.weeper;

import java.util.List;

/**
 *
 * @author ciber_000
 */
public class Minesweeper {

    private Cell[][] cells;

    public Minesweeper(char[][] data) {
        final int nroRows = data.length;
        final int nroColumns = data[0].length;

        cells = new Cell[nroRows][nroColumns];
        for (int row = 0; row < nroRows; row++) {
            for (int colum = 0; colum < nroColumns; colum++) {
                int value = data[row][colum] == '*' ? -1 : 0;
                cells[row][colum] = new Cell(value, false);
            }
        }

        for (int row = 0; row < nroRows; row++) {
            for (int column = 0; column < nroColumns; column++) {
                Cell cell = cells[row][column];
                if (column > 0 && row > 0) {
                    cell.addNeighbors(cells[row - 1][column - 1]);
                }
                if (row > 0 && column < nroColumns - 1) {
                    cell.addNeighbors(cells[row - 1][column + 1]);
                }
                if (row > 0) {
                    cell.addNeighbors(cells[row - 1][column]);
                }

                if (column > 0) {
                    cell.addNeighbors(cells[row][column - 1]);
                }
                if (column < nroColumns - 1) {
                    cell.addNeighbors(cells[row][column + 1]);
                }

                if (column > 0 && row < nroRows - 1) {
                    cell.addNeighbors(cells[row + 1][column - 1]);
                }
                if (row < nroRows - 1 && column < nroColumns - 1) {
                    cell.addNeighbors(cells[row + 1][column + 1]);
                }
                if (row < nroRows - 1) {
                    cell.addNeighbors(cells[row + 1][column]);
                }
            }
        }
    }

    public Cell[][] getData() {
        return cells;
    }

    public List<Cell> getNeighbors(int row, int column) {
        return null;
    }
}
