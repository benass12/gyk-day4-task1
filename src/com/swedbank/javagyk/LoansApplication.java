package com.swedbank.javagyk;

import java.time.LocalDateTime;

public class LoansApplication {
    public static void main(String[] args) {
        //First loan
        Loan consumerLoan = new Loan();
        consumerLoan.setId(1);
        consumerLoan.setAmount(100000);
        consumerLoan.setLoanType(LoanType.CONSUMER_LOAN);
        consumerLoan.setTerminationDate(LocalDateTime.now().plusYears(30));
        //Second loan
        Loan leasing = new Loan();
        leasing.setId(2);
        leasing.setAmount(20000);
        leasing.setLoanType(LoanType.LEASING);
        leasing.setTerminationDate(LocalDateTime.now().plusYears(6));
        //Loans array
        Loan[] loans = new Loan[]{leasing, consumerLoan};

        Customer customer = new Customer();
        customer.setFirstName("Vardas");
        customer.setLastName("Pavarde");
        customer.setAge(26);
        customer.setPersonalNumber("39307255467");
        customer.setLoan(loans);
        //Print out full loans amount
        System.out.println(LoansUtility.findFullLoansAmount(loans));
        //Print out all information about customer and his loans
        System.out.println(customer.toString());
    }
}
