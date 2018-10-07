public class BankApplication {
    private String accnum;
    private double balance;
    private Person customer;


    public double getBalance() {
        return balance;
    }

    public Person getCustomer() {
        return customer;
    }

    public String getAccnum() {
        return accnum;
    }

    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public  String toString(){
        return "Account Number: " +getAccnum()+ "\nBalance: €" +String.format("%.2f", getBalance())+ "\nAccount Holder: " +getCustomer();
    }

    public BankApplication(){
        setAccnum("0");
        setBalance(0);
        customer = new Person("Unknown");
    }

    public BankApplication(String accnum, double balance, Person customer){
        setAccnum(accnum);
        setBalance(balance);
        setCustomer(customer);
    }
}
