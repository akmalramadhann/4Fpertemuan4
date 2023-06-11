package pertemuan4;

public class Dosen extends Mahasiswa {
    @Override
    public int getUmur() {
        System.out.println("Subclass");
        return super.getUmur();
    }   
}
