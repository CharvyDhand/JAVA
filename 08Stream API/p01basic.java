import java.util.*;
import java.util.stream.*;
public class p01basic {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> s1=list.stream();
        Stream<Integer> s2=s1.filter(n->n%2==0);
        Stream<Integer> s3=s2.map(n->n*2);
        int result=s3.reduce(0,(c,e)->c+e);
        System.out.println(result);
    }    
}
