import java.util.Scanner;
class Matrix{

    static void printMatrix(int[][] array){
	for(int i = 0; i < array.length; i++){
	    for(int j = 0; j < array.length; j++)
		System.out.print(array[i][j] + " ");
	    System.out.print("\n");
	}
    }

    static void rotateMatrix(int[][] array){
	int m = array.length;
	for(int i = 0; i < m; i++){
	    for(int j = m - 1; j >= 0; j--)
		System.out.print(array[j][i] + " ");
	    System.out.print("\n");
	}
    }

    static void inputMatrix(int[][] arr){
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i < arr.length; i++){
	    for(int j = 0; j < arr.length; j++)
		arr[i][j] = sc.nextInt();
	}
    }

    static int sumOfCornerElements(int[][] arr){
	int m = arr.length;
	return arr[0][0] + arr[0][m - 1] + arr[m - 1][0] + arr[m - 1][m - 1];
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter m: ");
	int m = sc.nextInt();
	if(m < 2 && m > 10) System.out.print("Invalid input.");
	else{
	    int[][] array = new int[m][m];
	    System.out.println("Enter the matrix:");
	    inputMatrix(array);
	    System.out.println("ORIGINAL MATRIX:");
	    printMatrix(array);
	    System.out.println("MATRIX AFTER ROTATION:");
	    rotateMatrix(array);
	    System.out.println("Sum of the corner elements: " +  sumOfCornerElements(array));
	}
    }
}
