import java.util.Scanner;
import java.lang.StringBuffer;

class Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num;
        System.out.print("Enter a number: ");
        num = scanner.nextLine();
        StringBuffer sb = new StringBuffer();
        sb.append(num);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0')
                sb.replace(i, i + 1, "1");
        }
        System.out.println(sb);
    }
}
