package com.swedbank.javagyk;

public class LoansUtility {
    private static Loan[] loans;
    //Method to calculate full Loans amount
    public static double findFullLoansAmount(Loan[] loans) {
        double sum = 0;
        for (Loan loan : loans) {
            sum += loan.getAmount();
        }
        return sum;
    }

    public LoansUtility() {
    }

    public static Loan[] getLoans() {
        return loans;
    }

    public static void setLoans(Loan[] loans) {
        LoansUtility.loans = loans;
    }
}
