/*
 * File         : InsufficientFundsException.java
 * Deskripsi    : Program Class Exception yang dilempar ketika saldo tidak mencukupi untuk melakukan penarikan
 * Pembuat      : Zikry Alfahri Akram (24060122120033)
 * Tanggal      : Rabu, 6 Maret 2024
 * 
 */

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
      super(message);
    }
  }
  