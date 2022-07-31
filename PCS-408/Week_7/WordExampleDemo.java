import java.util.Scanner;

public class WordExampleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        WordExample we = new WordExample(s);
        System.out.println("Number of words with vowels in the start and end: ");
        System.out.println(we.countWord());
        System.out.println("Required string: ");
        we.vowelsConsonants();
    }
}
