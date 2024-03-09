/*
 * File         : BankApp.java
 * Deskripsi    : Program Main yang menciptakan objek akun bank untuk melakukan transaksi dan menangani Exception
 * Pembuat      : Zikry Alfahri Akram (24060122120033)
 * Tanggal      : Rabu, 6 Maret 2024
 * 
 */

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try{
            // Skenario value amount deposit positif
            account.deposit(100.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());

            // Skenario value amount deposit negatif
            // account.deposit(-100.0);
            // System.out.println("Saldo saat ini: $" + account.getBalance()); // Baris ini tidak akan tampil

            // Skenario saldo mencukupi
            account.withdraw(400.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());
            
            // Skenario saldo tidak mencukupi
            account.withdraw(300.0);
            System.out.println("Saldo saat ini: $" + account.getBalance()); // Baris ini tidak akan tampil
        } catch(InsufficientFundsException ifex){
            System.out.println(ifex.getMessage());
        } catch (IllegalArgumentException iaex){
            System.out.println(iaex.getMessage());
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
  }
  