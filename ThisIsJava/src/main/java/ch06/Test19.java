//package ch06;
//class Account{
//    private int balance;
//    private static final int MIN_BALANCE=0;
//    private static final int MAX_BALANCE=1000000;
//
//    public int getBalance(){
//        return balance;
//    }
//    public int setBalance(int balance){
//        if(balance>=MIN_BALANCE && balance <=MAX_BALANCE){
//            this.balance+=balance;
//            return this.balance;
//        }
//        else{
//            return this.balance;
//        }
//
//    }
//}
//
//public class Test19 {
//    public static void main(String[] args) {
//        Account account = new Account();
//        account.setBalance(10000);
//        System.out.println("현재 잔고: "+account.getBalance());
//
//        account.setBalance(-100);
//        System.out.println("현재 잔고: "+account.getBalance());
//
//        account.setBalance(2000000);
//        System.out.println("현재 잔고: "+account.getBalance());
//
//        account.setBalance(300000);
//        System.out.println("현재 잔고: "+account.getBalance());
//    }
//}
