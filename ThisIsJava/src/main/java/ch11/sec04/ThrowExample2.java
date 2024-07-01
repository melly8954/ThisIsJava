package ch11.sec04;

public class ThrowExample2 {
    // 나열해야 할 예외 클래스가 많을 경우에 "throws Exception" or "throws Throwable" 로 모든 예외를 떠넘길 수 잇음
    public static void main(String[] args) throws Exception{
        findClass();
    }
    public static void findClass() throws ClassNotFoundException{   // 떠넘길 예외 호출
        Class.forName("java.lang.String2");     // "java.lang.String" 일 경우 정상실행된다.
    }
}
