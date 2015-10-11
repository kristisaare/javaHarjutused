package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.PAREM, primaryStage);
        Foor foor4 = new Foor(Foor.VASAK, primaryStage);

        int count = 0;
        while (count<4) {

            rohelisestPunaseks(foor1);
            rohelisestPunaseks(foor2);

            punasestRoheliseks(foor3);
            punasestRoheliseks(foor4);

            rohelisestPunaseks(foor3);
            rohelisestPunaseks(foor4);

            punasestRoheliseks(foor1);
            punasestRoheliseks(foor2);

            count = count + 1;
        }

    }

    public void rohelisestPunaseks(Foor foor) {
        foor.vahetaRohelist();   //Both cycles are 5 sec
        foor.paus(2.5);
        foor.vahetaRohelist();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(0.5);
    }
    public void punasestRoheliseks(Foor foor) {
        foor.vahetaPunast();
        foor.paus(2.5);
        foor.vahetaPunast();
        foor.paus(0.5);
        foor.vahetaPunast();
        foor.vahetaKollast();
        foor.paus(1);
        foor.vahetaPunast();
        foor.paus(0.5);
        foor.vahetaKollast();
        foor.paus(0.5);
    }
}


