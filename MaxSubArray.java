class Solution {
    public int maxSubArray(int[] nums) {
       int size = nums.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + nums[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
        
//         for (int i =0; i< nums.length-1; i++){
//             for (int j =i; j<nums.length; j++){
//                 int sum = 0;
//                 for (int k=i; k<j+1; k++ ) {
//                  sum += nums[k];   
//                 }
//                 max = Math.max(max,sum);
//             }
        
            
            
//         }
        
      
    }

}
