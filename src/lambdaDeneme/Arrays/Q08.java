package lambdaDeneme.Arrays;

import java.util.Arrays;

public class Q08 {

    /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
    public static void main(String[] args) {


        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4";
        String arr1[]=str.split(" ");
        System.out.println(Arrays.toString(arr1));
        System.out.println("$'larin toplami: "+Arrays.stream(arr1).filter(t -> t.contains("$")).mapToInt(t -> Integer.parseInt(t.replace("$", ""))).sum());
        System.out.println("£'larin toplami: "+Arrays.stream(arr1).filter(t -> t.contains("£")).mapToInt(t -> Integer.parseInt(t.replace("£", ""))).sum());
    }
}
