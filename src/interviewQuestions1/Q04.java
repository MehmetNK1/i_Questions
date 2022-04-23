package interviewQuestions1;

import java.util.Scanner;

public class Q04 {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {
        giris();
    }
    public static void giris() {
        Scanner scan = new Scanner(System.in);
        int pin = 0;
        while (true) {
            try {
                System.out.println("pin giriniz");
                pin = scan.nextInt();
                break;
            } catch (Exception e) {
                String str = scan.nextLine();
                System.out.println("numerik value gir");
            }
        }
        int dogruPin =1234;
        int girisHakki = 3;
        while (true) {
            if (pin == (dogruPin)) {
                System.out.println("dogru pin");
                break;
            } else {
                scan.nextLine();
                System.out.println("yanlis giris");
                girisHakki--;
                System.out.println("kalan hak : " + girisHakki);
                giris();
            }
            if (girisHakki == 0) {
                System.out.println("giris hakki doldu");
                break;
            }
        }
    }
}
