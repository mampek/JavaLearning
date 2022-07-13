public class ExpenseItem {
    private Integer id;
    private Integer claimId;
    private String expenseType;
    private String description;
    private double amount;

    public ExpenseItem(Integer id, Integer claimId, String expenseType, String description, double amount) {
        this.id = id;
        this.claimId = claimId;
        this.expenseType = expenseType;
        this.description = description;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public Integer getClaimId() {
        return claimId;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}
