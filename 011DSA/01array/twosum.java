import java.util.Scanner;
import java.util.HashMap;
public class twosum{
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] a= new int[] {3,1,4,5};
        int[] ans= sol.twosumsol(a,7);
        for(int n: ans){
            System.out.println(n);
        }
    }
}
class Solution{
    public int[] twosumsol(int[] a, int target){
        HashMap <Integer, Integer> map = new HashMap<>();
        int currsum = 0;
        for(int i =0; i< a.length; i++){
            currsum = target - a[i];
            if(map.containsKey(currsum)){
                return new int[]{ map.get(currsum), i};
            }
            map.put(a[i],i);
        }
        return new int[]{};
    }
}
