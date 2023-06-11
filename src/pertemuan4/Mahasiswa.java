package pertemuan4;


public class Mahasiswa {
    //atribut
    private String nama , npm;
    protected int umur;
    
    //Method contstructor
    public Mahasiswa (String nama, String npm, int umur){
        System.out.println("ada 3 parameter");
     this.nama = nama;
     this.npm = npm;
     this.umur = umur;
    }
    
    public Mahasiswa(){
        System.out.println("No parameter");
    }
    
    
    //Method Mutator

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    //Method Accessor
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public int getUmur() {
        System.out.println("Superclass");
        return umur;
    }
    
    
}
