package interviewQuestions2;

import java.util.Scanner;

public class Q01_ArmstrongNumber {
    /*
     soru1: Check if the integer is an Armstrong numbers
     to 4 digit numbers(4 digit-> exclusive)
     Tamsayının 4 basamaklı sayılara (4 basamaklı-> özel)
     bir Armstrong sayısı olup olmadığını kontrol edin.
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
        toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız
          */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.print("3 basamakli bir sayi giriniz : ");
        int sayi = scan.nextInt();

        amstrong(sayi);
        girilenSayiKadar(sayi);
    }

    private static void girilenSayiKadar(int sayi) {
        for (int i = 1; i <=sayi ; i++) {
            amstrong(i);

        }
    }

    private static void amstrong(int sayi) {
        int basamak=0;
        int kupleri=0;
        int girilensayi=sayi;

        while(sayi>0){
            basamak=sayi%10;
            kupleri+=(basamak*basamak*basamak);
            sayi/=10;
        }
        if (girilensayi==kupleri) {
            System.out.println(girilensayi + " armt");
        }else {
            System.out.println(girilensayi + " degil");
        }


    }

}
