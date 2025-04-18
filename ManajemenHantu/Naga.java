package ManajemenHantu;

public class Naga extends Makhluk{
    public Naga(String nama, String kesehatan, String kekuatanSerang, String elemen) {
        super(nama, kesehatan, kekuatanSerang, elemen);
    }
    void Serang(){
        System.out.println("[Naga] " + getNama()+" menyerang dengan kekuatan "+getKekuatanSerang()+"!");
    }
    void kemampuanKhusus(){
        System.out.println(getNama() + " menyemburkan api!");
    }
    void display(){
        super.display();
        Serang();
        kemampuanKhusus();
    }
}
