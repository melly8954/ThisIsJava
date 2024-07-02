package ch12.sec01.exam02;

public class Student {
    private int no;     // 학생 번호
    private String name;    // 학생 이름

    public Student(int no, String name){
        this.no = no;
        this.name = name;
    }

    public int getNo(){
        return no;
    }

    public String getName(){
        return name;
    }

    @Override
    // 최상위 클래스 Object의 hashCode() 재정의
    public int hashCode(){
        int hashCode = no + name.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student target){
            if(no == target.getNo() && name.equals(target.getName())){
                return true;
            }
        }
        return false;
    }
}
