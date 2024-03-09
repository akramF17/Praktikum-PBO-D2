/*
 * File         : BankAccount.java
 * Deskripsi    : Program Class yang merepresentasikan akun bank dengan method untuk menyetor, menarik, dan memeriksa saldo
 * Pembuat      : Zikry Alfahri Akram (24060122120033)
 * Tanggal      : Rabu, 6 Maret 2024
 * 
 */

public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal
  
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
  
    public void deposit(double amount) {
        if (amount <= 0){
            throw new IllegalArgumentException("Deposit must be greater than 0!");
        }
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
  
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - Math.abs(amount) < MIN_BALANCE){
            throw new InsufficientFundsException("Insufficient funds! Minimum balance required: $" + MIN_BALANCE);
        }
        balance -= Math.abs(amount);
        System.out.println("Withdrawn: $" + Math.abs(amount));
    }
  
    public double getBalance() {
      return balance;
    }
  }
  