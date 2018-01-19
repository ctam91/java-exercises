import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public int findSingleNumber(int[] nums){
        int result = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i+=2){
            if(nums[i] != nums[i+1]){
                result = nums[i];
            }
        }
        return result;
    }
}
