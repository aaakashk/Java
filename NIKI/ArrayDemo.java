import java.util.Scanner;

class ArrayDemo {

	static int partition(int[] arr, int startIndex, int endIndex) {
		int pivot = arr[endIndex];
		int i = startIndex - 1;
		int j = startIndex, temp = 0;
		while (j < endIndex) {
			if (arr[j] < pivot) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			j++;
		}
		temp = arr[i + 1];
		arr[i + 1] = arr[endIndex];
		arr[endIndex] = temp;
		return i + 1;
	}

	static void quickSort(int[] arr, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pi = partition(arr, startIndex, endIndex);
			quickSort(arr, startIndex, pi - 1);
			quickSort(arr, pi + 1, endIndex);
		}
	}

	static void arrayFunc(int[] array, int target) {
		int low = 0, high = array.length - 1, tempSum = 0;
		while (low < high) {
			tempSum = array[low] + array[high];
			if (tempSum == target) {
				System.out.println(array[low] + " + " + array[high] + " = " + target);
				high--;
				low++;
			} else if (tempSum > target)
				high--;
			else
				low++;
		}
	}

	static void inputArray(int[] arr) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.print("\n");
	}

	static int[] arrayFunc(int[] a, int p, int[] b, int q) {
		int[] arr = new int[p + q];
		int i = 0, j = 0, k = 0;
		while (i < p && j < q) {
			if (a[i] <= b[j])
				arr[k++] = a[i++];
			else
				arr[k++] = b[j++];
		}

		while (i < p)
			arr[k++] = a[i++];

		while (j < q)
			arr[k++] = b[j++];
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1. TwoSum\n2. Merge Arrays\n3. Exit\nEnter chioce: ");
			int chioce = sc.nextInt();
			switch (chioce) {
				case 1:
					System.out.print("Enter number of elements of array: ");
					int n = sc.nextInt();
					int[] array1 = new int[n];
					System.out.println("Enter the array elements:");
					inputArray(array1);
					System.out.print("Enter the target: ");
					int target = sc.nextInt();
					quickSort(array1, 0, array1.length - 1);
					arrayFunc(array1, target);
					break;
				case 2:
					System.out.print("Enter the number of elements of array a:");
					int n1 = sc.nextInt();
					System.out.print("Enter elements of array a in sorted manner: ");
					int[] a = new int[n1];
					inputArray(a);
					System.out.print("Enter the number of elements of array b:");
					int n2 = sc.nextInt();
					System.out.print("Enter elements of array b in sorted manner: ");
					int[] b = new int[n2];
					inputArray(b);
					int m = n1 + n2;
					int[] array2 = new int[m];
					array2 = arrayFunc(a, a.length, b, b.length);
					System.out.print("Merged arrays:");
					printArray(array2);
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Wrong choice. Enter again.");
			}
		}
	}
}
