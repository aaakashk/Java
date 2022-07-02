import java.util.Scanner;

public class LinearSearch {

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter the key element: ");
        int key = sc.nextInt();
        sc.close();
        if (linearSearch(arr, key))
            System.out.println("Key element present.");
        else
            System.out.println("Key element not present.");
    }
}
