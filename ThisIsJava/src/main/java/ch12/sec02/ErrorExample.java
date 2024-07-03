package ch12.sec02;

public class ErrorExample {
    public static void main(String[] args) {
        try{
            int value = Integer.parseInt("1oo");
        }
        catch (NumberFormatException e){
            System.err.print("[에러 내용] : ");     // 콘솔에 에러 내용 출력
            System.err.println(e.toString());       // System 클래스의 정적 멤버 err 사용

            System.out.print("[에러 내용] : ");     // try catch 예외 처리
            System.out.println(e.toString());
        }
    }
}
