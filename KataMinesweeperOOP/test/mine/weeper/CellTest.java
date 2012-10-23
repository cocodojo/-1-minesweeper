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
public class CellTest {

    /**
     * Test of getValue method, of class Cell.
     */
    @Test
    public void testGetValue1() {
        Cell cell = new Cell(0, false);
        Cell n1 = new Cell(-1, true);

        cell.addNeighbors(n1);


        int expected = 1;

        int found = cell.getValue();

        assert expected == found;
    }

    /**
     * Test of getValue method, of class Cell.
     */
    @Test
    public void testGetValue2() {
        Cell cell = new Cell(0, false);
        Cell n1 = new Cell(-1, true);
        Cell n2 = new Cell(0, true);

        cell.addNeighbors(n1);
        cell.addNeighbors(n2);

        int expected = 1;

        int found = cell.getValue();

        assert expected == found;
    }
}
