/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

/**
 *
 * @author psson73@hotmail.com
 */
public class SudokuRow {
    
    private SudokuGrid myGrid;
    private final int cellRow;
    private final int cellColumn;
    
    /**
     * Constructor that initiate the baseCell that defines the row
     * @param cellRow
     * @param cellColumn 
     */
    public SudokuRow( int cellRow, int cellColumn ) {
        this.cellRow = cellRow;
        this.cellColumn = cellColumn;
    }
    
    /**
     * Returns a reference to the baseCell
     * @return 
     */
    public int getCellRow() {
        return cellRow;
    }
    
}
