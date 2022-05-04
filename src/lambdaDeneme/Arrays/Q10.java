package lambdaDeneme.Arrays;

import java.util.Arrays;

public class Q10 {
    /*
         TASK:
         you have a string "GayetBasarılı"
         with arrays change it to "CoookBasarılı" and write changing array
         (String iniz: "GayetBasarılı"  Diziyi "CoookBasarılı" ye cevirin )
         */

    public static void main(String[] args) {
        String str[]={"GayetBasarılı"};
        Arrays.stream(str).map(t->t.substring(0,5).
                        replace("Gayet","Cookk")+t.substring(5)).
                forEach(t-> System.out.print(t + " "));
    }
}
