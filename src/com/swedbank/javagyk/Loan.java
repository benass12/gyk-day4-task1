package com.swedbank.javagyk;

import java.time.LocalDateTime;

public class Loan {
    private long id;
    private double amount;
    private LoanType loanType;
    private LocalDateTime terminationDate;

    public Loan() {
    }

    public Loan(long id, double amount, LoanType loanType, LocalDateTime terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public LocalDateTime getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(LocalDateTime terminationDate) {
        this.terminationDate = terminationDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", loanType=" + loanType +
                ", terminationDate=" + terminationDate +
                '}';
    }
}
