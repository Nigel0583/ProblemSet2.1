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
        return "Account Number: " +getAccnum()+ "\nBalance: €" +String.format("%.2f", getBalance())+ "\nAccount Holder: " +customer.getName();
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

    public void lodgement(double lodge){
        setBalance(getBalance()+lodge);
    }

    public void withdraw(double with){

        double w;
        w = getBalance()-with;
        if (w>0){
            setBalance(getBalance()-with);
        }
    }

    public static BankApplication[] create(BankApplication[] ogBank){
        BankApplication[] bank = new BankApplication[ogBank.length+1];

        for (int i= 0; i < ogBank.length; i++){
            bank[i] = ogBank[i];
        }
        return bank;
    }

    public static  void addAccounts(BankApplication[] accounts, BankApplication account){
        accounts[accounts.length-1] = account;

    }

    public static String arraytoString(BankApplication[] accounts){
        String blank = "";
        for (int i=0; i<accounts.length; i++){
            blank += (accounts[i].toString()+"\n\n");
        }

        return blank;
    }
}
