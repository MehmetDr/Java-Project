
import java.util.Scanner;

public class Account {
    private static final int CORRECT_PASSWORD = 1234;
    Scanner scan = new Scanner(System.in);
    private double balance;
    private String ownerName;

    public Account(String ownerName,double balance){
        this.ownerName=ownerName;
        this.balance=balance;
    }
    public double addAmount(double amount){
        balance+=amount;
        return balance;
    }
    public double withdraw(double money) {
        int attempt = 3;


        while (attempt > 0) {
            System.out.print("Please enter your password (" + attempt + " have attempt): ");


            int password = scan.nextInt();

            if (password == CORRECT_PASSWORD) {

                if (balance >= money) {
                    balance -= money;
                    System.out.println("Withdraw is successful. New balnce: " + balance);
                    return balance;
                } else {
                    System.out.println("EROR: Wrong Insufficient balance");
                    return -1;
                }
            } else {

                attempt--;
                if (attempt> 0) {
                    System.out.println("Wrong password try again!!");
                }
            }
        }


        System.out.println("Your account has been banned.A lot of wrong attempt");
        return -1;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

}
