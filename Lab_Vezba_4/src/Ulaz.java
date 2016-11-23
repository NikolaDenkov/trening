import sun.management.HotspotClassLoadingMBean;

/**
 * Created by ndenkov on 11/21/2016.
 */
public class Ulaz implements Runnable {

    private boolean isRunning = false;
    Hotel hotel;
    public Ulaz(Hotel hotel){ this.hotel = hotel; isRunning = true; tempMusterija = kreira();}
    private Musterija tempMusterija;
    private int lova;

    public Musterija kreira(){
        if(this.hotel.getSmesten()) {
            int vreme = 1 + (int) (Math.random() * 10);
            tempMusterija = new Musterija(vreme);
            lova = 500 + (int) (Math.random() * 501);
            return tempMusterija;

        }
        else return tempMusterija;
    }

    public void prijavljuje(){
        this.hotel.smesta(kreira());
    }

    public void rukovodi(){ }


    @Override
    public void run() {
        while(isRunning){
            prijavljuje();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
