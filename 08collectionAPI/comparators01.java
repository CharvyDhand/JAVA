import java.util.*;
public class comparators01 {
    public static void main(String[] args) {
        // Comparator<Integer> com=new Comparator<>(){
        //     public int compare(Integer i,Integer j){
        //         if(i%10>j%10){
        //             return 1;
        //         }else {
        //             return -1;
        //         }
        //     }
        // };
        var a=4;
        Comparator<Integer> com1=(i,j)->i>j?1:-1;
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(69,32,16,28));
        Collections.sort(list,com1);
        System.out.println(list);
        System.out.println(a);
    }
}
