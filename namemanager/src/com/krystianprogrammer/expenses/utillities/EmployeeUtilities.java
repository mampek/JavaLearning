package com.krystianprogrammer.expenses.utillities;

import com.krystianprogrammer.expenses.domain.Employee;
import com.krystianprogrammer.expenses.domain.Employees;

public class EmployeeUtilities {

    public boolean employeeExists(Employees employees, Employee employee)
    {
        return employees.findBySurname(employee.getSurname()) != null;

    }
}
