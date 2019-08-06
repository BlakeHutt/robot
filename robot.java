/*
 *
 * @author Blake
 *
 */

public class robot {

    private enum direction {
        SOUTH,
        NORTH,
        EAST,
        WEST
    }

    private int x, y;
    private direction dir;

    private grid grid;

    public robot(grid grid){
        this.grid = grid;
    }

    public robot(grid grid, int x, int y, String d){
        this.x = x;
        this.y = y;
        this.grid = grid;

        switch (d.toUpperCase()){
            case "NORTH":
                this.dir = direction.NORTH;
                break;
            case "SOUTH":
                this.dir = direction.SOUTH;
                break;
            case "WEST":
                this.dir = direction.WEST;
                break;
            case "EAST":
                this.dir = direction.EAST;
                break;
            default:
                break;
        }
        
    }

    public void place(int x, int y, String d){
        this.x = x;
        this.y = y;

        switch (d.toUpperCase()) {
            case "NORTH":
                this.dir = direction.NORTH;
                break;
            case "SOUTH":
                this.dir = direction.SOUTH;
                break;
            case "WEST":
                this.dir = direction.WEST;
                break;
            case "EAST":
                this.dir = direction.EAST;
                break;
            default:
                break;
        }
    }

    public void move(){
        
        switch(this.dir){
                  case NORTH:
                if(grid.isValid(this.y+1)){
                   this.y++;
                }
                break;
            case SOUTH:
                if(grid.isValid(this.y-1)){
                    this.y--;
                }
                break;
            case EAST:
                if(grid.isValid(this.x+1)){
                    this.x++;
                }
                break;
            case WEST:
                if(grid.isValid(this.y-1)){
                    this.y--;
                }
                break;
            default:
                System.err.print("Should not reach here");
                break;
        }
    }

    public void left(){

        switch(this.dir){
              case NORTH:
                this.dir = direction.WEST;
                break;
            case WEST:
                this.dir = direction.SOUTH;
                break;
            case SOUTH:
                this.dir = direction.EAST;
                break;
            case EAST:
                this.dir = direction.NORTH;
                break;
            default:
                System.err.print("Should not reach here");
                break;
        }
    }

    public void right(){
            
            switch(this.dir){
            case NORTH:
                this.dir = direction.EAST;
                break;
            case WEST:
                this.dir = direction.NORTH;
                break;
            case SOUTH:
                this.dir = direction.WEST;
                break;
            case EAST:
                this.dir = direction.SOUTH;
                break;
            default:
                System.err.print("Should not reach here");
                break;
        }
    }
    
    public void report(){

        System.out.println("Output: " + this.x + "," + this.y + "," +
                this.dir);
    }
}


