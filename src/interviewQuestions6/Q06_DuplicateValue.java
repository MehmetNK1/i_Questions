package interviewQuestions6;


import java.util.ArrayList;
import java.util.Arrays;

public class Q06_DuplicateValue {
       /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]

        Bir String dizisinde yinelenen karakterleri döndüren bir kod yazın.
         (mülakat Sorusu)
         Giriş :
         String str = “Javaisalsoeasy”
         Çıktı: [a, s]
         */

    public static void main(String[] args) {

        /*
        String str = "Javaisalsoeasy";
        String arr[] = str.split("");
        List<String> duplications = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && i != j) {
                    if (!duplications.contains(arr[i])) {
                        duplications.add(arr[i]);

                    }
                }
            }
        }

         */
        String str="Javaisalsoeasy";
        char[] arr = str.toCharArray(); // her bir karakteri bir arraye donusturur
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        //Arrays.toString(arr) = [J, a, v, a, i, s, a, l, s, o, e, a, s, y]

        ArrayList<Character> output = new ArrayList<>(); //istenilen cikti icin

        for (int i = 0; i <arr.length; i++){ //arr deki her bir elemana bakar
            for (int j = i+1; j < arr.length; j++){ //her bir elemana bakarken bir sonraki ile karsilastir
                if(arr[i] == arr[j] && !output.contains(arr[j])) { //ayni elemandan varsa ve istedigin output da yoksa
                    System.out.println(arr[j]); // o elemani yazdir
                    output.add(arr[j]); //output a ekle
                }
            }
        }
        System.out.println("output = " + output); //output = [a, s]
    }
}