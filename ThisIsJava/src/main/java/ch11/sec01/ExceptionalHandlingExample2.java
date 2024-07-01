package ch11.sec01;

public class ExceptionalHandlingExample2 {
    // ExceptionalHandlingExample1 을 try catch 구문으로 수정
    public static void printLength(String data){
        try{
            int result = data.length();
            System.out.println("문자 수 : " + result);
        }
        catch ( NullPointerException e){
            // 예외 정보를 출력하는 3가지 형태

            // System.out.println(e.getMessage());
            // 예외가 발생한 이유만을 리턴

            // System.out.println(e.toString());
            // 예외의 종류와 발생한 이유를 함께 리턴

            // e.printStackTrace();
            // 예외의 종류 + 발생한 이유 + 발생한 위치 모두 출력

            System.out.println("다음과 같은 오류 발생! "+e);
        }


    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("This is Java");
        printLength(null);
        System.out.println("프로그램 종료");
    }
}
