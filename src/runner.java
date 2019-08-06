import java.util.Scanner;
/**
 *
 * @author blake
 */

public class runner{

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        String uInput;
        boolean cont = false, placeFirst = false;
        final String delim = "[ , ]+";

        grid area = new grid();
        robot robo = new robot(area);

        while(!placeFirst){
            System.out.println("Place the robot");
            uInput = scan.nextLine();
            String tok[] = uInput.split(delim);
            
            if(tok[0].toUpperCase().equals("PLACE")){
                robo.place(Integer.parseInt(tok[1]), 
                        Integer.parseInt(tok[2]), tok[3]);
                placeFirst = true;
            }
        }
    while(!cont){
        uInput = scan.nextLine();
            String[] tok = uInput.split(delim);

            switch(tok[0].toUpperCase()){
                case "LEFT":
                    robo.left();
                    break;
                case "RIGHT":
                    robo.right();
                    break;
                case "MOVE":
                    robo.move();
                    break;
                case "REPORT":
                    robo.report();
                    cont = true;
                    break;
                default:
                    break;
            }
        }
    }
}
