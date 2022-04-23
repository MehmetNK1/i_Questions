package interviewQuestions1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q01 {
   /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
   public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       System.out.println("kelime giriniz..");
       String str = scan.nextLine();
       String arr[]= str.split("");
      // System.out.println(Arrays.toString(arr)); // arr yazdirma
       Arrays.sort(arr);
      // System.out.println(Arrays.toString(arr)); // sirali yazdirma
       int sayac =0;
       for (int i = 1; i < arr.length; i++) {
           if (arr[i-1].equals(arr[i])) {
               sayac++;
           }else {
               System.out.print(arr[i-1]+" = "+(sayac+1)+", ");
               sayac=0;
           }
           if (i==arr.length-1){
               System.out.print(arr[i]+" = "+(sayac+1));
           }
       }
       System.out.println();// a=3
       Map<String,Integer> karakterSayisi= new HashMap<>();
       for (String key:arr) {
           if (karakterSayisi.containsKey(key)){
               karakterSayisi.put(key,karakterSayisi.get(key)+1);
           }else{
               karakterSayisi.put(key,1);
           }
       }
      System.out.println(karakterSayisi);
   }
}
