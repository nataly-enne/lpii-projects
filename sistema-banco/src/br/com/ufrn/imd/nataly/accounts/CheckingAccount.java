package br.com.ufrn.imd.nataly.accounts;

import br.com.ufrn.imd.nataly.interfaces.Imprimivel;

public class CheckingAccount extends BankAccount implements Imprimivel {

    private double rateOp; // taxa de operação

    public CheckingAccount(int accountNumber, double balance, double rateOperation) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.rateOp = rateOperation;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    @Override
    public void withdraw(double value) { // sacar
        if(value > this.balance - this.rateOp){
            System.out.println("Saldo insuficiente! \n Operação não realizada.");
        }
        else{
            this.balance = balance - value - this.rateOp;
        }
    }

    @Override
    public void deposit(double value) { // depositar
        this.balance = balance + value - this.rateOp;
    }

    @Override
    public void transfer(double value, BankAccount account) { // transferir
        this.withdraw(value);
        account.deposit(value);
    }

    @Override
    public String toString(){
        return String.format("Conta: " + this.accountNumber + "\n Saldo: " + this.balance + "\n Taxa de operação: " + this.rateOp);
    }

    @Override
    public void getDatas() {
        System.out.println(this.toString());
    }

}
