class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int curr = 0;
        int[] nums2 = new int[60000];
        
        for (int i=0;i<nums.length;i++){
            if (nums[i]>=0) {
                nums2[nums[i]+30000] +=1;
            } else {
               nums2[nums[i]+30000] +=1;
            }
            
        }
        
        for (int i=0; i<nums2.length;i++) {
            if (nums2[i] == 1) {
                curr = i;
                break;
            }
        }
        
        if (curr >= 30000) {
            return curr-30000;
        } else {
            return curr-30000;
        }
    }
}
