package lambdaDeneme.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Q04_A {

    /*  TASK :
     *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
     * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
     * int istenenToplam=9;
     */

    public static void main(String[] args) {
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;


        List<Integer> newArr=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            newArr.add(arr[i]);
        }

        System.out.println(newArr);


    }


}
