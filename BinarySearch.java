class Solution {
    public int search(int[] nums, int target) {
        int pos = -1;
        int start = nums.length/2;
        for (int i =0; i<nums.length;i++) {
            if (nums[i] == target) {
                pos = i;
            }
            
        }
        return pos;
    }
}
