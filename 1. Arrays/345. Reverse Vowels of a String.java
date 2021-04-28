class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder str = new StringBuilder(s);
        int i = 0; 
        int j = str.length() - 1;
        
        while(i < j) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);
            
            if(ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 != 'u' && 
            ch1 != 'A' && ch1 != 'E' && ch1 != 'I' && ch1 != 'O' && ch1 != 'U') {
                i++;
            }
            
            if(ch2 != 'a' && ch2 != 'e' && ch2 != 'i' && ch2 != 'o' && ch2 != 'u' &&
            ch2 != 'A' && ch2 != 'E' && ch2 != 'I' && ch2 != 'O' && ch2 != 'U') {
                j--;
            }
            
            if((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' ||
            ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') &&
            (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' ||
            ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U')) {
                
                swap(str, i , j);
                i++;
                j--;
            }
            
        }
        
        return str.toString();
    }
    
    public void swap(StringBuilder str, int i, int j) {
        char temp1 = str.charAt(i);
        char temp2 = str.charAt(j);
        
        str.setCharAt(i, temp2);
        str.setCharAt(j, temp1);
            
    }
}