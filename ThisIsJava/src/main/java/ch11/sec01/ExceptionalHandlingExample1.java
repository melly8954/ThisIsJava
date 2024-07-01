package ch11.sec01;

// 예외가 발생되면 프로그램은 곧바로 종료된다는 점에서 에러(Error) 와 동일
// 그러나, "예외 처리" 를 통해서 계속 실행 상태를 유지할 수 있음
// 즉, "예외 처리" 란 프로그램의 비정상 종료를 피하여 시스템이 원할이 실행되도록 함
// → 시스템이 죽으면 안됨
public class ExceptionalHandlingExample1 {
    public static void printLength(String data){
        int result = data.length();
        // data가 null일 경우 NullPointerException 을 출력
        System.out.println("문자 수 : " + result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("This is Java");
        printLength(null);
        System.out.println("프로그램 종료");
    }
}
