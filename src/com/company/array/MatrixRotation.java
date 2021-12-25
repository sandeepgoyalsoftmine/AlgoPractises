package com.company.array;

public class MatrixRotation {
    static int count = 0;
	public static void main(String args[]) {

		int[][] ar = {
				{1, 2, 3, 4,17},
				{5, 6, 7, 8,18},
				{9, 10, 11, 12,19},
				{13, 14, 15, 16,20},
				{21,22,23,24,25}
		};

	    printMatrix(ar);

		rotate(ar);

		System.out.println();

		printMatrix(ar);


		System.out.println(count);

	}

	

	static private void rotate(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {
			
			reverseArray(ar[i], 0, ar[i].length - 1);

		}

		

		for (int i = 0; i < ar.length; i++) {

			for (int j = i; j < ar[i].length; j++) {
				if (i != j) {

				ar[i][j]= ar[i][j] + ar[j][i];

				ar[j][i] = ar[i][j] - ar[j][i];

				ar[i][j] = ar[i][j] - ar[j][i];

				}

			}

		}

	}

	

	static  private void reverseArray(int ar[], int k, int j) {

		for (int i = k ; i < j; i++, j--) {
			count = count+1;
			ar[i] = ar[i] + ar[j];

			ar[j] = ar[i] - ar[j];

			ar[i] = ar[i] - ar[j];

		}

	}

	

	static  private void printMatrix(int ar[][]) {

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar[i].length; j++) {

			System.out.print(ar[i][j]+" ");

			}

			System.out.print("\n");

		}

		

	}

}

