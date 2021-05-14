class Solution {
    public int maxArea(int[] height) {
        
        int omax = Integer.MIN_VALUE;
        
        int i = 0;
        int j = height.length - 1;
        
        while(i <= j) {
            
            int x = Math.min(height[i], height[j]);
            int area = x * (j-i);
            omax = Math.max(area, omax);
            
            if(height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
        }
        
        return omax;
    }
}