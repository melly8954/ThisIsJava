package ch12.sec03;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                .insert(0,"ABC")
                .delete(3,4)        // 마지막 인덱스 포함x >> 6,8이면 6~7 삭제
                
                .toString();        // toString() 을 제외한 다른 메서드는 StringBuilder 를 다시 리턴하기에 연이어서 다른 메서드를 호출하는 메서드 체이닝 패턴 사용
                                    // toString() 은 String 을 리턴
        System.out.println(data);


        StringBuilder exData = new StringBuilder("hello");
        exData.append(" World!");
        System.out.println(exData);
        exData.delete(11,12);
        System.out.println(exData);

    }
}
