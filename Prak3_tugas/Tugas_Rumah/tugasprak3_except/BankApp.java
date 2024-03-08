/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Tugas : Praktikum 3
 * Lab : D1
 */ 
import java.util.Scanner;
public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Initial Balance: ");
        double balance = scanner.nextDouble();
        BankAccount akun1 = new BankAccount(balance);
        try{
            System.out.print("Withdrawn: ");
            akun1.withdraw(scanner.nextDouble());
            System.out.print("Withdrawn: ");
            akun1.withdraw(scanner.nextDouble());
            akun1.deposit(600);
            System.out.print("Withdrawn: ");
            akun1.withdraw(scanner.nextDouble());
            System.out.print("Withdrawn: ");
            akun1.withdraw(scanner.nextDouble());
        }catch(InsufficientFundsException IFE){
            System.out.println(IFE.getMessage());
        }
        scanner.close();
    }
   }