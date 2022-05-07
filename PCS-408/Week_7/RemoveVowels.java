import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(removeVowel(str));
    }

    public static String removeVowel(String str) {
        Character vowels[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        List<Character> list = Arrays.asList(vowels);
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < sb.length(); i++) {
            if (list.contains(sb.charAt(i))) {
                sb.replace(i, i + 1, "");
                i--;
            }
        }
        return sb.toString();
    }
}