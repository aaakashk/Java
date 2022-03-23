class OddEven {
    public static void main(String args[]) {
	int num;
	num = Integer.parseInt(args[0]);
	if(num % 2 == 0)
	    System.out.println("Even number.");
	else
	    System.out.println("Odd number.");
    }
}
