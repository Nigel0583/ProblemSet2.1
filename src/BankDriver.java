import javax.swing.*;

public class BankDriver {
    public static void main(String[] args) {

        BankApplication[] accounts = new BankApplication[0];

        String text = "";

        while (!text.equals("N")){

            text = JOptionPane.showInputDialog("Would you like to creat an account (Y/N)");
            text = text.toUpperCase();

            if (!text.equals("N")){
                    BankApplication newaccounts = new BankApplication();

                    Person name = new Person(JOptionPane.showInputDialog("Please enter your name"));
                    newaccounts.setCustomer(name);

                    newaccounts.setAccnum(JOptionPane.showInputDialog("Please enter your account number"));

                    newaccounts.setBalance(Double.parseDouble(JOptionPane.showInputDialog("Please enter your balance")));

                    accounts = BankApplication.create(accounts);

                    BankApplication.addAccounts(accounts,newaccounts);

                    JOptionPane.showMessageDialog(null,BankApplication.arraytoString(accounts));
            }
        }
    }
}
