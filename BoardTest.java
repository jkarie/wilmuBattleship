public class BoardTest {
    /*
     code based off of progressivejava.net.
     This version of the game relies on multi dimensional arrays. The default value of the array is -1 (no attempt at hit).
     During gameplay this value changes to 0 (shot attempted, no hit) and 1 (shot attempted, hit). It might be nice to add a fourth value: 2 (sunk ship)
     */
    
      public static void main (String [] args){  //below are the statements needed in the main method to make the board class work
  
          int [] shot = new int[2];
         Player newPlayer = new Player();
  
  
          int[][] standardBoard = new int[10][10]; //this creates a 'standard' 10x10 board. It is an array of arrays (multi-dimension array)
          Board newBoard = new Board(); // a new board object used to invoke the Board class
  
          int[][] fleet = new int[3][2];
          Ship inTheNavy = new Ship();
  
          boolean didItHit;
          didItHit = false;
  
          int versuch =0;
          int hits =0;
  
  
          newBoard.createBoard(standardBoard); 
          
          //Board object uses the createBoard method to 'create' a board for the game
          //newBoard.printBoard(standardBoard);  //Board object can print out the board with this method (I thought it would be a nice touch)
  
          inTheNavy.setFleet(fleet);
  
          //newPlayer.shoot(shot);
  
          do{
              newBoard.printBoard(standardBoard);
              try {
                  newPlayer.shoot(shot);
  
              versuch++;
  
              if (newPlayer.hit(shot, fleet)){
                  hits++;
                  System.out.println("You have sunk " + hits + " Battleships, Captain.");
                  didItHit = true;
                  //newBoard.help(shot,fleet,versuch);
  
              }
              else newBoard.help(shot,fleet,versuch);
                  System.out.println();
  
              newPlayer.registerFire(didItHit, shot,fleet,standardBoard);
              didItHit = false;}
              catch (Exception e) {
                  System.out.println("Sir, please check your coordinates.");
              }
  
  
          } while (hits<3);
  
          System.out.println("Captain, you have sunk all the Battleships!");
      }
  
  
  }
  