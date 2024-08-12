import java.util.Scanner;

class BankAccount{
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATM{
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account){
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        System.out.println("\n1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("\nChoose an option: ");
    }

    public void start(){
        int choice;
        do{
            displayMenu();
            choice = scanner.nextInt();
            processChoice(choice);
        }while (choice != 4);
    }

    private void processChoice(int choice){
        switch (choice){
            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thank you for using the ATM. GoodBye!");
                break;
            default:
                System.out.println("Invalid Option. Please try Again.");
        }
    }

    private void withdraw(){
        System.out.println("Enter ammount to withdraw: ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)){
            System.out.println("Withdrawl Successful. Please collect the cash.");
            System.out.println("Your current account balance is :" + account.getBalance());
        }else{
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    private void deposit(){
        System.out.println("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Deposit successful.");
    }

    private void checkBalance(){
        System.out.println("Your current balance is : " + account.getBalance() + " Rs.");
    }
}
public class ATM_INTERFACE{
    public static void main(String[] args){
        BankAccount userAccount = new BankAccount(1000);
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
