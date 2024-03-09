/*
 * File       : UserRegistration.java
 * Deskripsi  : Program Class untuk menerima input registrasi dari pengguna berupa username, email, dan umur
 * Pembuat    : Zikry Alfahri Akram (24060122120033)
 * Tanggal    : Rabu, 6 Maret 2024
 * 
 */

import java.util.Scanner;

public class UserRegistration {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();
    UserInputValidator.validateUsername(username);

    System.out.print("Enter email address: ");
    String email = scanner.nextLine();
    UserInputValidator.validateEmail(email);

    System.out.print("Enter age: ");
    int age = scanner.nextInt();
    UserInputValidator.validateAge(age);

    scanner.close(); 
    
    System.out.println("User registration successful!");
  }
}
