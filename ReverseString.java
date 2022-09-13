class Solution {
    public void reverseString(char[] s) {
        
     char curr;
            
            for (int i=0;i<s.length/2;i++) {
                char tmp = s[i];
                curr = s[s.length-1-i];
                s[i] = curr;
                s[s.length-1-i] = tmp;
            }
       
    }
}
