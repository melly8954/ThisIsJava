package ch12.sec05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        // 현재 시간에서 날짜와 시간 조작
        LocalDateTime now = LocalDateTime.now();
        
        // 문자열 패턴
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println("현재 시간 : " + now.format(dtf));

        // 더하기는 plus , 빼기는 minus
        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 더한 후 년도 : " + result1.format(dtf));

        LocalDateTime result2 = now.plusMonths(3);
        System.out.println("3개월 더한 후 월 : " + result2.format(dtf));

        LocalDateTime result3 = now.plusDays(6);
        System.out.println("6일 더한 후 일 : " + result3.format(dtf));

        LocalDateTime result4 = now.plusYears(1);
        result4 = result4.plusMonths(3);
        result4 = result4.plusDays(6);
        System.out.println("1년 3개월 6일 더한 후 : " + result4.format(dtf));
        
        
        //날짜와 시간 비교
    }
}
