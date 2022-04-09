import java.util.Scanner;

class StringManip{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s1, s2;
	System.out.println("Enter two strings:");
	s1 = sc.next();
	s2 = sc.next();
//	System.out.print("Enter character to find its index: ");
//	char c = sc.next(".").charAt(0);
	char c = 'k';
	System.out.println("Index of " + c + ": " + s1.indexOf(c));
	System.out.print("Enter index to find the character present at that index: ");
	int index = sc.nextInt();
	System.out.println("Character at " + index + ": " + s1.charAt(index));
	System.out.println("UPPERCASE: " + s1.toUpperCase());
	System.out.println("LOWERCASE: " + s1.toLowerCase());
	System.out.println("Comparing string1 and string2: " + s1.compareTo(s2));
	System.out.print("Enter indexes to find substring of s1: ");
	int startIndex = sc.nextInt();
	int endIndex = sc.nextInt();
	System.out.println(s1.substring(startIndex, endIndex + 1));
    }
}
	
