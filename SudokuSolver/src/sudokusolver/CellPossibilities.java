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
public class CellPossibilities {
    
    private static final int NUM_POSSIBILITIES = 9;
    private boolean[] p;
    
    public CellPossibilities() {
        
        p = new boolean[ NUM_POSSIBILITIES-1 ];
        for( int i=0 ; i<NUM_POSSIBILITIES ; i++ ) {
            p[i] = true;
        }
        
    }
    
    /**
     * Removes a single possibility
     * @param numToRemove The possibility to be removed
     */
    public void removePossibility( int numToRemove ) {
        
        p[ numToRemove-1 ] = false;
        
    }
    
    /**
     * Returns the status for a certain number in this cell
     * @param number The number to be checked
     * @return The current status for the possibility of this number
     */
    public boolean getStatusForNumber( int number ) {
        
        return p[ number-1 ];
        
    }
    
    /**
     * Checks the number of remaining possibilities and returns an integer representing the single remaining possiblity if there is one.
     * @return The single remaining possible number or 0
     */
    public int checkRemaining() {
        
        //TODO: Should throw exception if no possibilities remain. That should be impossible
        
        int numPoss = 0;            // Counts the number of possibilities found
        int lastFoundPoss = 0;      // Contains the index of the last found possibility

        /**
         * Loop through the array of possibilities and count the ones that
         * are still possible.
         */
        for( int i=0 ; i < NUM_POSSIBILITIES ; i++ ) {
            if( p[i] ) {
                numPoss++;
                lastFoundPoss = i+1;
            }
            
            /**
             * If more than one possibility remains, no further searching is necessary. Break out of the loop.
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
            
            return lastFoundPoss;
            
        } else {
            return 0;
        }
        
    }
    
    //TODO:Why does this method exist?
    public void compareAndRemove( CellPossibilities comp ) {
        
        for( int i = 0; i < NUM_POSSIBILITIES -1; i++ ) {
            if( !comp.getStatusForNumber( i ) ) {
                removePossibility( i );
            }
        }
        
    }
}
