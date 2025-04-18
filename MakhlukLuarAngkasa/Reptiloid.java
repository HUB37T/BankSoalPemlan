package MakhlukLuarAngkasa;



public class Reptiloid extends Alien {
    public Reptiloid(String nama, String spesies, double penghasilan){
        super(nama, spesies, penghasilan);
    }
    public double bayarPajak() {
        return 500;
    }
}
