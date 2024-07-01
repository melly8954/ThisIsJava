package ch06;
class Member{
    private String name;
    private String id;
    private String password;
    private int age;

    public Member(){

    }
    public Member(String name,String id){
        this.name=name;
        this.id=id;
    }

    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public void SetName(String name){
        this.name=name;
    }
    public boolean login(String id,String password){
        if(id.equals("hong") && password.equals("12345")){
            return true;
        }
        else{
            return false;
        }
    }
    public void logout(String id){
        System.out.println(id+"님이 로그아웃 되었습니다.");
    }

}
public class Test15 {
    public static void main(String[] args) {
        Member user1 = new Member("홍길동","hong");
        System.out.println(user1.getName());
        System.out.println(user1.getId());

        Member user2= new Member();
        boolean result=user2.login("hong","12345");
        if(result){
            System.out.println("로그인 되었습니다.");
            user2.logout("hong");
        }
        else{
            System.out.println("id 또는 password 가 올바르지 않습니다.");
        }

    }

}
