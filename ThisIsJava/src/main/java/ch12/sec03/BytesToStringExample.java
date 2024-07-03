package ch12.sec03;

import java.util.Arrays;

// byte 배열을 문자열로 변환하는 경우 -> 네트워크 통신으로 얻는 byte 배열을 원래 문자열로 변환하는 경우
public class BytesToStringExample {
    public static void main(String[] args) {
        String data = "자바";
        
        // String -> byte 배열(기본 : UTF-8 인코딩)
        // 문자열을 byte 배열로 변환
        byte[] arr1 = data.getBytes();
        System.out.println("byte 배열 arr1 : "+ Arrays.toString(arr1));

        // byte 배열 -> String(기본: UTF-8 디코딩)
        // 네트워크 통신으로 얻는 byte 배열을 원래 문자열로 변환
        String str1 = new String(arr1);     // String str1 = new String(arr1,"UTF-8");
        System.out.println("문자열 Str1 : " + str1);
    }
}
