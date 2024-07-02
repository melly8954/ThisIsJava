package ch12.sec01.exam01;

public class Member {
    public String id;

    public Member(String id){
        this.id=id;
    }

    @Override
    // 최상위 클래스 Object의 equals() 재정의 
    public boolean equals(Object obj){
        if(obj instanceof Member target){
            if(id.equals(target.id)){
                return true;
            }
        }
        return false;
    }
}
