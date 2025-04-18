package ManajemenHantu;

public class BinatangBuas extends Makhluk{

    public BinatangBuas(String nama, String kesehatan, String kekuatanSerang, String elemen) {
        super(nama, kesehatan, kekuatanSerang, elemen);
    }

    void Serang(){
        System.out.println("[BinatangBuas] " + getNama()+" menyerang dengan kekuatan "+getKekuatanSerang()+"!");
    }
    void kemampuanKhusus(){
        System.out.println(getNama() + " menggigit dengan buas!");
    }
    void display(){
        super.display();
        Serang();
        kemampuanKhusus();
    }
}
