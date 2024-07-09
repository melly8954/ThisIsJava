package ch12.sec05;

import static java.lang.Math.abs;

// Math 클래스는 모두 정적 메서드를 가지고 있음
public class MathExample {
    public static void main(String[] args) {
        double v1 = Math.ceil(5.5);     // 올림
        double v2 = Math.floor(5.3);    // 내림
        System.out.println("v1= " + v1);
        System.out.println("v2= " + v2);

        long v3 = Math.min(3,5);        // 큰 값
        long v4 = Math.max(3,5);        // 작은 값
        System.out.println("v3= " + v3);
        System.out.println("v4= " + v4);

        double v5 = Math.round(6.7);    // 반올림 >> return 타입은 long 주의!
        double v6 = Math.round(6.4);
        System.out.println("v5= " + v5);        // double 로 형변환
        System.out.println("v6= " + v6);

        double v7 = abs(-3.14);        // 절대값
        System.out.println("v7= " + v7);

        double v8 = Math.floor(abs(-3.14));     // math.abs 호출 이후 내림
        System.out.println("v8= " + v8);


        System.out.println((int)Math.pow(5, 2)); // 25 , 5^2
        System.out.println((int)Math.sqrt(25));  // 5 , 제곱근25

    }
}
