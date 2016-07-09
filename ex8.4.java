import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int rows, columns;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type in the number of rows: ");
        rows = reader.nextInt();
        System.out.print("Type in the number of columns: ");
        columns = reader.nextInt();

        int matrix [][];

        matrix = askInfo(rows, columns);
        printMatrix(matrix);
        countSum(matrix);
    }
    private static int[][] askInfo(int rows, int columns){
		Scanner reader = new Scanner(System.in);
		int numArray[][] = new int[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print("Type in the element " + (j+1) + " of the row " + (i+1) + ": ");
				numArray[i][j] =reader.nextInt();
			}
		}
		return numArray;
	}
	private static void printMatrix(int[][] matrix){
		System.out.println("Matrix: ");
		for(int row=0;row<matrix.length;row++){
			for(int column=0;column<matrix[row].length;column++){
				System.out.print(matrix[row][column] + "\t");
			}
			System.out.println();
		}
	}
	private static void countSum(int[][] matrix){
		int sum = 0;
		for(int row=0;row<matrix.length;row++){
			for(int column=0;column<matrix[row].length;column++){
				sum += matrix[row][column];
			}
		}
		System.out.println("Sum of the elements of the matrix: " + sum);
	}
}
		


