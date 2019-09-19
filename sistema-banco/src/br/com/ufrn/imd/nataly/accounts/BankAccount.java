package br.com.ufrn.imd.nataly.accounts;

public abstract class BankAccount {

    int accountNumber; // número da conta
    double balance; // saldo

    public abstract void withdraw(double value); // sacar
    public abstract void deposit(double value); // depositar
    public abstract void transfer(double value, BankAccount account); // transferir
    public abstract int getAccountNumber(); // getter de accountNumber
    public abstract void getDatas(); // mostrar dados
}
