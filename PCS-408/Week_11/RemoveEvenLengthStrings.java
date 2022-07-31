package Week_11;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEvenLengthStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list: ");
        int n = sc.nextInt();
        System.out.println("Enter words for the list: ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.length() % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
