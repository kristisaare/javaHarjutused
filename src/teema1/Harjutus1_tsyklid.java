package teema1;

import java.util.Arrays;

/**
 * Kasutades tsükleid, lahendada järgmised ülesanded:
 * 1. Trükkida ekraanile numbrid 10 kuni 1
 * 2. Trükkida ekraanile paaritud arvud vahemikus 0 kuni 10
 * 3. Trükkida ekraanile selline tabel:
 *    0 1 2 3 4 5 6 7 8 9
 *    1 2 3 4 5 6 7 8 9 0
 *    2 3 4 5 6 7 8 9 0 1
 *    3 4 5 6 7 8 9 0 1 2
 *    4 5 6 7 8 9 0 1 2 3
 *    5 6 7 8 9 0 1 2 3 4
 *    6 7 8 9 0 1 2 3 4 5
 *    7 8 9 0 1 2 3 4 5 6
 *    8 9 0 1 2 3 4 5 6 7
 *    9 0 1 2 3 4 5 6 7 8
 */
public class Harjutus1_tsyklid {
    public static void main(String[] args) {
        for (int a = 1; a<11; a++){ //Print 1-10 v1
            System.out.println(a);
        }
        for (int a = 0; a<10; a++){ //Print 1-10 v2
            System.out.println(a + 1);
        }
        for (int a = 10; a>0; a--){ //Print 10-1
            System.out.println(a);
        }
        for (int a = 0; a<5; a++){ //Print odd numbers from 0-10
            System.out.println(2*a+1);
        }

        int [][] table = new int[10][10];
        for (int a = 0; a<10; a++){
            for (int b = 0; b<10; b++){
                table [a][b] = ((a+b)%10); // Divide by 10, print remainder
            }
        }

        for (int a = 0; a<10; a++){
            System.out.println(Arrays.toString(table[a]));
        }


    }


}
