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
public class SudokuCell {
    
    private static final int NUM_POSSIBILITIES = 9;
    private int cellNumber;
    private CellPossibilities myPoss;
    
    public SudokuCell() {
        
        cellNumber = 0;
        myPoss = new CellPossibilities();
        
    }
    
    /**
     * Sets found solution for the cell
     * @param number The final answer for this cell
     */
    public void setNumber( int number ) {
        
        cellNumber = number;
        
    }
    
    /**
     * Gets the found solution for the cell
     * @return The final answer for this cell
     */
    public int getNumber() {
        
        return cellNumber;
        
    }
    
    /**
     * Answers the question whether this cell has a final answer set
     * @return True if an answer is found, false otherwise
     */
    public boolean isSet() {
        
        if( cellNumber > 0 ) {
            return true;
        } else {
            return false;
        }
        
    }
    
    /**
     * Removes one of the remaining possibilities from the cell
     * @param numToRemove The number to remove
     */
    public void removePossibility( int numToRemove ) {
        
        myPoss.removePossibility( numToRemove );
        
    }
    
    public boolean checkPossibilities() {
        
        int r = myPoss.checkRemaining();
        
        if (r > 0) {
            cellNumber = r;
            return true;
        } else {
            return false;
        }
    }
    
}
