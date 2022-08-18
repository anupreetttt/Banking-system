import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        accountInfo customerInfo = new accountInfo();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Customer: ");
        String name1 = scanner.nextLine();

        System.out.println("Enter the email of the Customer: ");
        String email1 = scanner.nextLine();

        System.out.println("Enter the account number of the Customer: ");
        int acctNum1 = scanner.nextInt();

        System.out.println("Enter the balance of the Customer: ");
        int balance1 = scanner.nextInt();

        System.out.println("Enter the number of the Customer: ");
        int number1 = scanner.nextInt();

        customerInfo.setName(name1);
        customerInfo.setEmail(email1);
        customerInfo.setacctNum(acctNum1);
        customerInfo.setBalance(balance1);
        customerInfo.setnumber(number1);

        System.out.println("Select one one of the options: ");
        System.out.println("1. Deposit funds: ");
        System.out.println("2. Withdraw funds: ");
        System.out.println("3. To view balance: ");
        int option = scanner.nextInt();
        if(option == 1 || option == 2 || option == 3) {
        switch (option) {
            case 1:
                System.out.println("Please enter the value you want to deposit: ");
                int depoValue = scanner.nextInt();
                customerInfo.deposit(depoValue);
                break;
            case 2:
                System.out.println("Please enter the value you want to withdraw: ");
                int withDraw = scanner.nextInt();
                customerInfo.withdraw(withDraw);
                break;
            case 3:
                System.out.println("Your current balance is: " + customerInfo.getBalance());
                break;
        }
        } else {
            System.out.println("Please enter 1 or 2.");
        }
    }
}