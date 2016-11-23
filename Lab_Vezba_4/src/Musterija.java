/**
 * Created by ndenkov on 11/21/2016.
 */
public class Musterija {
    private int vremeBoravka;
    private int ID;
    private static int brojac;

    public int getVremeBoravka(){ return this.vremeBoravka; }

    public Musterija(int vremeBoravka){
        brojac++;
        this.ID =  brojac;
        this.vremeBoravka = vremeBoravka;
    }

    public String toString(){ return "[Musterija " + this.ID + " / boravak: " + this.vremeBoravka + "]"; }
    public void setVremeBoravka (int vremeBoravka) {this.vremeBoravka = vremeBoravka; }
}

/*
public static void main (String[] args){
        Musterija m1 = new Musterija(5);
        Musterija m2 = new Musterija(6);
        System.out.println(m1.toString());
        System.out.println(m2.toString());

    }
 */
