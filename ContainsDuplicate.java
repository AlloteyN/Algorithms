class Solution {
    public boolean containsDuplicate(int[] nums) {
        int[]copy = nums.clone();
        Arrays.sort(copy);
        for (int i = 0; i<copy.length-1; i++) {
            if (copy [i] == copy[i+1]) {
                return true;
            }
        }
        return false;
    }
}
