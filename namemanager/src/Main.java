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

        Department financeDept =
                new Department("Finance", "Sally Green");

        financeDept.getManagerName();

        AlternativeDepartment personnelDept =
                new AlternativeDepartment("Personnel", "Bill Purple");

        ExpenseClaim expenseClaim = new ExpenseClaim(1,12, "12.01.2011",120.00);
        System.out.println(expenseClaim.isPaid());
        expenseClaim.setPaid(true);
        expenseClaim.setApproved(true);
        expenseClaim.setPaid(true);
        System.out.println(expenseClaim.isPaid());

        ExpenseItem expenseItem =
                new ExpenseItem(1,13, "hotel", "accomendation", 23.00);
        System.out.println(expenseItem.getExpenseType());
    }
}
