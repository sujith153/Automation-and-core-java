package arrays;

public class LargestSubMatrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0 } };

		int[] result = findLargestSquareSubmatrix(matrix);

		int sideLength = result[0];
		int topLeftRow = result[1];
		int topLeftCol = result[2];
		int bottomRightRow = topLeftRow + sideLength - 1;
		int bottomRightCol = topLeftCol + sideLength - 1;

		System.out.println("Side length of the largest square sub-matrix with all 1s: " + sideLength);
		System.out.println("Coordinates of top-left and bottom-right corners of the square sub-matrix:");
		System.out
				.println("[" + topLeftRow + ", " + topLeftCol + "], [" + bottomRightRow + ", " + bottomRightCol + "]");
	}

	public static int[] findLargestSquareSubmatrix(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;

		int[][] dp = new int[m][n];
		int maxSideLength = 0;
		int maxSideLengthRow = 0;
		int maxSideLengthCol = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = matrix[i][j];
				} else if (matrix[i][j] == 1) {
					dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
				}

				if (dp[i][j] > maxSideLength) {
					maxSideLength = dp[i][j];
					maxSideLengthRow = i - maxSideLength + 1;
					maxSideLengthCol = j - maxSideLength + 1;
				}
			}
		}

		return new int[] { maxSideLength, maxSideLengthRow, maxSideLengthCol };
	}
}