package com.swedbank.javagyk;

import java.time.LocalDateTime;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("Vardas");
        employee.setLastName("Pavarde");
        employee.setContractType(ContractType.FULL_TIME);
        employee.setContractStartDate(LocalDateTime.now());
        employee.setSalary(950.75);
        employee.setPosition("Junior Developer");
        //Call toString method to print out all information about Employee
        System.out.println(employee.toString());
    }
}
