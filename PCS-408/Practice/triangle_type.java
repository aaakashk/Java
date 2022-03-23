import java.util.Scanner;
class Triangle{
    public static void main(String args[]){
	int a, b, c;
	Scanner scanner = new Scanner (System.in);
	a = scanner.nextInt();
	b = scanner.nextInt();
	c = scanner.nextInt();
	if(a + b > c || b + c > a || a + c > b){
	    if(a == b && b == c)
	        System.out.println("Equilateral triangle");
	    else if(a == b || b == c || c ==a)
	        System.out.println("Isosceles triangle");
	    else
	        System.out.println("Scalene triangle");
	}
	else
	    System.out.println("Triangle with the entered sides is not possible.");
    }
}
