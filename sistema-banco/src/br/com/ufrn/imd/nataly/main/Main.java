package br.com.ufrn.imd.nataly.main;

import br.com.ufrn.imd.nataly.accounts.*;
import br.com.ufrn.imd.nataly.bank.*;

public class Main {
    public static void main(String[] args){

        Bank banco = new Bank();

        // criando contas

        // criando conta corrente
        CheckingAccount ca = new CheckingAccount(1,1000.60, 2.00);
        banco.addAccount(ca);

        // criando conta corrente
        CheckingAccount ca2 = new CheckingAccount(2,4500.00, 2.50);
        banco.addAccount(ca2);

        // criando conta poupança
        SavingsAccount sa = new SavingsAccount( 51, 200000.00, 50000.00);
        banco.addAccount(sa);

        // removendo conta
        banco.deleteAccount(ca2);

        // gerando o relatorio de contas do banco
        Paper paper = new Paper();
        paper.generatePaper(banco);

        // depositando na conta poupança
        sa.deposit(4000.00);
        paper.generatePaper(sa); // relatorio conta poupança

        // sacando na conta corrente
        ca.withdraw(550.10);
        paper.generatePaper(ca);

        // transferindo
        sa.transfer(50000.00, ca); // relatorio conta corrente

        // gerando o relatorio de contas do banco novamente
        paper.generatePaper(banco);
    }
}
