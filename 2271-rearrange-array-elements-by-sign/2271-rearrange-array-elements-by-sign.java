class Solution {
    public int[] rearrangeArray(int[] nums) {
       

        int pos = 0;
        int neg = 1;
        int n = nums.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                arr[pos] = nums[i];
                pos+=2;  // even
            }else{
                arr[neg] = nums[i];
                neg+=2;  // odd
            }
        }
        return arr;


    }

}