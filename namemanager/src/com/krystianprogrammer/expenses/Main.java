package com.krystianprogrammer.expenses;

import com.krystianprogrammer.expenses.domain.*;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setId(1);
        employee1.setTitle("Mr");
        employee1.setFirstName("Matt");
        employee1.setSurname("Greencroft");

        System.out.println(employee1.getMailingName());
        System.out.println(employee1.getMailingName(true));
        System.out.println(employee1.getMailingName(false));

        Employee employee2 = new Employee(2, "Manager");
        employee2.setTitle("Dr");
        employee2.setFirstName("Denis");
        employee2.setSurname("Yellow");

        Employees employees = new Employees(15);

        employees.addEmployee(employee1);
        employees.addEmployee(employee2);
        employees.addEmployee(new Employee(3,"Mrs","Susan","Brown", "Director", Department.MARKETING));
        employees.printEmployees();

        Employee foundEmployee = employees.findBySurname("Brown");
        System.out.println("Found " + foundEmployee.getMailingName());

        Employee foundEmployee2 = employees.findBySurname("Mampe");
        System.out.println("Didn't found " + (foundEmployee2 == null));

        ExpenseClaim expenseClaim = new ExpenseClaim(1,12, "12.01.2011",120.00);
        System.out.println(expenseClaim.isPaid());
        expenseClaim.setPaid(true);
        expenseClaim.setApproved(true);
        expenseClaim.setPaid(true);
        System.out.println(expenseClaim.isPaid());

        ExpenseItem expenseItem =
                new ExpenseItem(1,13, ExpenseType.ACCOMODATION, "The Grand Hotel", 23.00);
        System.out.println(expenseItem.getDescription());

        //System.out.println(employee1.toString());

        System.out.println(employee1); //toString is not needed

        Employee employee3 = new Employee();
        employee3.setId(1);
        employee3.setTitle("Mr");
        employee3.setFirstName("Matt");
        employee3.setSurname("Greencroft");

        System.out.println(employee1.equals(employee3));
    }
}
