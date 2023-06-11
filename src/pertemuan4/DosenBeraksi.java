package pertemuan4;

public class DosenBeraksi {
    public static void main (String[] args){
        Dosen dosen1 = new Dosen();
        
        dosen1.setNama("Ronaldo");
        dosen1.setNpm("211001321");
        dosen1.setUmur(37);
        
        System.out.println("Nama :"+dosen1.getNama());
        System.out.println("NPM :"+dosen1.getNpm());
        System.out.println("Umur :"+dosen1.getUmur());
    }
}
