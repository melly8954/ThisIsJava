package ch12.sec01.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();    // HashSet 컬렉션 완성

        Student s1 = new Student(1,"홍길동");
        hashSet.add(s1);        // HashSet에 객체 저장
        System.out.println("저장된 객체 수 : "+hashSet.size());   // HashSet 크기 출력

        Student s2 = new Student(1,"홍길동");
        hashSet.add(s2);        // HashSet에 객체 저장
        System.out.println("저장된 객체 수 : "+hashSet.size());   // HashSet 크기 출력 , 동등한 객체는 저장되지 않는다.

        Student s3 = new Student(2,"김자바");
        hashSet.add(s3);        // HashSet에 객체 저장
        System.out.println("저장된 객체 수 : "+hashSet.size());

        Student s4 = new Student(3,"홍길동");
        hashSet.add(s4);        // HashSet에 객체 저장
        System.out.println("저장된 객체 수 : "+hashSet.size());   // no가 3이며, 동등한 객체가 아니라 저장되어 크기가 증가된다.

    }
}
