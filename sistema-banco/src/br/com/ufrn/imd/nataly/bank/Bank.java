package br.com.ufrn.imd.nataly.bank;

import br.com.ufrn.imd.nataly.accounts.*;
import br.com.ufrn.imd.nataly.interfaces.*;

import java.util.ArrayList;

public class Bank implements Imprimivel {

    ArrayList <BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public void deleteAccount(BankAccount account){
        for (int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getAccountNumber() == (account.getAccountNumber())){
                accounts.remove(i);
                System.out.println("Conta removida com sucesso.");
            }
        }
    }
    public BankAccount searchAccount(int key){
        for (int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getAccountNumber() == key){
                return accounts.get(i);
            }
        }
        return null;
    }

    @Override
    public void getDatas() {
        for (int i = 0; i<accounts.size(); i++){
            accounts.get(i).getDatas();
        }
    }
}
