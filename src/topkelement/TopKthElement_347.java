package topkelement;

import com.sun.tools.javac.Main;

import java.util.HashMap;
import java.util.Map;

public class TopKthElement_347 {
    public static void main(String[] args) {
      int[] nums={1,1,1,2,2,3};
      int k=2;
      int[] res=getKthElement(nums,k);
    }

    private static int[] getKthElement(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return null;
    }
}
