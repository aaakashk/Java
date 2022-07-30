import java.util.Scanner;

class RegularExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                i++;
                while (i < s.length() && s.charAt(i) == '0') {
                    i++;
                    if (i == s.length())
                        break;
                    if (s.charAt(i) == '1')
                        count++;
                }
            } else
                i++;
        }
        System.out.println(count);
    }
}