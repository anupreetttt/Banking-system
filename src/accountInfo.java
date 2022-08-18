public class accountInfo {

    private String name;
    private String email;
    private int acctNum;
    private int balance;
    private int number;


    public void deposit(int value){
        this.balance += value;
        System.out.println("Deposit of " + value + " has been made. New balance is " + balance );
    }

    public void withdraw(int value) {
        if(balance - value <=0) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -=value;
            System.out.println("Withdrawal of " + value + " has been made. Remaining amount is: " + balance);
        }
    }
    public void setName(String name1){
        this.name = name1;
    }

    public String getName() {
        return this.name;
    }
    public void setEmail(String email1){
        this.email = email1;
    }

    public String getEmail() {
        return this.email;
    }
    public void setacctNum(int acctNum1){
        this.acctNum = acctNum1;
    }

    public int getacctNum() {
        return this.acctNum;
    }

    public void setBalance(int balance1){
        this.balance = balance1;
    }
    public int getBalance() {
        return this.balance;
    }
    public void setnumber(int number1){
        this.number = number1;
    }

    public int getNumber() {
        return this.number;
    }

}



