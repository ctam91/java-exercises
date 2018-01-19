public class BinarySearch {

    /**
     * Java implementation of a binary search
     * @param nums the input array to search
     * @param numToFind the number we are trying to look for
     * @param left the current most left index
     * @param right the current most right index
     * @return return the position that the number is found
     */

    public int binarySearch(int[] nums, int numToFind, int left, int right){

        if(nums == null){
            throw new IllegalArgumentException("The input array must not be null");
        }

        int mid = (int) Math.floor((left + right) / 2);

        if(nums[mid] == numToFind){
            return mid;
        }
        else if(numToFind < nums[mid]){
            right = mid - 1;
            return binarySearch(nums, numToFind, left, right);
        } else {
            left = mid + 1;
            return binarySearch(nums, numToFind, left, right);
        }
    }
}
