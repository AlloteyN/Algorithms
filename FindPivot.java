class Solution {
    public int pivotIndex(int[] nums) {
        int index = -1;
        int left =0;
        int right =0;
        
        for (int i=0; i<nums.length; i++) {
            
            for (int j=0; j<i; j++) {
                left += nums[j];
            }
            
            for (int j=i+1; j<nums.length; j++) {
                right += nums[j];
            }
            
            if (left == right){
                index =i;
                return index;
            }
            
            right = 0;
            left =0;
        }
        return index;
    }
}
