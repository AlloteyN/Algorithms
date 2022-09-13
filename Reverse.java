class Solution {
    public int reverse(int x) {
        try {
          String y =  Integer.toString(x);
                    StringBuilder z = new StringBuilder();
        
        z.append(y);
            
        if (x >= 0){
        z.reverse();
        } else {
            z.deleteCharAt(0);
            z.reverse();
            z.insert(0, '-');
        }
            
        String p = z.toString();
        
       int a = Integer.parseInt(p);
        return a;
        } catch (Exception e) {
            return 0;
        }
        
 

    }
}
