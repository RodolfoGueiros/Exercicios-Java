package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        //Inserindo dados da conta
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.nextLine().charAt(0);
        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }else {
            account = new Account(number, holder);
        }

        //Imprimindo dados da conta
        System.out.print("Account data: ");
        System.out.println();
        System.out.print(account);
        System.out.println();

        //Operacao de deposito
        System.out.print("Enter a deposit value: ");
        double initialDeposit = sc.nextDouble();
        account.Deposit(initialDeposit);
        System.out.print("Updated account data: ");
        System.out.print(account);
        System.out.println();

        //Operacao de saque
        System.out.print("Enter a withdraw value: ");
        double amount = sc.nextDouble();
        account.withDrawn(amount);
        System.out.println();
        System.out.print("Updated account data:\n ");
        System.out.print(account);

        sc.close();
    }
}