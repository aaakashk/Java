import java.util.Scanner;

class Friendly {
	static int sumOfDivisors(int num) {
		int sumDivisors = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				sumDivisors += i;
		}
		return sumDivisors;
	}

	public static void main(String[] args) {
		int num1, num2, divSum1, divSum2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		divSum1 = sumOfDivisors(num1);
		divSum2 = sumOfDivisors(num2);
		if ((divSum1 / num1 == 2) && (divSum2 / num2 == 2))
			System.out.println("Friendly pair of integers.");
		else
			System.out.println("Not Friendly pair.");
	}
}