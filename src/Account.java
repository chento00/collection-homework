import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Account implements Comparable<Account>  {
    Integer id;
    String owner;
    Double balance;
    // add , edit , remove , show
    // show ASC ID,balance, show DEC ID ,balance
    public Account(){}
    public Account(Integer id, String owner, Double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public int compareTo(Account other) {
        return Integer.compare(this.id, other.id);
    }
    void input(Scanner scanner){
        System.out.print("Enter ID: ");
        id=scanner.nextInt();
        System.out.print("Enter Owner : ");
        owner=scanner.next();
        System.out.print("Enter Balance : ");
        balance=scanner.nextDouble();
    }
    void output(){
        System.out.println("ID: "+id+" Name : "+owner+" Balance: "+balance);
    }

    public Double getBalance() {
        return balance;
    }

    public Integer getId() {
        return id;
    }
    public static void sortByID(List<Account> accounts) {
        Comparator<Account> idComparator = new Comparator<Account>() {
            @Override
            public int compare(Account a1, Account a2) {
                return Integer.compare(a1.getId(), a2.getId());
            }
        };
        Collections.sort(accounts, idComparator);
    }
    // Method to sort by balance
    public static void sortByBalance(List<Account> accounts) {
        Comparator<Account> balanceComparator = new Comparator<Account>() {
            @Override
            public int compare(Account a1, Account a2) {
                return Double.compare(a1.getBalance(), a2.getBalance());
            }
        };
        Collections.sort(accounts, balanceComparator);
    }
}
