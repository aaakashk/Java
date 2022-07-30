import java.util.Arrays;
import java.util.Scanner;

class Arrange {
	public static void getArray(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++)
			array[i] = sc.nextInt();
	}

	public static int[] arrangeArray(int[] array) {
		int[] new_arr = new int[array.length];
		int i = 0, j = 0;
		while (i < array.length) {
			if (array[i] < 0) {
				new_arr[j] = array[i];
				j++;
			}
			i++;
		}
		i = 0;
		while (i < array.length) {
			if (array[i] > 0) {
				new_arr[j] = array[i];
				j++;
			}
			i++;
		}
		return new_arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of array elements: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		int[] new_array = new int[n];
		System.out.println("Enter array elements: ");
		getArray(array);
		System.out.println("BEFORE: ");
		System.out.println(Arrays.toString(array));
		new_array = arrangeArray(array);
		System.out.println("AFTER: ");
		System.out.println(Arrays.toString(new_array));
	}
}
