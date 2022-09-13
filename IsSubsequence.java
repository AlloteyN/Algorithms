class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        
        if (s.length() == 0) {
            return true;
        }
        
        for (int i=0;i<t.length();i++) {
            
                    if (count == s.length()) {
            return true;
        }
                
                if (s.charAt(count) == t.charAt(i)) {
                    count++;
                }
                
            }
            
        
        if (count == s.length()) {
            return true;
        } else {
            return false;
        }
    
        

    }
