package topkelement;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKthElement_347 {
    public static void main(String[] args) {
      //int[] nums={1,1,1,2,2,3};
      int[] nums={3,0,1,0};
      int k=1;
      int[] res=getKthElement(nums,k);
      System.out.println(res);
    }

    private static int[] getKthElement(int[] nums, int k) {
        if(nums.length==1){
            return new int[]{nums[0]};
        }
        if(nums.length==2 && k==2){
            return  new int[]{nums[0],nums[1]};
        }
        Map<Integer,Integer> map=new HashMap<>();
        int[] res=new int[nums.length];
        List<Integer> num=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        for(var key:map.keySet()){
            var value=map.get(key);
            res[value-1]=key;

        }
        int[] output=new int[k];int j=0;
        for(int i=nums.length-1;i>=0;i--){
            if(res[i]!=0 && j<k){
              output[j]=res[i];
              j++;
            }

        }

        return output;
    }
}
