import java.util.ArrayList;
import java.util.Scanner;

public class SwapPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        System.out.println("Enter words for the list: ");
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        for(int i = 0; i <list.size() - 1; i += 2) {
            String temp = list.get(i + 1);
            list.set(i + 1, list.get(i));
            list.set(i, temp);
        }
        System.out.println(list);
    }
}
