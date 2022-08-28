package com.krystianprogrammer.expenses.domain;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "ExpenseClaim{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", dateOfClaim='" + dateOfClaim + '\'' +
                ", totalAmount=" + totalAmount +
                ", approved=" + approved +
                ", paid=" + paid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpenseClaim that = (ExpenseClaim) o;
        return Double.compare(that.totalAmount, totalAmount) == 0 && approved == that.approved && paid == that.paid && Objects.equals(id, that.id) && Objects.equals(employeeId, that.employeeId) && Objects.equals(dateOfClaim, that.dateOfClaim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employeeId, dateOfClaim, totalAmount, approved, paid);
    }
}
