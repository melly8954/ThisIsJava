package ch11.sec02;

public class ExceptionalHandlingExample1 {
    public static void main(String[] args) {
        String[] array = {"100","1oo"};

        for( int i=0; i<=array.length; i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println("array["+i+"]: "+value);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초가됨 >> "+e.toString());      // i<=array.length , 등호때문에 런타임 예외
            }
            catch (NumberFormatException e){
                System.out.println("숫자로 변활 될수가 없음 >> "+e.toString());
            }
        }
    }
}
