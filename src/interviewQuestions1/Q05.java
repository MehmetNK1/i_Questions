package interviewQuestions1;

import java.util.Scanner;

public class Q05 {



        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("sirayla bir cumle ve bir harf giriniz.. : " );
        String cumle= scan.nextLine();
        char harf= scan.next().toLowerCase().charAt(0);

        int sayac=0;
        for (int i=0;i<cumle.length();i++){
            if (cumle.charAt(i)==harf){
                sayac++;
            }
        }
        System.out.println(harf+" "+sayac+"tane var");


    }



}
