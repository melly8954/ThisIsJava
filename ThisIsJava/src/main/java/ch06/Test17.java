package ch06;
class RePrinter{
    public static void println(int a){
        System.out.println(a);
    }
    public static void println(boolean b){
        System.out.println(b);
    }
    public static void println(double c){
        System.out.println(c);
    }
    public static void println(String d){
        System.out.println(d);
    }
}
public class Test17 {
    public static void main(String[] args) {
        RePrinter.println(10);
        RePrinter.println(true);
        RePrinter.println(5.7);
        RePrinter.println("홍길동");
    }
}
