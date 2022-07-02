import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter the elements:");
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		sc.close();
		int max = arr[0], min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
			if (max < arr[i])
				max = arr[i];
		}

		System.out.println("Minimum element = " + min);
		System.out.println("Maximum element = " + max);
	}
}
