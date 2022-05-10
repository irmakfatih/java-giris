package day01;

import java.util.Scanner;

public class ders {


    public static void main(String[] args) {
        System.out.println("bismillahirrahmanirrahim");
        System.out.println("helloworld");
        //varriable=degisken
        int sayi1 = 12;
        System.out.println(sayi1);
        // Integer=tamsayi
        System.out.println(sayi1);
        System.out.println(sayi1 + sayi1);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        long sayi3 = 214749999999L;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        //assign

        float dsayi1 = 243452345.456456f;
        double dSayi1 = 4567.456;
        boolean varMi = true;
        boolean varMi1 = false;
        char karakter = 'a';
        char karakter1 = '8';
        char karakter2 = '^';
        byte ses = 12;
        System.out.println(dSayi1);

        String str1 = "";
        /*
        primitive data types
        ******
        int tamsayi
        long tamsayi
        short
        double
        boolean
        char
        byte
        float


        non-primitive data types
        *****
        String


         */
        Scanner tara = new Scanner(System.in);

        System.out.println("lutfen tcnizi giriniz");

        String input = tara.next();

        int input1 = tara.nextInt();

        System.out.println("tcniz su : " + input + "boyle tc mi olur azq");


    }

}