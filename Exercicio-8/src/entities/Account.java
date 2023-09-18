package entities;

import util.ColorConsole;

public class Account {
    private int number; //numero da conta
    private String holder; //nome do titular
    private double balance; //saldo

    public Account (int number, String holder){
        this.number = number;
        this.holder = holder;
    }
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        Deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
    public void Deposit(double amount){ //operacao de deposito em conta
        if(amount > 0){
            balance += amount;
        }else {
            System.out.println("Invalid value");
        }
    }
    public void withDrawn(double amount){ //operacao de saque
        balance -= amount + 5;
    }

    public String toString(){
        return "Account: "
                + number
                +", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
