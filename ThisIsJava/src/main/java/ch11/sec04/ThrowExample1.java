package ch11.sec04;

public class ThrowExample1 {
    public static void main(String[] args) {
        try{
            findClass();
        }
        catch (ClassNotFoundException e){       // 호출한 곳에서 예외처리
            System.out.println("예외 처리 : "+e.toString());
        }
    }
    public static void findClass() throws ClassNotFoundException{   // 떠넘길 예외 호출
        Class.forName("java.lang.String2");     // "java.lang.String" 일 경우 정상실행된다.
    }
}
