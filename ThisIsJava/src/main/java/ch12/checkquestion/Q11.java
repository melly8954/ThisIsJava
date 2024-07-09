package ch12.checkquestion;

import java.util.StringTokenizer;

public class Q11 {
    public static void main(String[] args) {
        String x ="아이디,이름,패스워드";

        StringTokenizer stringTokenizer = new StringTokenizer(x,",");

        while( stringTokenizer.hasMoreTokens() ){
            String token = stringTokenizer.nextToken();
            System.out.println(token);
        }
    }
}
