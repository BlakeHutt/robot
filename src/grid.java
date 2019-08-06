
/**
 *
 * @author blake
 */

public class grid {

    private static final int MININT = 0, MAXINT = 5;
    private int[][] size = new int[MAXINT][MAXINT];

    public boolean isValid(int x){

        if(x >= MININT && x < MAXINT){
            return true;
        }
        return false;
    }
}
