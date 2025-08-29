public class _7_Bank {
    private int balance=1000;
    public void withdraw(int amount){
        if(amount >balance){
            throw new _7_InsufficientBalanceException("Cannot withdraw amount greater than balance");
        }
        else{
            balance = balance - amount;
            System.out.println("Withdraw Successfully");
        }
    }

}
