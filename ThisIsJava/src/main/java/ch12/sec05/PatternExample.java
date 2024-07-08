package ch12.sec05;

import java.util.regex.Pattern;

// Pattern 클래스로 문자열을 검증하는 정규 표현식
public class PatternExample {
    public static void main(String[] args) {
        // 전화번호 정규표현식
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4567";

        boolean result = Pattern.matches(regExp,data);
        if(result){
            System.out.println("정규식과 일치합니다.");
        }
        else{
            System.out.println("정규식과 일치하지 않습니다.");
        }
        
        // 이메일 정규표현식
        regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        data = "angel@mycompany.com";
        result = Pattern.matches(regExp,data);
        if(result){
            System.out.println("정규식과 일치합니다.");
        }
        else{
            System.out.println("정규식과 일치하지 않습니다.");
        }

    }
}
