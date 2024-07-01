package ch11.sec02;

public class ExceptionalHandlingExample2 {
    public static void main(String[] args) {
        String[] array = {"100","1oo"};

        for( int i=0; i<=array.length; i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println("array["+i+"]: "+value);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초가됨 >> "+e.toString());
            }
            catch (Exception e){        // 모든 예외 클래스의 최상위 클래스는 Exception 클래스
                System.out.println("실행에 문제가 있습니다.");        // 상위 예외 클래스는 아래쪽에 작성, 위에 있을 경우 오류 ( ~ has already been caught )
            }
        }
    }
}
