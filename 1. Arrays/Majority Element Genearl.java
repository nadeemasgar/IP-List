// Given an array of size n and a number k, find all elements that appear more than n/k times
// https://www.geeksforgeeks.org/given-an-array-of-of-size-n-finds-all-the-elements-that-appear-more-than-nk-times/

class Solution 
{
    static class Pair {
    	int element; // Element
	    int count; // Count
    };
    
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        if(k < 2){
            return 0;
        }
        
        Pair[] temp = new Pair[k-1];
        for(int i = 0; i < k - 1; i++) {
            temp[i] = new Pair();
        }
        for (int i = 0; i < k - 1; i++) {
		    temp[i].count = 0;
	    }
        
        for(int i = 0; i < n; i++) {
            int j;
            
            // If arr[i] is present.. then increase the count
            for(j = 0; j < k - 1; j++) {
                
                if(temp[j].element == arr[i]) {
                    temp[j].count++;
                    break;
                }
            }
            
            // If arr[i] is not present in temp[]
            if(j == k - 1) {
                int l;
                
                // If position available... then place it in temp ans set count as 1
                for(l = 0; l < k - 1; l++) {
                    
                    if(temp[l].count == 0) {
                        temp[l].element = arr[i];
                        temp[l].count = 1;
                        break;
                    }
                }
                
                // If all psosition filled... then decrease count of every element
                if(l == k - 1) {
                    for(l = 0; l < k - 1; l++) {
                        temp[l].count--;
                    }
                }
            }
        }
        
        int totalCount = 0;
        
        // Loop applied on temp  
        for(int i = 0; i < k - 1; i++) {
            
            int ac = 0;  // actual count
            for(int j = 0; j < n; j++) {
                if(arr[j] == temp[i].element) {
                    ac++;
                }
            }
            
            if(ac > n / k) {
                totalCount++;
            }
        }
        
        return totalCount;
    }
}
