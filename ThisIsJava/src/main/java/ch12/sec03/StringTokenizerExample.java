package ch12.sec03;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String[] arr = data1.split("&|,");      // "& | , " 처럼 공백을 넣으면 data1에서는 공백을 포함하지 않기에 인식하지 못하여 잘못된 출력이 나온다.
        for(String token : arr){
            System.out.println(token);
        }
        System.out.println();
        
        String data2 = "홍길동/이수홍/박연수";
        StringTokenizer st= new StringTokenizer(data2,"/");

        while(st.hasMoreTokens()){      // StringTokenizer 클래스 객체에서 다음에 읽어 들일 token이 있으면 true, 없으면 false를 리턴
            String token = st.nextToken();      // 문자열을 하나씩 가져온다.
            System.out.println(token);
        }
    }
}
