import java.util.Scanner;

class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int temp = 0;
        System.out.println("Enter the elements:");
        for (int j = 0; j < n - 1; j++) {
            if (j % 2 == 0) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            } else {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("AFTER:");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.print("\n");
    }
}
