package Week_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlternateElementsList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of list 1 and list 2: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        ArrayList<Integer> list_1 = new ArrayList<>();
        ArrayList<Integer> list_2 = new ArrayList<>();
        System.out.println("Enter elements of list 1: ");
        for (int i = 0; i < m; i++)
            list_1.add(sc.nextInt());
        System.out.println("Enter elements of list 2 :");
        for (int i = 0; i < n; i++)
            list_2.add(sc.nextInt());
        System.out.println(alternate(list_1, list_2));
    }

    public static ArrayList<Integer> alternate(ArrayList<Integer> list_1, ArrayList<Integer> list_2) {
        Iterator<Integer> i1 = list_1.iterator();
        Iterator<Integer> i2 = list_2.iterator();
        ArrayList<Integer> newList = new ArrayList<>();
        while (i1.hasNext() || i2.hasNext()) {
            if (i1.hasNext())
                newList.add(i1.next());
            if (i2.hasNext())
                newList.add(i2.next());
        }
        return newList;
    }
}
