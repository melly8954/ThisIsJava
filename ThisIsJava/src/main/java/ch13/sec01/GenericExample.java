package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
//        Box<String> box2 = new Box<String>();   >> 생성자 호출시 생성자에는 타입을 명시하지않고 <> 만 표기
        box1.content = "안녕하세요";
        String str = box1.content;
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.content = 300;
        int value = box2.content;
        System.out.println(value);
    }
}
