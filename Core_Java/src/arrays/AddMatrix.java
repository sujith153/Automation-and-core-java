package arrays;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of rows for matrices: ");
		int rows = scanner.nextInt();
		System.out.print("Enter the number of columns for matrices: ");
		int cols = scanner.nextInt();

		int[][] matrix1 = new int[rows][cols];
		int[][] matrix2 = new int[rows][cols];
		int[][] sumMatrix = new int[rows][cols];

		// first matrix
		System.out.println("Enter elements of first matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				matrix1[i][j] = scanner.nextInt();
		}

		// second matrix
		System.out.println("Enter elements of second matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				matrix2[i][j] = scanner.nextInt();
		}

		// Adding matrices
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
		}

		// result Matrix
		System.out.println("Sum of matrices:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				System.out.print(sumMatrix[i][j] + " ");
			System.out.println();
		}
		scanner.close();

	}

}
