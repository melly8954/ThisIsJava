package ch11.sec05;

public class Account {
    private long balance;   // 계좌 잔고

    public Account(){}

    public long getBalance(){
        return balance;
    }

    public void deposit(int money){
        balance+=money;
    }

    public void withdraw(int money) throws InsufficientException{
        if(balance < money){
            throw new InsufficientException("잔고 부족 : "+(money-balance)+" 이 모자른다.");
        }
        balance-=money;
    }
}
