package ch12.sec02;

public class ExitExample {
    public static void main(String[] args) {
        for(int i =0; ; i++){       // 무한 루프
            System.out.println(i);
            if(i==5){
                System.out.println("프로세스 강제 종료");
                System.exit(0);     // 프로세스 강제 종료 메서드, 0은 정상 종료를 의미, -1과 1은 비정상 종료
            }
        }
    }
}
