package interviewQuestions2;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_DifferenceBetweenArray_LargestAndSmallestElements {
    /*
     Create a function that takes an array and the difference between
     the largest and the smallest numbers. Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("arr uzunlugunu gir.. : ");
        int sayi = scan.nextInt();
        int []arr = new int[sayi];
        //fark();

  // }

  // private static void fark() {

        for (int i = 0; i < sayi; i++) {
            System.out.println("arr "+ (i+1) +" elamani ");
            arr[i] =scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("son eleman - ilk eleman : " +(arr[sayi-1]-arr[0]));
    }

}
