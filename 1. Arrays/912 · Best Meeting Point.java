// https://www.lintcode.com/problem/best-meeting-point/

public class Solution {
    /**
     * @param grid: a 2D grid
     * @return: the minimize travel distance
     */
    public int minTotalDistance(int[][] grid) {
        // Write your code here
        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> Y = new ArrayList<>();

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j <  grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    X.add(j);
                    Y.add(i);
                }
            }
        }

        Collections.sort(X);
        Collections.sort(Y);

        int xMid = X.size() / 2;
        int yMid = Y.size() / 2;

        int sum = 0;

        for(int i = 0; i < X.size(); i++) {
            sum += Math.abs(X.get(i) - X.get(xMid));
            sum += Math.abs(Y.get(i) - Y.get(yMid));
        }

        return sum;
    }
}

// 2nd Approach.. Finding ArrayList X and Y in 2 loop and not using Collections.sort

public class Solution {
    /**
     * @param grid: a 2D grid
     * @return: the minimize travel distance
     */
    public int minTotalDistance(int[][] grid) {
        // Write your code here
        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> Y = new ArrayList<>();

         for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    X.add(i);
                }
            }
        }

        for (int j = 0; j < grid[0].length; j++) {
            for (int i = 0; i < grid.length; i++) {
                if (grid[i][j] == 1) {
                    Y.add(j);
                }
            }
        }

        int xMid = X.size() / 2;
        int yMid = Y.size() / 2;

        int sum = 0;

        for(int i = 0; i < X.size(); i++) {
            sum += Math.abs(X.get(i) - X.get(xMid));
            sum += Math.abs(Y.get(i) - Y.get(yMid));
        }

        return sum;
    }
}