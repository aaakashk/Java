import java.util.Scanner;

class BankDeposit {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		float p, r, n, a = 0.0F;

		/*
		 * p = principal
		 * r = rate of interest
		 * n = time(in years or in months)
		 * a = maturity amount
		 */
		System.out.println("1. Term Deposit\n2. Recurring Deposit\nEnter your choice:");
		while (true) {
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					System.out.print("Enter the principal amount:");
					p = scanner.nextFloat();
					System.out.print("Enter the rate of interest:");
					r = scanner.nextFloat();
					System.out.print("Enter the time period in years:");
					n = scanner.nextFloat();
					a = p * (1 + r / 100) * n;
					System.out.println("The maturity amount is " + a);
					System.exit(0);
				case 2:
					System.out.print("Enter the principal amount:");
					p = scanner.nextFloat();
					System.out.print("Enter the rate of interest:");
					r = scanner.nextFloat();
					System.out.print("Enter the time period in months:");
					n = scanner.nextFloat();
					a = (p * n) + (p * n * (n + 1) / 2) * (r / 100) * (1 / 12);
					System.out.println("The maturity amount is " + a);
					System.exit(0);
				default:
					System.out.println("Wrong choice.\nEnter again:");
			}
		}
	}
}
