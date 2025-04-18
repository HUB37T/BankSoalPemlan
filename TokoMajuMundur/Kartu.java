package TokoMajuMundur;
import java.util.Scanner;
public class Kartu {

    private double saldo;
    private String nama;
    private String pin;
    private String nomor;
    private String jenis;
    public int gagal = 0;
    public Kartu(String nama, String nomor, String pin, double saldo) {
        this.saldo = saldo;
        this.nama = nama;
        this.pin = pin;
        this.nomor = nomor;
        cekJenis();
    }
    public double getSaldo() {
        return saldo;
    }

    public String getNama() {
        return nama;
    }
    public String getPin(){
        return pin;
    }
    public String getNomor(){
        return nomor;
    }
    void cekJenis(){
        switch(nomor.substring(0,2)){
            case "38":
                jenis = "silver";
                break;
            case "56":
                jenis="gold";
                break;
            case "74":
                jenis="platinum";
                break;
            default:
                jenis="biasa";
        }
    }
    public boolean cekPIN(String pin1){
        if(!pin.equals(pin1)){
            System.out.println("Pin salah");
            gagal++;
            if(gagal == 3) System.out.println("Kartu anda terblokir");
            return false;
        }
        return true;
    }

    public void Pembelian(double harga){
        if(gagal<3) {
            switch (jenis) {
                case "silver":
                    saldo -= harga * 0.97;
                    break;
                case "gold":
                    saldo -= harga * 0.95;
                    break;
                case "platinum":
                    saldo -= harga * 0.93;
                    break;
            }
            System.out.println("Pembelian berhasil, sisa saldo: "+ saldo);
        }
        else{
            System.out.println("Kartu anda terblokir");
        }
    }
    public void topUp(double nominal){
        if(gagal < 3){
            saldo += nominal;
            System.out.println("Top-up berhasil, saldo akhir: "+saldo);
        }
        else{
            System.out.println("Kartu anda terblokir");
        }
    }
    public void cek(){
        cekJenis();
        System.out.println("Nama: "+nama);
        System.out.println("Nomor: "+nomor);
        System.out.println("Saldo: "+saldo);
        System.out.println("Akun "+jenis);
    }
    public static boolean verifikasiPIN(Kartu kartu, Scanner input) {
        for (int i = 0; i < 3; i++) {
            String pin1 = input.nextLine();
            if (kartu.cekPIN(pin1)) {
                return true;
            }
            if (kartu.gagal >= 3) return false;
        }
        return false;
    }
    public static boolean cekgagal(Kartu kartu){
        if(kartu.gagal>=3){
            return true;
        }
        else {
            return false;
        }
    }
}
