public class RotateArray {

    public int[] rotateArray(int[] nums, int k){
        int count = 0;

        while(count < k){
            rotateArray(nums);
            count++;
        }
        return nums;
    }

    public void rotateArray(int[] nums){
        int currentValue = nums[0];

        for(int i = 0; i < nums.length-1; i++){
            int nextValue = nums[i+1];
            nums[i+1] = currentValue;
            currentValue = nextValue;
        }
        nums[0] = currentValue;
    }
}
