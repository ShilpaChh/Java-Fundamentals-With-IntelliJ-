package bites.examples;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

// Phase 2 - Java Three Ways: Bank
// date || credit || debit || balance
//        14/01/2021 || - || 500.00 || 2500.00
//        13/01/2021 || 2000.00 || - || 3000.00
//        10/01/2021 || 1000.00 || - || 1000.00

public class BankAccount {

    int balance = 0;

    public String getBalance() {
        return df.format(balance);
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");
    private ArrayList<ArrayList<String>> transactions = new ArrayList<ArrayList<String>>();

    public static void main(String args[]) {
        BankAccount bankAccount = new BankAccount();

        // Given a client makes a deposit of 1000 on 2021-01-10
        bankAccount.deposit(1000, LocalDate.of(2021, 1, 10));
//        System.out.println("Balance is:" + bankAccount.getBalance());

        // And a deposit of 2000 on 2021-01-13
        bankAccount.deposit(2000, LocalDate.of(2021, 1, 13));

//        System.out.println("Balance is:" + bankAccount.getBalance());

        // And a withdrawal of 500 on 2021-01-14
        bankAccount.withdraw(500, LocalDate.of(2021, 1, 14));
//        System.out.println("Balance is:" + bankAccount.getBalance());
        //System.out.println("Balance is:" + bankAccount.Balance);

        // When she prints her bank statement
        System.out.println(bankAccount.generateStatement());

    }

    private void deposit(int depositAmount, LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LL/yyyy");
        ArrayList<String> thisDeposit = new ArrayList<String>();
        thisDeposit.add(" " + formatter.format(date) + " ");
        thisDeposit.add(" " + df.format(depositAmount) + " " );

        balance = balance + depositAmount;
        thisDeposit.add(" " + " - " + " ");
        thisDeposit.add(" " + getBalance() + " ");
        transactions.add(thisDeposit);
        //System.out.println(thisDeposit);
    }

    private String withdraw(int withdrawAmount, LocalDate date) {
        if (withdrawAmount <= balance) {
            //System.out.println("This is calling withdrawal");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LL/yyyy");
            ArrayList<String> thisWithdrawal = new ArrayList<String>();
            thisWithdrawal.add(" " + formatter.format(date) + " ");
            thisWithdrawal.add(" " + " - " + " ");
            thisWithdrawal.add(" " + df.format(withdrawAmount) + " ");

            balance = balance - withdrawAmount;
            thisWithdrawal.add(" " + getBalance() + " ");

            transactions.add(thisWithdrawal);
            //System.out.println(thisWithdrawal);

            return "Withdrawal successful!";
            //Balance = total - withdrawAmount;
        } else {
            return "Withdrawal amount has exceeded the balance!";
        }
    }

    private String generateStatement() {
        ArrayList<ArrayList<String>> rev = new ArrayList<ArrayList<String>>(transactions);
        Collections.reverse(rev);

        String Heading =  "Date || " + " Credit || " +  " Debit || " + " Balance "+ "\n";

        for(ArrayList iteration:rev) // iteration is like a placeholder for iteration. for each iteration in ArrayList in rev, do this once for every iteration in this enhanced for loop
             {
            String thisTransaction = String.join( "||", iteration) +"\n";
            Heading += thisTransaction;
        }
        return Heading;
    }

}