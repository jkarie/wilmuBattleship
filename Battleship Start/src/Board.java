import java.util.ArrayList;

public class Board {

   // private int[][] standardBoard = new int[10][10];


    //the method below creates the board for the game
   public  void createBoard (int[][] standardBoard){

       for (int number =0; number <10; number++ ) //this for loop assigns the default -1 value to the 'rows' then the 'columns'
           for (int letter =0; letter <10; letter++ )
               standardBoard [number][letter] = -1;

    }

    //the method below will print out thr board as it stands
    public  void printBoard (int[][] standardBoard){
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
}
