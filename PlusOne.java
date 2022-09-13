class Solution {
    public int[] plusOne(int[] digits) {
        int count = 0;
        if (digits[digits.length-1] != 9) {
           digits[digits.length-1] +=1;
            return digits;
        }
        int[] digits2 = new int[digits.length+1];
        
        for (int i=0; i<digits.length;i++) {
            if (digits[i] == 9) {
                count++;
            }
        }
        
        if (count == digits.length) {
            digits2[0] = 1;
            for (int i=1; i<digits2.length;i++) {
                digits2[i] = 0;
            }
            return digits2;
        } else {
            int spot = digits.length-1;
           int currDigit = digits[spot];
            
            while (currDigit == 9) {
                digits [spot] =0;
                spot -=1;
                currDigit = digits[spot];
            }
            
            digits[spot] +=1;
            return digits;
            
        }
        

    }
}
