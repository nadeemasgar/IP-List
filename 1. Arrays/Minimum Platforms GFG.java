// https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
    	Arrays.sort(dep);
    	
    	int i = 0; 
    	int j = 0;
    	int platform = 0;
    	int omax = Integer.MIN_VALUE;
    	
    	while(i < arr.length) {
    	    if(dep[j] >= arr[i]) {
    	        platform++;
    	        i++;
    	    }
    	    else {
    	        platform--;
    	        j++;
    	    }
    	    
    	    if(platform > omax) {
    	        omax = platform;
    	    }
    	}
    	
    	return omax;
        
    }
    
}
