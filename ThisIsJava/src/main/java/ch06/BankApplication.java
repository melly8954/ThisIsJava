package ch06;

import java.util.Scanner;

class Account{
    private String account_number="";
    private String name = "";
    private int first_input = 0;
    
    // 값 설정을 위한 메서드
    public void setAccountNumber(String account_number){
        this.account_number=account_number;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setFirstInput(int first_input){
        this.first_input=first_input;
    }

    // 반환하기 위한 메서드
    public String getAccountNumber(){
        return this.account_number;
    }
    public String getName(){
        return this.name;
    }
    public int getFirstInput(){
        return this.first_input;
    }

    // 예금 메서드
    public int inputMoney(int money){
        first_input+=money;
        return first_input;
    }
    // 출금 메서드
    public int outputMoney(int money){
        first_input-=money;
        return first_input;
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Account[] account=new Account[100];     // 계좌 최대 100개 생성
        int new_ac=0;                           // 계좌를 만드는 객체의 인덱스 부여할 변수

        for(int i=0; i<account.length; i++){
            account[i]=new Account();           // 계좌 1개당 객체 1개
        }


        while(true){
            System.out.println("------------------------------------------------------");
            System.out.println("1. 계좌 생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.print("선택> ");

            int option=scan.nextInt();
            scan.nextLine();

            System.out.println("------------------------------------------------------");

            switch (option){
                case 1:
                    System.out.println("계좌생성");
                    System.out.println("------------------------------------------------------");
                    System.out.print("계좌번호: ");
                    String write_account_number=scan.nextLine();

                    account[new_ac].setAccountNumber(write_account_number);


                    System.out.print("계좌주: ");
                    String write_name=scan.nextLine();
                    account[new_ac].setName(write_name);

                    System.out.print("초기입금액: ");
                    int write_money=scan.nextInt();
                    account[new_ac].setFirstInput(write_money);
                    scan.nextLine();

                    System.out.println("결과: 계좌가 생성되었습니다.");
                    new_ac++;   // 계좌 생성시마다 +1
                    break;

                case 2:
                    System.out.println("계좌목록");
                    System.out.println("-----------------------");

                    for(int i=0; i<new_ac; i++){
                        System.out.println(account[i].getAccountNumber()+"\t" + account[i].getName()+"\t" + account[i].getFirstInput());
                    }
                    break;

                case 3:
                    System.out.println("예금");
                    System.out.println("-----------------------");
                    System.out.print("계좌번호: ");
                    String input_ac=scan.next();

                    for(int i=0; i<new_ac; i++){
                        if(account[i].getAccountNumber().equals(input_ac)){
                            System.out.print("예금액: ");
                            int write_inputMoney=scan.nextInt();
                            account[i].inputMoney(write_inputMoney);
                        }
                    }
                    break;

                case 4:
                    System.out.println("출금");
                    System.out.println("-----------------------");
                    System.out.print("계좌번호: ");
                    String output_ac=scan.next();

                    for(int i=0; i<new_ac; i++){
                        if(account[i].getAccountNumber().equals(output_ac)){
                            System.out.print("출금액: ");
                            int write_outputMoney=scan.nextInt();
                            account[i].outputMoney(write_outputMoney);
                        }
                    }
                    break;

                case 5:
                    System.out.println("프로그램 종료");
            }

            if(option==5){
                break;
            }
        }
    }
}
