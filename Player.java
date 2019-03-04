//this class contains the methods that allow the player to shoot, hit, and register that shot on the board
import java.util.Scanner;
public class Player {

//the method below allows the User to input coordinates that will be checked against the muilt-array Board. There is a try/catch to check input
    public  void shoot (int[] shot) {
        Scanner input = new Scanner(System.in);
        Scanner rowScanner = new Scanner(System.in);

        try {
            System.out.println("Captain, what Row should we fire on?:");
            shot[0] = input.nextInt();
            shot[0]--;
        }
        catch (Exception e) {
            System.out.println("Sir, your must enter a number.");
        }


        try {
            System.out.println("Captain, what Column should we fire on?:");
            String rowEntry = rowScanner.nextLine();
            rowEntry = rowEntry.toLowerCase();
            char finalChar = rowEntry.charAt(0);
            int charConvertInt = finalChar - 97;
            shot[1] = charConvertInt;
        }
        catch (Exception e) {
            System.out.println("Sir, you must enter a letter.");
        }



        //shot[1] = input.nextInt();
        //shot[1] --;
    }

    public  boolean hit (int[] shot, int[][] fleet ) {

        for (int ship = 0; ship < fleet.length; ship++) {
            if (shot[0] == fleet[ship][0] && shot[1] == fleet[ship][1]) {
                System.out.println("Captain, you have hit a battlship!");
                return true;



            }
        }

        System.out.println("Captain, we have fired on empty sea.");

        return false;
    }


    //this method registers the shot and changes the board to 1 if it hits and to 0 if it misses
    public  void registerFire (boolean didItHit, int[] shot, int[][] fleet, int[][] standardBoard) {
        if (didItHit == true)
            standardBoard[shot[0]][shot[1]]=1;
        else
            standardBoard[shot[0]][shot[1]]=0;
    }
}
