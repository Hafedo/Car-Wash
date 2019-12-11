package carwash;

import java.util.ArrayList;

public class Temporary {

    private static ArrayList<String> temp = new ArrayList<>();

    public static void setNama(String Nama) {
        temp.add(Nama);
    }

    public static void setUkuran(String Ukuran) {
        temp.add(Ukuran);
    }

    public static void setJasa(String Jasa) {
        temp.add(Jasa);
    }

    public static void setHarga(String Harga) {
        temp.add(Harga);
    }

    public static void setTanggal(String Tanggal) {
        temp.add(Tanggal);
    }
    
    public static String getNama() {
        return temp.get(0);
    }

    public static String getUkuran() {
        return temp.get(1);
    }

    public static String getJasa() {
        return temp.get(2);
    }

    public static String getHarga() {
        return temp.get(3);
    }

    public static String getTanggal() {
        return temp.get(4);
    }

}
