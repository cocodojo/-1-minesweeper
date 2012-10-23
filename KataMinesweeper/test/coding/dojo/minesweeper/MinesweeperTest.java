/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coding.dojo.minesweeper;

import org.junit.Test;

/**
 *
 * @author ciber_000
 */
public class MinesweeperTest {

    public MinesweeperTest() {
    }

    /**
     * Test of weepMines method, of class Minesweeper.
     */
    @Test
    public void testWeepMines1() {
        String[] data = {
            "*...",
            "....",
            ".*..",
            "...."};
        String[] expectedSoluction = {
            "*100",
            "2210",
            "1*10",
            "1110"};
        String[] solution = new Minesweeper().weepMines(data);
        for (int i = 0; i < solution.length; i++) {
            String foundLine = solution[i];
            String expectedLine = expectedSoluction[i];
            assert expectedLine.equals(foundLine);
        }
    }

    /**
     * Test of weepMines method, of class Minesweeper.
     */
    @Test
    public void testWeepMines2() {
        String[] data = {
            "**...",
            ".....",
            ".*..."};
        String[] expectedSoluction = {
            "**100",
            "33200",
            "1*100"};
        String[] solution = new Minesweeper().weepMines(data);
        for (int i = 0; i < solution.length; i++) {
            String foundLine = solution[i];
            String expectedLine = expectedSoluction[i];
            assert expectedLine.equals(foundLine);
        }
    }

    /**
     * Test of weepMines method, of class Minesweeper.
     */
    @Test
    public void testCalNumberofMine3() {
        String[] data = {
            "*...",
            "....",
            ".*..",
            "...."};
        int r = 0, c = 0;
        int expected = -1;
        int result = new Minesweeper().calNumberofMine(data, r, c);
        assert result == expected;
    }
    
    @Test
    public void testCalNumberofMine4() {
        String[] data = {
            "*...",
            "....",
            ".*..",
            "...."};
        int r = 0, c = 1;
        int expected = 1;
        int result = new Minesweeper().calNumberofMine(data, r, c);
        assert result == expected;
    }
    
    @Test
    public void testCalNumberofMine5() {
        String[] data = {
            "*...",
            "....",
            ".*..",
            "...."};
        int r = 1, c = 1;
        int expected = 2;
        int result = new Minesweeper().calNumberofMine(data, r, c);
        assert result == expected;
    }
}
