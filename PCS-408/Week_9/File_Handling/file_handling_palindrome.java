package Week_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalindromeCount {
    public static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--)
            if (s.charAt(i) != s.charAt(j))
                return false;
        return true;
    }

    public static void main(String[] args) {
        try {
            File file = new File("/Users/akashkumar/Codes/Java/PCS-408/Week_9/File_Handling/myfile.txt");
            Scanner sc = new Scanner(file);
            int count = 0;
            while (sc.hasNext()) {
                if (isPalindrome(sc.next()))
                    count++;
            }
            sc.close();
            System.out.println("Count: " + count);
        } catch (FileNotFoundException fnfe) {
            System.out.println("file not found" + fnfe);
        }
    }
}