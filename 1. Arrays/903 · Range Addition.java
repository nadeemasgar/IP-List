// Link - lintcode.com/problem/range-addition/

public class Solution {
    /**
     * @param length: the length of the array
     * @param updates: update operations
     * @return: the modified array after all k operations were executed
     */
    public int[] getModifiedArray(int length, int[][] updates) {
        // Write your code here
        int[] arr = new int[length];

        for(int i = 0; i < updates.length; i++) {
            int idx = updates[i][0];
            arr[idx] += updates[i][2]; 
        }

        for(int i = 0; i < updates.length; i++) {
            int idx = updates[i][1];
            if(idx + 1 < arr.length) {
                arr[idx + 1] -= updates[i][2];
            }
        }

        for(int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }

        return arr;
    }
}


***********************************************************************************

public class Solution {
    /**
     * @param length: the length of the array
     * @param updates: update operations
     * @return: the modified array after all k operations were executed
     */
    public int[] getModifiedArray(int length, int[][] updates) {
        // Write your code here
        int[] arr = new int[length];

        for(int i = 0; i < updates.length; i++) {
            int si = updates[i][0];
            int ei = updates[i][1];
            int val = updates[i][2];
            
            arr[si] += val;
            if(ei + 1 < arr.length) {
                arr[ei + 1] -= updates[i][2];
            }
        }

        for(int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }

        return arr;
    }
}
