package pertemuan4;

public class MahasiswaBeraksi {
    public static void main (String[] args){
        //objek
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa("Ronaldo","211001321",37);
        
        mhs1.setNama("Akmal Ramadhan");
        mhs1.setNpm("2110010567");
        mhs1.setUmur(21);
        //mhs1.nama = "Akmal Ramadhan";
        //mhs1.npm = "2110010567";
        //mhs1.umur = 21;
        
        System.out.println("Nama :"+mhs1.getNama());
        System.out.println("NPM :"+mhs1.getNpm());
        System.out.println("Umur :"+mhs1.getUmur());
        
        
        
    }
}
