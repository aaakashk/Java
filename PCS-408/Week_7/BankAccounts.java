import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAccounts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of depositors': ");
        int n = Integer.parseInt(br.readLine());
        Bank[] b = new Bank[n];

        for (int i = 0; i < n; i++) {
            boolean accountAlreadyMade = false;
            boolean processComplete = false;

            while (!processComplete) {
                System.out.print(
                        "1. Create an account.\n2. Deposit.\n3. Withdrawal\n4. Change address.\n5. Display the depositor's information.\n6. Exit\nEnter your choice: ");
                int choice = Integer.parseInt(br.readLine());
                switch (choice) {
                    case 1:
                        if (accountAlreadyMade)
                            System.out.println("Account already created.");
                        else {
                            b[i] = new Bank();
                            System.out.print("Enter the account holder's name: ");
                            b[i].setName(br.readLine());
                            System.out.print("Enter the account holder's address: ");
                            b[i].setAddress(br.readLine());
                            System.out.println("Account created successfully.");
                            accountAlreadyMade = true;
                        }
                        break;
                    case 2:
                        if (!accountAlreadyMade)
                            System.out.println("First create an account.");
                        else {
                            System.out.print("Enter the amount to deposit: ");
                            b[i].deposit(Integer.parseInt(br.readLine()));
                        }
                        break;
                    case 3:
                        if (!accountAlreadyMade)
                            System.out.println("First create an account.");
                        else {
                            System.out.print("Enter the amount to withdraw: ");
                            b[i].withdraw(Integer.parseInt(br.readLine()));
                        }
                        break;
                    case 4:
                        if (!accountAlreadyMade)
                            System.out.println("First create an account");
                        else {
                            System.out.print("Enter the new address: ");
                            b[i].changeAddress(br.readLine());
                        }
                        break;
                    case 5:
                        if (!accountAlreadyMade)
                            System.out.println("No account found.");
                        else
                            b[i].display();
                        break;
                    case 6:
                        System.out.printf("Account holder %d done.\n", i + 1);
                        processComplete = true;
                        break;
                    default:
                        System.out.println("Please choose between 1 and 6.");
                }
            }
        }
    }
}
