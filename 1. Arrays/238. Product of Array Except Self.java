class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        
        int product = 1;
        
        // Prefix Product
        for(int i = 0; i < nums.length; i++) {
            product *= nums[i];
            pre[i] = product;
        }
        
        product = 1;
        
        // Postfix Product
        for(int i = nums.length - 1; i >= 0; i--) {
            product *= nums[i];
            post[i] = product;
        }
        
        int[] ans = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            
            int leftIndex = i > 0 && i < nums.length ? pre[i-1] : 1;
            int rightIndex = i < nums.length - 1 ? post[i+1] : 1;
            
            ans[i] = leftIndex * rightIndex;
        }
        
        return ans;
    }
}