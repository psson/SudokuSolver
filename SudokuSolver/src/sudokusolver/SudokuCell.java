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
public class SudokuCell {
    
    private static final int NUM_POSSIBILITIES = 9;
    private int cellNumber;
    private boolean[] cellPossibilities;
    
    public SudokuCell() {
        
        cellNumber = 0;
        cellPossibilities = new boolean[ NUM_POSSIBILITIES-1 ];
        for( int i=0 ; i<NUM_POSSIBILITIES ; i++ ) {
            cellPossibilities[i] = true;
        }
        
    }
    
    public void setNumber( int number ) {
        
        cellNumber = number;
        
    }
    
    public int getNumber() {
        
        return cellNumber;
        
    }
    
    public boolean isSet() {
        
        if( cellNumber > 0 ) {
            return true;
        } else {
            return false;
        }
        
    }
    
    public void removePossibility( int numToRemove ) {
        
        cellPossibilities[ numToRemove-1 ] = false;
        
    }
    
    public boolean isSolved() {
        
        int numPoss = 0;            // Counts the number of possibilities found
        int lastFoundPoss = 0;      // Contains the index of the last found possibility

        /**
         * Loop through the array of possibilities and count the ones that
         * are still possible.
         */
        for( int i=0 ; i < NUM_POSSIBILITIES ; i++ ) {
            if( cellPossibilities[i] ) {
                numPoss++;
                lastFoundPoss = i+1;
            }
            
            /**
             * If more than one possibility remains the cell is not solved and no
             * further searching is necessary. Break out of the loop.
             */
            if( numPoss > 1 ) {
                break;
            }
        }
        
        /**
         * If there is just one possibility left the correct number has been found.
         * Set the number of the cell and return true.
         */
        if( numPoss == 1 ) {
            
            setNumber(lastFoundPoss);
            return true;
            
        } else {
            return false;
        }
        
    }
    
}
