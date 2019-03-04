//this is the Board class which is used to create the board 'grid,' print out board, and provide hint information
import java.util.ArrayList;
public class Board 


    //the method below creates the board for the game
   public  void createBoard (int[][] standardBoard){

       for (int number =0; number <10; number++ ) //this for loop assigns the default -1 value to the 'rows' then the 'columns'
           for (int letter =0; letter <10; letter++ )
               standardBoard [number][letter] = -1;

    }

    //the method below will print out thr board as it stands
    public void printBoard (int[][] standardBoard){
       System.out.println("\tA. \tB. \tC. \tD. \tE. \tF. \tG. \tH. \tI. \tJ."); //this line creates the banner of letters across the top
       System.out.println();
       for (int number =0; number <10; number++) {
           System.out.print((number+1) + "."); //this will label each row
           for (int letter =0; letter <10; letter++ ) { //this for loop goes through the arrays and prints the value of each cell
               if (standardBoard[number][letter] ==-1){
                   System.out.print("\t" + "-1" );
               } else if (standardBoard[number][letter] ==0){
                   System.out.print("\t" + "0" );
               }
               else if (standardBoard[number][letter] ==1){
                   System.out.print("\t" + "1" );
               }
           } System.out.println(); //this line is necessary to make sure that the text falls into a grid pattern and does not run across one line
       }
    }

//the method below prints out hints about the whereabouts of other ships in the event of a missed shot
    public void help (int[] shot, int[][] fleet, int versuch){
       int number =0;
       int letter =0;
       char intToString;
       int ArrayToInt;


       for (int line=0; line < fleet.length; line++){ //this loop checks the fleet multi-array for other ships on the [][column] and [row]

           if (fleet[line][0] == shot[0])
               number++;
           if (fleet[line][1] == shot[1])
               letter++;


       }
       ArrayToInt = shot[1] +1 ;

        System.out.println(shot[1]);
       System.out.println("Radar is detecting " +number +" ships in Row #" + (shot[0]+1) + ", and " + letter + " ships in the Column " + shot[1] +  " slot(s) from the left.");
    }



}
