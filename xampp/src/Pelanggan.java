import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pelanggan extends InfoLengkap {

        //method untuk mengisi data pelanggan
    public void input(){
        Scanner dataString = new Scanner(System.in);
        Scanner dataInt = new Scanner(System.in);
        System.out.println("Masukkan no faktur : ");
        noFaktur = dataString.next();
        System.out.println("Masukkan nama pelanggan : ");
        nama = dataString.next();
        System.out.println("Masukkan noHp pelanggan : ");
        noHp = dataString.next();
        System.out.println("Masukkan alamat pelanggan : ");
        alamat = dataString.next();
        System.out.println("Masukkan kode barang : ");
        kodeBarang = dataString.next();
        System.out.println("Masukkan nama barang : ");
        namaBarang = dataString.next();
        System.out.println("Masukkan harga barang : ");
        hargaBarang = dataInt.nextInt();
        System.out.println("Masukkan jumlah barang : ");
        jumlahBarang = dataInt.nextInt();
        System.out.println("Masukkan nama Kasir : ");
        namaKasir = dataString.next();
        dataString.close();
        dataInt.close();
        
    }
        //method struk
    @Override
    public void struk() {
        Date date = new Date();
        SimpleDateFormat day = new SimpleDateFormat("'Day \t:' EEEEEEEEEE dd-mm-yyyy");
        SimpleDateFormat hour = new SimpleDateFormat("'Time \t:' hh:mm:ss z");
        hargaBarang = 0;
        Integer totalBayar = hargaBarang*jumlahBarang;
        this.totalBayar = totalBayar;

        System.out.println("----------- Struk -----------");
        System.out.println(day.format(date));
        System.out.println(hour.format(date));
        System.out.println("No Faktur : " + noFaktur);
        System.out.println("--------DATA PELANGGAN-------");
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("noHp : " + noHp);
        System.out.println("Alamat : " + alamat);
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("----DATA PEMBELIAN BARANG----");
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga : " + hargaBarang);
        System.out.println("Jumlah : " + jumlahBarang);
        System.out.println("Total Bayar : " + this.totalBayar);
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Kasir : " + namaKasir);
        System.out.println("Uppercase : " + nama.toUpperCase() );
        System.out.println("length\t: " + nama.length() );
        System.out.println("equals\t: " + day.equals(hour) );
        System.out.println("-----------------------------");
    }
    

}
