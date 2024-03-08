/* Nama : Alfonso Clement Sutantio
 * NIM : 24060122130080
 * Tugas : Praktikum 3
 * Lab : D1
 */ 
public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
    /* Logic yang memenuhi persyaratan diatas 
    dengan menggunakan exception */
        if(this.balance-amount<MIN_BALANCE) {
            throw new InsufficientFundsException("Insufficient funds. Minimum balance required: $100.0");
        }else{
            this.balance = this.balance-amount;
            System.out.println("Saldo saat ini: "+"$"+this.balance);
        }
        
    }

    public double getBalance() {
        return this.balance;
    }
   }
   