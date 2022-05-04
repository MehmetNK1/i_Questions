package interviewQuestions1;

import java.util.Scanner;

public class Q03 {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("pozitif bir sayi giriniz");
        int sayi = 0;
        while (true) {
            try {
                sayi = sc.nextInt();
                if (sayi <= 1) {
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("1'den buyuk bir sayi giriniz");
            } catch (Exception e) {
                String str = sc.next();
                System.out.println("Sayi giriniz");
            }
        }
        boolean asalSayiMi = true;
        if (sayi >= 2) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asalSayiMi = false;
                    break;
                }
            }
            if (asalSayiMi) System.out.println("girdiginiz sayi asaldir");
            else System.out.println("girdiginiz sayi asal degildir");
        }
    }
}
