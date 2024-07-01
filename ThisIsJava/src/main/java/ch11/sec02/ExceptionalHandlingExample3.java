package ch11.sec02;

public class ExceptionalHandlingExample3 {
    public static void main(String[] args) {
        String[] array = {"100","1oo",null,"200"};

        for( int i=0; i<=array.length; i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println("array["+i+"]: "+value);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초가됨 >> "+e.toString());
            }
            
            // 두 개 이상의 예외를 하나의 catch 블록으로 동일하게 예외 처리 할 경우, " | " 사용
            catch (NullPointerException | NumberFormatException e){
                System.out.println("데이터에 문제가 있음 : " + e.getMessage());
            }
        }
    }
}
