public class BoardTest {
    /* Hi Dave,
    I started working on the board class. This is HEAVILY based off a code I like on progressivejava.net.I went through a lot of codes and found this to be the most 'elegant.'
    I made adjustments for the traditional game board.

    This version of the game relies on multi dimensional arrays. The default value of the array is -1 (no attempt at hit).
    During gameplay this value changes to 0 (shot attempted, no hit) and 1 (shot attempted, hit). It might be nice to add a fourth value: 2 (sunk ship)
     */
    public static void main (String [] args){  //below are the statements needed in the main method to make the board class work

        int[][] standardBoard = new int[10][10]; //this creates a 'standard' 10x10 board. It is an array of arrays (multi-dimension array)
        Board newBoard = new Board(); // a new board object used to invoke the Board class

        newBoard.createBoard(standardBoard); //Board object uses the createBoard method to 'creat' a board for the game
        newBoard.printBoard(standardBoard);  //Board object can print out the board with this method (I thought it would be a nice touch)

    }
}
