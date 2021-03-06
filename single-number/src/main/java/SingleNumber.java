import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public int findSingleNumber(int[] nums){

        if(nums.length == 1){
            return nums[0];
        }

        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
