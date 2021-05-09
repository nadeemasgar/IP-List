// https://leetcode.com/problems/maximum-swap/

// Approach 1 : times complexity - O(n) and space complexity - O(n)

class Solution {
    public int maximumSwap(int num) {
        char[] digit = Integer.toString(num).toCharArray();
        int[] postMax = new int[digit.length];
        postMax[digit.length - 1] = digit.length - 1;
        
        for(int i = digit.length - 2; i >= 0; i--) {
            int idx = postMax[i + 1];
            if(digit[idx] >= digit[i]) {
                postMax[i] = idx;
            }
            else {
                postMax[i] = i;
            }
        }
        
        int i = 0;
        int j = 1;
        
        while(j < digit.length) {
            int idx = postMax[j];
            if(digit[idx] - '0' > digit[i] - '0') {
                char temp = digit[idx];
                digit[idx]= digit[i];
                digit[i] = temp;
                break;
            }
            
            i++;
            j++;
        }
        
        return Integer.parseInt(new String(digit));
    }
}