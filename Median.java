class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] newArray = new int[nums1.length+nums2.length];
            for (int i= 0; i<nums1.length;i++ ){
                newArray[i]=nums1[i];
            }
        for (int i = nums1.length; i<nums1.length+nums2.length;i++){
            newArray[i] = nums2[i-nums1.length];
        }
       Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        if (newArray.length % 2 == 1) {
            int f =newArray.length/2;
            return newArray[newArray.length/2];
        } else {
            int f =newArray.length/2;
            double x = newArray[f-1]+newArray[f];
            System.out.println(x);
            return x/2;
        }
        
    }
}
