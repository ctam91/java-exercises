public class RemoveDuplicates {
    public int removeDuplicates(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return 1;
        }

        int j = 0;
        int n = nums.length;

        for(int i = 0; i < n-1; i++){
            if(nums[i] != nums[i+1]){
                nums[j] = nums[i];
                j++;
            }
        }
        nums[j] = nums[n-1];
        return j+1;
    }
}
