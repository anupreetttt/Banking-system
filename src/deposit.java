public class deposit {

    accountInfo customerInfo = new accountInfo();
    private int newBalance;

    public void setNewBalance(int value) {
        this.newBalance = value + customerInfo.getBalance();
    }
    public int getNewBalance() {
        return this.newBalance;
    }
}
