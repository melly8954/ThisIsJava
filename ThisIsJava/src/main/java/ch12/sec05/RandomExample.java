package ch12.sec05;

import java.util.Arrays;
import java.util.Random;

// 1~45의 숫자 범위를 가지는 로또 6개
public class RandomExample {
    public static void main(String[] args) {
        // 선택 번호
        int[] selectNumber = new int[6];
        Random random = new Random(5);      // Random 클래스의 난수 seed 지정
        System.out.println("선택 번호 : ");

        for(int i = 0; i<6; i++){
            selectNumber[i] = random.nextInt(45) + 1;       // Random 클래스의 메서드 nextInt(int n) >> int 타입의 난수를 리턴 ( 0<= ~ <n )
            System.out.println(selectNumber[i] + " ");
        }
        System.out.println();

        // 당첨 번호
        int[] winningNumber = new int[6];
        random = new Random(3);         // 당첨번호 시드는 3
        System.out.println("당첨 번호 : ");

        for(int i = 0; i<6; i++){
            winningNumber[i] = random.nextInt(45) + 1;
            System.out.println(winningNumber[i] + " ");
        }
        System.out.println();

        // 당첨 여부
        Arrays.sort(selectNumber);      // 배열 항목을 정렬
        Arrays.sort(winningNumber);
        boolean result = Arrays.equals(selectNumber,winningNumber);     // 배열 항목 비교
        if(result){
            System.out.println("1등에 당첨되셨습니다.");
        }
        else{
            System.out.println("1등에 당첨되지 않으셨습니다.");
        }
    }
}
