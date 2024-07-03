package ch12.sec04;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        // Boxing
        Integer obj = 100;      // int 정수 100을 Integer 객체 obj로 Boxing(컴파일러에 의한 자동 박싱)
        System.out.println("value : " + obj.intValue());       // Integer 객체 내부의 int 값을 리턴

        // UnBoxing
        int value = obj;
        System.out.println("value : " + value);

        // 연산 시 UnBoxing
        int result = obj + 100;
        System.out.println("result : " + result);


//        Integer boxedInt = null;        // Integer 클래스는 객체라 null을 가질 수 있음 (주의할점)
//        int unBoxedInt = boxedInt;      // 하지만, 언박싱할 경우 null이 불가능하므로 NullPointerException 발생

    }
}
