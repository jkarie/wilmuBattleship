public class BoardTest {
    /*

    David Quartarolo & Joel Karie Allen
    CSC 325 (Haddad)
    Wilmington University
    3MARCH2019

     Welcome to Battleship!
     This version of the game relies on multi dimensional arrays. The default value of the array is -1 (no attempt at hit).
     During gameplay this value changes to 0 (shot attempted, no hit) and 1 (shot attempted, hit).
     Code based off of progressivejava.net.

     */

    public static void main (String [] args){

        int [] shot = new int[2]; //this int array is used to give two coordinates (row and column) to fire on
        Player newPlayer = new Player(); //this creates a new player that will give access to the Player class


        int[][] standardBoard = new int[10][10]; //this creates a 'standard' 10x10 board. It is an array of arrays (multi-dimension array)
        Board newBoard = new Board(); // a new board object used to invoke the Board class

        int[][] fleet = new int[3][2]; //this int array sets up a [number of ships] and its [coordinates]
        Ship inTheNavy = new Ship(); //this creates a new 'ship' that will give acces to the Ship class

        boolean didItHit; //this boolean is used to determine whether or not the help method is used
        didItHit = false;

        int versuch =0; //this int adds up the number of tries (versuch)
        int hits =0;

        //The game play begins below

        newBoard.createBoard(standardBoard); //setting up board

        inTheNavy.setFleet(fleet); //set ships on the board


        //this do while loop with execute 'player turns' unit the hit counter reaches 3
        do{
            newBoard.printBoard(standardBoard); //this is a printout of board for the user to see
            try { // try/catch is used to makes sure User enters valid coordinates
                newPlayer.shoot(shot); //Shoot method allows user to 'fire'

                versuch++; //the number of tries increases

                if (newPlayer.hit(shot, fleet)){ //if the player hits, he will proceed without hint
                    hits++;
                    System.out.println("You have sunk " + hits + " Battleships, Captain.");
                    didItHit = true;
                    //newBoard.help(shot,fleet,versuch);

                }
                else newBoard.help(shot,fleet,versuch); //if the player misses, he will recieve a hint
                System.out.println();

                newPlayer.registerFire(didItHit, shot,fleet,standardBoard); //Results of shot are recorded in this method
                didItHit = false;} //resets this boolean for the next loop
            catch (Exception e) {
                System.out.println("Sir, please check your coordinates."); //this is the catch if the User enters a incorrect coordinate
            }


        } while (hits<3); //this is the condition of the end of the loop

        System.out.println("Captain, you have sunk all the Battleships!"); //this is printed at the end of the game(loop)
    }


}
  
