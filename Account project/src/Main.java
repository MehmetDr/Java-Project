
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account a1 = new Account("Yusuf",1025);
        Account a2 = new Account("Ahmet",45.54);
        a1.setOwnerName("Yusuf");
        a2.setOwnerName("Ahmet");
        a1.addAmount(25);
        a2.addAmount(56);
        a1.withdraw(25);
        a2.withdraw(38.89);



    }
}
