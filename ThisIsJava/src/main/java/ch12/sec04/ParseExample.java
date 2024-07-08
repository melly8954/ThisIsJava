package ch12.sec04;

public class ParseExample {
    // 2-10
    public static void main(String[] args) {
        // 문자열 덧셈
        String number1 = new String("1234");
        String number2 = new String("4321");
        System.out.println(number1 + number2);  // 12344321

        // 5555가 나오게 하려면?
        String number3 = number1;
        String number4 = number2;
        int a = Integer.parseInt(number3);
        int b= Integer.parseInt(number4);
        System.out.println(a+b);

//        Byte.parseByte();
//        Short.parseShort();
//        Integer.parseInt();
//        Long.parseLong();
//        Float.parseFloat();
//        Double.parseDouble();

//        char >> String charAt();
        try{
            String mix1 = "a100";
            String mix2 = "b100";

            String result1 = mix1 + mix2;
            System.out.println(result1);

            int mix3 = Integer.parseInt(mix1);
            int mix4 = Integer.parseInt(mix2);

            int result2 = mix3 + mix4;
            System.out.println(result2);
        }
        catch (Exception ex){
            System.out.println(ex.toString() + " parse 형 변환은 문자열에 숫자만 입력되어야 한다.");
        }
    }

}
