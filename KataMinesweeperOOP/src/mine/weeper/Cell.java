/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mine.weeper;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ciber_000
 */
public class Cell {

    private int value;
    private boolean calculated;
    private List<Cell> neighbors;

    public Cell(int value, boolean calculated) {
        this.value = value;
        this.calculated = calculated;
        neighbors = new LinkedList<>();
    }

    public boolean addNeighbors(Cell cell) {
        return neighbors.add(cell);
    }

    public int getValue() {
        calculated = true;
        if (value == -1) {
            return value;
        }
        
        value = 0;
        for (Cell cell : neighbors) {
            value += (cell.getValue() == -1 )? 1 : 0;
        }
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isCalculated() {
        return calculated;
    }

    public void setCalculated(boolean calculated) {
        this.calculated = calculated;
    }

    public List<Cell> getNeighbors() {
        return neighbors;
    }
}
