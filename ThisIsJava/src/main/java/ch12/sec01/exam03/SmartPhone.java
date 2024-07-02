package ch12.sec01.exam03;

public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os){
        this.company = company;
        this.os = os;
    }

    @Override
    // 최상위 클래스 Object의 toString() 재정의
    public String toString() {
        return company + "," +os;
    }
}
