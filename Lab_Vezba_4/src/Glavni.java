import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ndenkov on 11/21/2016.
 */
public class Glavni {

    public static void main (String[] args) throws IOException {
/*
        Musterija m1 = new Musterija(1);
        Musterija m2 = new Musterija(2);
        Musterija m3 = new Musterija(4);
        Musterija m4 = new Musterija(5);
        Musterija m5 = new Musterija(1);
        Musterija m6 = new Musterija(5);
*/

        Hotel hotel = new Hotel();
        Ulaz u = new Ulaz(hotel);
        hotel.start();
        Thread ulazU = new Thread(u);
        ulazU.start();
        //System.in.read();


        Glavni g = new Glavni();
        g.gasi();


    }
    public void gasi () throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("Press enter to continue.....");
        String nextLine = s.nextLine();

            if (nextLine.isEmpty()) {
                System.exit(0);
            }

    }


}


//u.kreira();
        /*
        for (int i = 0; i <7; i++){
            try {
                u.prijavljuje();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
*/
        /*
        h.smesta(m1);
        h.smesta(m2);
        h.smesta(m3);
        h.smesta(m4);
        h.smesta(m5);
        h.smesta(m6);
        h.kontrola();
        */
