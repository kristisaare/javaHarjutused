package teema1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {

        int[] board = {randShip(),randShip(),randShip(),randShip(),randShip(),randShip(),randShip(),randShip()};
        System.out.println(Arrays.toString(board));
        System.out.println(board.length + " squares.");

        Scanner user = new Scanner(System.in);
        System.out.println("Please, enter a number between 0 and " + (board.length-1));
        int entry = user.nextInt();

        System.out.println(board[entry]);

        if (board[entry] == 1) {
            System.out.println("Hit!");
        } else {
            System.out.println("Miss!");
        }

        if (board[entry] == 1) {
            board[entry] = 2;       //If ship is hit, mark location with "2" to mark sunken ship.
        }

        System.out.println(Arrays.toString(board));


    }

    public static int randShip(){               // Random value generation 0 or 1 for the board
        int result = (int) (Math.random()*2);
        return result;
    }
}
