class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        int i = 0; 
        int j = 0;
        
        while(i < name.length() && j < typed.length()) {
            char ch1 = name.charAt(i);
            char ch2 = typed.charAt(j);
            
            if(ch1 == ch2) {
                i++;
                j++;
            }
            else {
                if(j != 0 && typed.charAt(j-1) == ch2) {
                    j++;
                }
                else {
                    return false;
                }
            }
        }
        
        if(j == typed.length() && i != name.length()) {
            return false;
        }
        
        while(j < typed.length()) {
            
            char ch1 = typed.charAt(j-1);
            char ch2 = typed.charAt(j);
            
            if(ch1 != ch2){
                return false;
            }
            
            j++;
        }
        
        return true;
    }
}