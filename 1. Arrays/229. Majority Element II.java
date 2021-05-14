class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int length = nums.length / 3;
        
        int val1 = nums[0];
        int count1 = 1;
        
        int val2 = Integer.MIN_VALUE;
        int count2 = 0;
        
        for(int i = 1; i < nums.length; i++) {
            
            if(nums[i] == val1) {
                count1++;
            }
            else if(nums[i] == val2) {
                count2++;
            }
            else if(count1 == 0) {
                val1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0) {
                val2 = nums[i];
                count2 = 1; 
            }
            else {
                count1--;
                count2--;
            }
        }
        
        int freq1 = 0;
        int freq2 = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
            if(val1 == nums[i]) {
                freq1++;
            }
            
            if(val2 == nums[i]) {
                freq2++;
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        if(freq1 > length) {
            list.add(val1);
        }
        
        if(freq2 > length) {
            list.add(val2);
        }
        
        return list;
    }
}