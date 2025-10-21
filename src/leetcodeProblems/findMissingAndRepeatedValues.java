package leetcodeProblems;

public class findMissingAndRepeatedValues {
    public int[] findMissingAndRepeatedValue(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        boolean[] seen = new boolean[size + 1]; // to track numbers from 1 to n^2
        int repeated = -1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];
                if (seen[val]) {
                    repeated = val; // found the repeated number
                } else {
                    seen[val] = true;
                }
                sum += val;
            }
        }

        // Sum of 1 to n^2
        int expectedSum = size * (size + 1) / 2;
        int missing = expectedSum - (sum - repeated); // missing = total - (sum - repeated)

        return new int[]{repeated, missing};
    }
}
