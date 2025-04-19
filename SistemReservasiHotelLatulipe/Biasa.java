package SistemReservasiHotelLatulipe;

public class Biasa extends Tamu{
    public Biasa(String nama, int jumlah, String metode){
        super(nama, jumlah, metode);
    }

    public long sebelumPajak(){
        return hitung();
    }
    public long setelahPajak(){
        return (long) (sebelumPajak() * getMetode());
    }
    public long getPajak(){
        return (long)(sebelumPajak() * (getMetode()-1));
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nTipe Tamu: Biasa" +
                "\nMetode Pembayaran: "+getMetode2()+
                "\nTotal Harga Sebelum Diskon: Rp " + hitung()+
                "\nTotal Harga Setelah Diskon: Rp " + sebelumPajak()+
                "\nPoin yang Didapatkan: 0"+
                "\nPajak/Diskon Tambahan: Rp "+getPajak()+
                "\nTotal Akhir yang Dibayarkan: Rp " +setelahPajak()+
                "\n---";
    }
}
