package com.krystianprogrammer.expenses.domain;

public class ExpenseClaim {

    private Integer id;
    private Integer employeeId;
    private String dateOfClaim;
    private double totalAmount;
    private boolean approved;
    private boolean paid;

    public ExpenseClaim(Integer id, Integer employeeId, String dateOfClaim, double totalAmount) {
        this.id = id;
        this.employeeId = employeeId;
        this.dateOfClaim = dateOfClaim;
        this.totalAmount = totalAmount;
        this.approved = false;
        this.paid = false;
    }

    public void setApproved(boolean approved) {

        this.approved = approved;

    }

    public void setPaid(boolean paid) {
        if (!approved && paid) {
            System.out.println("This item cannot be paid as it has not yet been approved.");
        }
        else {
            this.paid = paid;
        }
    }

    public Integer getId() {
        return id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getDateOfClaim() {
        return dateOfClaim;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public boolean isApproved() {
        return approved;
    }

    public boolean isPaid() {
        return paid;
    }
}
