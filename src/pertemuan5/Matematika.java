package pertemuan5;

import java.util.Scanner;


public class Matematika {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        //hasil = bil1 * bil2
        
        
        System.out.print("Masukkan bilangan pertama");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan bilangan kedua");
        int bil2 = input.nextInt();
        
        int hasil = bil1 * bil2;
        
        System.out.println("Hasil: "+hasil);
    }
}
