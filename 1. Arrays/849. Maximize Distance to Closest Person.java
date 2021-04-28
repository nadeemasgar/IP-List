class Solution {
    public int maxDistToClosest(int[] seats) {
        int ans = 0;
        int i = 0;
        
        while(i < seats.length) {
            
            if(seats[i] == 1) {
                break;
            }
            
            i++;
        }
        
        ans = i;
        
        int j = i;
        
        while(j < seats.length) {
            
            if(seats[j] == 1) {
                int new_ans = (j - i) / 2;
                
                ans = Math.max(ans, new_ans);
                
                i = j;
            }
            
            j++;
        }
        
        j--;
        
        if(i != j) {
            ans = Math.max(ans, j - i);
        }
          
        return ans;
    }
}