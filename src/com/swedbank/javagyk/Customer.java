package com.swedbank.javagyk;

import java.util.Arrays;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private String personalNumber;
    private Loan[] loan;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int age, String personalNumber, Loan[] loan) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loan = loan;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public Loan[] getLoan() {
        return loan;
    }

    public void setLoan(Loan[] loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", personalNumber='" + personalNumber + '\'' +
                ", loan=" + Arrays.toString(loan) +
                '}';
    }
}
