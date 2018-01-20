public class Solution {
    public int[] mergeSort(int[] nums){
        if(nums.length < 2) return nums;

        int middle = nums.length/2;
        int[] left = new int[middle];
        int[] right = new int[middle];

        System.arraycopy(nums,0,left,0,left.length);
        /*for(int i = 0; i < left.length; i++){
            left[i] = nums[i];
        }
        */
        System.arraycopy(nums,middle,right,0, right.length);
        /*for(int j = middle; j < nums.length; j++){
            right[j-middle] = nums[j];
        }
        */
        mergeSort(left);
        mergeSort(right);
        merge(left,right,nums);

        return nums;
    }

    public void merge(int[] left, int[] right, int[] nums){

        int i = 0;
        int j = 0;
        int k = 0;

        while(i< left.length && j< right.length){
            if(left[i] <= right[j]){
                nums[k] = left[i];
                i++;
            }
            else{
                nums[k] = right[j];
                j++;
            }
            k++;
        }

        while(i < left.length){
            nums[k] = left[i];
            k++;
            i++;
        }
        while(j < right.length){
            nums[k] = right[j];
            k++;
            j++;
        }
    }
}
