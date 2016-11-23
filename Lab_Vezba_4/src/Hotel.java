/**
 * Created by ndenkov on 11/21/2016.
 */
public class Hotel extends Thread {

    private boolean isRunning = false;
    private Musterija[] musterije = new Musterija[5];;
    private boolean smesten = true;
    private int cenaPoDanu = 500;

    public  synchronized Musterija[] getMusterije() {
        return musterije;
    }
    public synchronized boolean getSmesten(){ return this.smesten;}
    public synchronized void setSmesten (boolean smesten){ this.smesten = smesten; }

    public Hotel(){
        isRunning = true;
    }



    public void smesta(Musterija m) {
        for (int i = 0; i < getMusterije().length; i++) {
            if (getMusterije()[i] == null) {
                getMusterije()[i] = m;
                System.out.println(getMusterije()[i].toString() + " smestena je u niz na indeksu " + i + ". Kapacitet " + (i+1) + "/5");
                this.smesten = true;
                break;
            }
            else if (i == getMusterije().length - 1) {
                System.out.println("Kapacitet hotela je pun"); this.smesten = false;
            }
        }

    }

    public void kontrola() {
        int i = 0;
        while (i < 5 && getMusterije()[i] != null ) {
            getMusterije()[i].setVremeBoravka(getMusterije()[i].getVremeBoravka() - 1);
            System.out.println("Prosao je dan za musteriju - " + getMusterije()[i]);

            

            if (getMusterije()[i].getVremeBoravka() == 0) {
                System.out.println(getMusterije()[i] + " je napustila hotel.");
                getMusterije()[i] = null;
            }
            i++;
        }
    }

    @Override
    public void run () {
        while (isRunning){
            kontrola();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
    /*
    public static void main (String[] args){


    }


*/
