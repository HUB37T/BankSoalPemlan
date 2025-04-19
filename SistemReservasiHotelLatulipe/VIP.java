package SistemReservasiHotelLatulipe;

public class VIP extends Tamu{
    private final int poin = 10;
    public VIP(String nama, int jumlah, String metode) {
        super(nama, jumlah, metode);
    }
    public long sebelumPajak(){
        return (long)(hitung() * 0.75);
    }
    public long setelahPajak(){
        return (long) (sebelumPajak() * getMetode());
    }
    public int hitungPoin(){
        return poin * getJumlahMalam();
    }
    public long getPajak(){
        return (long)(sebelumPajak() * (getMetode()-1));
    }


    @Override
    public String toString(){
        return super.toString() +
                "\nTipe Tamu: VIP" +
                "\nMetode Pembayaran: "+getMetode2()+
                "\nTotal Harga Sebelum Diskon: Rp " + hitung()+
                "\nTotal Harga Setelah Diskon: Rp " + sebelumPajak()+
                "\nPoin yang Didapatkan: "+ hitungPoin()+
                "\nPajak/Diskon Tambahan: Rp "+getPajak()+
                "\nTotal Akhir yang Dibayarkan: Rp " +setelahPajak()+
                "\n---";
    }
}
