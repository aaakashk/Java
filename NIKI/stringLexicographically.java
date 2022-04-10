import java.util.Scanner;

class StringLexicographically{

    static String[] getSmallestAndLargest(String s, int k){
	String smallest = s.substring(0, k);
	String largest = s.substring(0, k);
	String newSubstring = "";
	for(int i = 1; i < s.length() - k + 1; i++){
	    newSubstring = s.substring(i, k + i);
	    if(newSubstring.compareTo(smallest) < 0)
		smallest = newSubstring;
	    if(newSubstring.compareTo(largest) > 0)
		largest = newSubstring;
	}
	return new String[]{smallest, largest};
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int k = sc.nextInt();
	String[] stringArray = new String[2]; 
	stringArray = getSmallestAndLargest(s, k);
	System.out.print(stringArray[0] + "\n" + stringArray[1]);
    }
}	
	
