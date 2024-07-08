package ch12.sec06;

// Java Reflection ( 자바는 클래스와 인터페이스의 메타 정보를 Class 객체로 관리 , 이런 메타 정보를 읽고 수정하는 행위를 리플렉션(Reflection) 이라한다.)
public class GetClassExample {
    public static void main(String[] args) throws Exception {
        // how 1
        Class clazz = Car.class;

//        how 2
//        Class clazz = Class.forName("ch12.sec06.Car");
//
//        how 3
//        Car car = new Car();
//        Class clazz = car.getClass();

        System.out.println("패키지 : " + clazz.getPackage().getName());
        System.out.println("클래스 간단 이름 : " + clazz.getSimpleName());
        System.out.println("클래스 전체 이름 : " + clazz.getName());


    }

}
