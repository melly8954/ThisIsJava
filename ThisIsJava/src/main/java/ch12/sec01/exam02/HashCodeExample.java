package ch12.sec01.exam02;

public class HashCodeExample {
    public static void main(String[] args) {
        Student student1 = new Student(1,"홍길동");
        Student student2 = new Student(2,"홍길동");
        Student student3 = new Student(2,"김자바");    // student1~3 은 레퍼런스일뿐 객체는 1과2는 같고 3이 다름 ( 디버깅을 통한 hashCode 확인 )

        if(student1.hashCode() == student2.hashCode() ){
            if(student1.equals(student2)){
                System.out.println("동등한 객체입니다.");
            }
            else{
                System.out.println("데이터가 다르므로 동등한 객체가 아닙니다.");
            }
        }
        else{
            System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
        }


        if(student2.hashCode() == student3.hashCode() ){
            if(student2.equals(student3)){
                System.out.println("동등한 객체입니다.");
            }
            else{
                System.out.println("데이터가 다르므로 동등한 객체가 아닙니다.");
            }
        }
        else{
            System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
        }
    }


}
