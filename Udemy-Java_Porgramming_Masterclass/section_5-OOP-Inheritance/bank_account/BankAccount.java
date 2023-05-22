public class BankAccount {
    
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount(){
        // this must be the first line
        this("56789",2.50,"Default name","Default address","Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhone){
        System.out.println("Account constructor with parameters called");

        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerEmail = customerEmail;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone){
        this("00000",100.55, customerName, customerEmail, customerPhone);
    }

    

    public void depositFund(double depositAmount){

        accountBalance += depositAmount;
        setAccountBalance(accountBalance);

        System.out.println("Deposited $" + depositAmount + " New account balance is $" + accountBalance);
    }

    public void withdrawFund(double withdrawAmount){
        

        if (accountBalance - withdrawAmount >= 0){
            accountBalance -= withdrawAmount;

            System.out.println("Withdrew $" + withdrawAmount + " From Bank Account. The new account balance is $" + accountBalance);

        } else {
            System.out.println("Insufficient Fund");
        }
    }


    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }


}
