package br.com.ufrn.imd.nataly.accounts;

import br.com.ufrn.imd.nataly.interfaces.*;

public class SavingsAccount extends BankAccount implements Imprimivel {

    private double  limit,
                    maxLimit; // limite máximo

    public SavingsAccount(int accountNumber, double balance, double limit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.limit = limit;
        this.maxLimit = limit;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    @Override
    public void withdraw(double value) { // sacar
        if(value > this.balance){
            if (value > limit){
                System.out.println("Limite excedido!");
            }
            else{
                this.balance = balance - value;
                this.limit = limit - value;
            }
        }
        else{
            this.balance = balance - value;
        }
    }

    @Override
    public void deposit(double value) { // depositar
        this.balance = balance + value;

        if(balance < 0 && value >= maxLimit - limit){
            this.limit = maxLimit;
        }
        if(balance < 0 && value < maxLimit - limit){
            this.limit = limit + value;
        }
    }

    @Override
    public void transfer(double value, BankAccount account) { // trasnferir
        this.withdraw(value);
        account.deposit(value);
    }
    @Override
    public String toString(){
        return String.format("Conta: " + this.accountNumber + "\n Saldo: " + this.balance + "\n Limite Atual: " + this.limit);
    }

    @Override
    public void getDatas() {
        System.out.println(this.toString());
    }
}
