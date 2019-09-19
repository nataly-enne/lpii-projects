package br.com.ufrn.imd.nataly.bank;

import br.com.ufrn.imd.nataly.accounts.*;

public class Paper {
    public void generatePaper(CheckingAccount account){
        account.getDatas();
    }
    public void generatePaper(SavingsAccount account){
        account.getDatas();
    }
    public void generatePaper(Bank bank){
        bank.getDatas();
    }
}
