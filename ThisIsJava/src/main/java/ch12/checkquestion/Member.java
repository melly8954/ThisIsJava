package ch12.checkquestion;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("%s : %s",this.id,this.name);
    }
}
