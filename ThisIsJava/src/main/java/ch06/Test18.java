package ch06;
class ShopService{
    private static ShopService shop=new ShopService();
    private ShopService(){
    }
    public static ShopService getInstance(){
        return shop;
    }
}
public class Test18 {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 ShopService 객체입니다.");
        }
        else{
            System.out.println("다른 ShopService 객체입니다.");
        }
    }
}
