//this clss is ised to place the 'ships' (fleet) onto board (standard board)
import java.util.Random;
public class Ship {

//this method places the ships
    public static   void setFleet (int [][] fleet){

        Random chance = new Random();

        for ( int ship = 0; ship < 3; ship++) {
            fleet[ship][0] = chance.nextInt(10);
            fleet[ship][1] = chance.nextInt(10);

            for ( int previous = 0; previous < ship; previous++) {
                if( (fleet[ship][0] == fleet [previous][0]) && (fleet [ship][1] == fleet[previous][1]))
                    do {
                        fleet[ship][0] = chance.nextInt(10);
                        fleet[ship][1] = chance.nextInt(10);
                    }
                while ((fleet[ship][0] == fleet [previous][0] && (fleet [ship][1] == fleet[previous][1])));
            }



        }


    }
}
