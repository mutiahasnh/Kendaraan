import java.util.Scanner;

public class kendaraan {
    private String merk;
    private int harga;
    public kendaraan(){
    }
    public kendaraan(String merk){
        this.merk=merk;
    }
    public kendaraan(String merk, int harga){
        this.merk=merk;
        this.harga=harga;
    }
    public void mobil(String merk){
        this.merk=merk;
        }
        public void mobil(String merk, int harga){
            this.merk=merk;
            this.harga=harga;
        }
        public void lihatMobil(){
            System.out.println(" Merk : "+merk);
            System.out.println(" Harga : "+harga);
            System.out.println("");
        }
    }
    class DemoOverLoading {
        public static void main(String args[]) {
            System.out.println("");
            kendaraan p1 = new kendaraan();
            kendaraan p2 = new kendaraan("Avanza");
            kendaraan p3 = new kendaraan("Rush", 140000000);
            System.out.println("Perbedaan Output dari masing-masing konstruktor");
            p1.lihatMobil();
            p2.lihatMobil();
            p3.lihatMobil();

            kendaraan p4,p5;
            p4 = new kendaraan();
            p5 = new kendaraan();
            p4.mobil("Inova");
            p5.mobil("Inova", 2000000000);
            System.out.println("Perbedaan Output dari masing-masing method");
            p4.lihatMobil();
            p5.lihatMobil();
        }
    }

