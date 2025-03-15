package Q_10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        Scanner scan=new Scanner(System.in);
        System.out.println("Input the loan amount: ");
        double loanAmount= scan.nextDouble();
        System.out.println("Input the annual interest rate: ");
        double annualInterestRate= scan.nextDouble();
        System.out.println("Input the loan period: ");
        int loanPeriod= scan.nextInt();
        double  monthlyInterestRate=annualInterestRate/100.0/MONTHS_IN_YEAR;
        double  numberOfPayments=loanPeriod*MONTHS_IN_YEAR;
        double  monthlyPayment= (loanAmount * monthlyInterestRate) / (1 - Math.pow(
                1 /(1 + monthlyInterestRate), numberOfPayments) );
        double  totalPayment= monthlyPayment * numberOfPayments;
        System.out.println("Monthly and Total payments: "+monthlyPayment + " " + totalPayment);
    }
}
