public class L5Q31 implements L5Q3 {
    private int accountBalance = 0;
    private int accountId;

    public void setId(int id) {
        accountId = id;
        System.out.println("Your id is :" + accountId);
    }

    public void checkBalance() {
        System.out.println("The balance is NRs." + accountBalance);
    }

    public void addMoney(int amount) {
        accountBalance += amount;
        System.out.println("Money deposited NRs." + amount);
    }

    public static void main(String[] args) {
        L5Q31 banker = new L5Q31();
        banker.setId(1020);
        banker.checkBalance();
        banker.addMoney(2000);
        banker.checkBalance();
        banker.addMoney(500);
        banker.checkBalance();
    }
}
