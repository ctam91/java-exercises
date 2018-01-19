import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public int findSingleNumber(int[] nums){
        /*int result = 0;
        if(nums.length==1){
            return nums[0];
        }

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,2);
            }
            else{
                map.put(num,1);
            }
        }

        for(int val : map.keySet()){
            if(map.get(val) == 1){
                result = val;
            }
        }
        return result;
        */
        int result = 0;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return result;
    }
}
