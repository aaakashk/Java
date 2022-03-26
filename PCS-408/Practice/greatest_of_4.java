import java.util.Scanner;
class Greatest{
    public static void main(String[] args){
	int a, b, c, d;
	System.out.print("Enter 4 integers: ");	
	Scanner scanner = new Scanner(System.in);
	a = scanner.nextInt();
	b = scanner.nextInt();
	c = scanner.nextInt();
	d = scanner.nextInt();
	if(a < b) a = b;
	if(c < d) c = d;
	if(a < c) a = c;
	System.out.println("Greatest number is "+ a);
    }
}
