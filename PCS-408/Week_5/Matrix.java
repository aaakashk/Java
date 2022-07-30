import java.util.Scanner;

class Matrix {
    public static int smallest(int[][] array, int i, int n) {
        int min = array[i][0];
        for (int j = 0; j < n; j++) {
            if (min > array[i][j])
                min = array[i][j];
        }
        return min;
    }

    public static int largest(int[][] array, int j, int m) {
        int max = array[0][j];
        for (int i = 0; i < m; i++) {
            if (max < array[i][j])
                max = array[i][j];
        }
        return max;
    }

    public static int function(int array[][], int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (smallest(array, i, n) == largest(array, j, m))
                    return array[i][j];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimensions of the matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();
        if (function(array, m, n) == -1)
            System.out.println("No such element.");
        else
            System.out.println(function(array, m, n));

    }
}
