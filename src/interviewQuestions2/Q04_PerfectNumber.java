package interviewQuestions2;

import java.util.Scanner;

public class Q04_PerfectNumber {
    /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan girilen sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("bir sayi giriniz.. : ");
        int sayi =scan.nextInt();

        mukemmelSayi(sayi);

        girilenSayiyaKadar(sayi);
    }

    private static void girilenSayiyaKadar(int sayi) {
        for (int i = 1; i <= sayi; i++) {
            mukemmelSayi(i);

        }
    }

    private static void mukemmelSayi(int sayi) {
        int toplam = 0;
        // i= bolen sayilarim
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
                System.out.print(i+" ");// bolenler
            }
        }
        System.out.println();
        if (toplam==sayi){
            System.out.println(sayi+" mukemmel sayidir");
        }else{
            System.out.println(sayi+ " degil mukemmel..");
        }

    }


}