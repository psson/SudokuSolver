/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

/**
 *
 * @author andreas.pettersson
 */
public class SudokuGrid {
    
    private static final int NUM_ROWS = 9;
    private static final int NUM_COLS = 9;
    
    private SudokuCell[][] cellGrid;
    
    public SudokuGrid() {
        cellGrid = new SudokuCell[NUM_ROWS][NUM_COLS];
    }
    
}
