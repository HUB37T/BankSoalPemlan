package ManajemenHantu;

public class Phoenix extends Makhluk{
    public Phoenix(String nama, String kesehatan, String kekuatanSerang, String elemen) {
        super(nama, kesehatan, kekuatanSerang, elemen);
    }
    void Serang(){
        System.out.println("[Phoenix] " + getNama()+" menyerang dengan kekuatan "+getKekuatanSerang()+"!");
    }
    void kemampuanKhusus(){
        System.out.println(getNama() + " bangkit dari abu dan memulihkan diri!");
    }
    void display(){
        super.display();
        Serang();
        kemampuanKhusus();
    }
}
