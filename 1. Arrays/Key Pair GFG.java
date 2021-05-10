class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        // code here
        Arrays.sort(arr);
        boolean ans = false;
	    int i = 0; 
	    int j = arr.length - 1;
	    
	    while(i < j) {
	        int sum = arr[i] + arr[j];
	        
	        if(sum > x) {
	            j--;
	        }
	        else if(sum < x) {
	            i++;
	        }
	        else {
	            ans = true;
	            break;
	        }
	    }
	    
	    return ans;
    }
}