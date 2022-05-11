package day03;

import java.util.Scanner;

public class C01_DataCasting {
    public static void main(String[] args) {

        String isim = "fatih";
        String soyIsim = "irmak";
        System.out.println("isminiz: " +isim +" \nsoyIsminiz:"+ soyIsim);

        double sayi1= 1999.5671;
        float sayi2= (float)sayi1;
        System.out.println(sayi2);

        short sayi3= 15;
        byte sayi4= (byte)sayi3;
        System.out.println(sayi4);

        sayi3=sayi4;
        System.out.println(sayi3);

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Adinizi Giriniz");
        String adiniz= scan.nextLine();
        System.out.println("girdiginiz isim"+ adiniz);
        scan.nextLine();
        System.out.println("soy Adinizi Giriniz");
        String soyadiniz= scan.nextLine();
        System.out.println("Soy Adiniz" + soyadiniz);


    }
}
