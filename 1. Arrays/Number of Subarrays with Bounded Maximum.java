class Solution {
    public int numSubarrayBoundedMax(int[] A, int L, int R) {
        int i = 0;
        int preValidCount = 0;
        int ans = 0;
        
        for(int j = 0; j < A.length; j++) {
            
            if(A[j] >= L && A[j] <= R) {
                ans += (j-i+1);
                preValidCount = j-i+1;
            }
            else if(A[j] < L) {
                ans += preValidCount;
            }
            else {
                i = j + 1;
                preValidCount = 0;
            }
        }
        
        return ans;
    }
}