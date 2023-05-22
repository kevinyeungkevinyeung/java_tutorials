public class Main {
    
    public static void main(String[] args){
        // BankAccount account = new BankAccount("12345",1000.0, "Bob Brown", "myemail@bob.com","205-123-1342");

        BankAccount account = new BankAccount();

        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountBalance());
        account.depositFund(10000.0);
        account.withdrawFund(10000.0);

        BankAccount secondAccount = new BankAccount("Tim","Tim@gmail.com","12345");

        System.out.println("AccountNo: " + secondAccount.getAccountNumber() + "; name " + secondAccount.getCustomerName());

    }
}
