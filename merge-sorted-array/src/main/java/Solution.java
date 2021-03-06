class Solution {
    /**
     * Given two sorted arrays, merge them
     * @param a the first input array
     * @param m the number of elements in array 1
     * @param b the second input array
     * @param n the number of elements in array 2
     * @return return the sorted array
     */
    public int[] merge(int[] a, int m, int[] b, int n) {

        if(m == 0 && n!=0){
            a[m] = b[0];
        }

        int aIndex = m-1;
        int bIndex = n-1;
        int mergeIndex = (m+n)-1;

        while(aIndex >= 0 && bIndex>=0){
            if(a[aIndex] >= b[bIndex]){
                a[mergeIndex] = a[aIndex];
                aIndex--;
            }
            else{
                a[mergeIndex] = b[bIndex];
                bIndex--;
            }
            mergeIndex--;
        }

        while(aIndex >= 0){
            a[mergeIndex] = a[aIndex];
            mergeIndex--;
            aIndex--;
        }

        while(bIndex >=0){
            a[mergeIndex] = b[bIndex];
            mergeIndex--;
            bIndex--;
        }

        return a;
    }
}