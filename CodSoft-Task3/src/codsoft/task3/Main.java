package codsoft.task3;

public class Main {
    public static void main(String[] args) {
        BankAccount userAcc = new BankAccount(1000);
        Interface atm=new Interface(userAcc);
        atm.setVisible(true);
    }
}