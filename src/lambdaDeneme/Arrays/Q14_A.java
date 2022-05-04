package lambdaDeneme.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Q14_A {//yapamadik!!!
    /*  TASK :
     * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
     * alin.
     * input : Congratulations
     * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
     * sniitilitirgniC --> o ,a ve u harfini i ye donusturun.
     */
    public static void main(String[] args) {
        List<String> toRemove=Arrays.asList("a","e","o","u");
        String text="Congratulations";
        String replace="i";
        text= Pattern.compile(replace).splitAsStream(text).filter(s->!toRemove.contains(s)).collect(Collectors.joining(replace));
        System.out.println(text);

      // String[] arr= {"C"," o"," n", "g", "r"," a", "t", "u"," l", "a", "t"," i", "o"," n", "s"};
      // List<String> list=Arrays.stream(arr).map(s->s.replace("a", "i").replace("o", "i").replace("e", "i").replace("u","i")).collect(Collectors.toList());

    }
}
