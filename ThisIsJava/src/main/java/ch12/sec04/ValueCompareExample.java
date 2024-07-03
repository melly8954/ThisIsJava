package ch12.sec04;

public class ValueCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println(obj1 == obj2);       // " == " 연산자는 객체의 레퍼런스를 비교한다, 따라서 false 리턴 >> 서로 다른 객체
        System.out.println(obj1.equals(obj2));
        System.out.println();
        
        obj2=obj1;
        System.out.println(obj1 == obj2);
        System.out.println();

        // 이때 byte,short,int 타입은 값의 범위가 -128~127 일 경우 " == " 연산자로 레퍼런스 비교 가능
        Integer obj3 = 100;
        Integer obj4 = 100;
        System.out.println(obj3 == obj4);       // int 범위 -128 ~ 127 >> true
        System.out.println();

        System.out.println(obj3.equals(obj4));

    }
}
