package KolektorNilai;



class Mahasiswa{
    private String name;
    private int nilai;
    public Mahasiswa(String nama, int nilai){
        this.name = nama;
        this.nilai = nilai;
    }
    public String getNama(){
        return name;
    }
    public int getNilai(){
        return nilai;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', score=" + nilai + "}";
    }

}
