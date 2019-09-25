package herancaApplication;

import herancaEntities.Account;
import herancaEntities.BusinessAccount;
import herancaEntities.SavingsAcount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account();
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

//      UPCASTING = Pegar um obj tipo BusinessAcount e atribuir na var Account

        Account acc1    = bacc;
        Account acc2    = new BusinessAccount(1003, "Bob", 0.0, 200.00);
        Account acc3    = new SavingsAcount(1004,"Anna",0.00,0.01);

//      DOWNCASTING = Converter um obj da superclasse para subclasse
//        BusinessAccount acc4 = acc2;
//        nao posso converter de account para businessAccount a menos que force com castin
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.00);

//      Compilador deixa mas da problema na execucao exemplo abaixo: Porque o SavingAccount não é um
//      BusinnessAccount. Entao temos que verificar a Instancia


        if ( acc3 instanceof BusinessAccount ){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Load!!");
        }
        if ( acc3 instanceof SavingsAcount ){
            SavingsAcount acc5 = (SavingsAcount) acc3;
            acc5.updateBalance();
            System.out.println("Upadate!");
        }
    }
}
