package ch11.sec03;

// 리소스 자동 닫기
public class TryWithResourceExample {
    public static void main(String[] args) {
        try(MyResource res = new MyResource("A")){      // TryWithResource 구문
            String data = res.read1();
            int value = Integer.parseInt(data);
        }
        catch (Exception e){
            System.out.println("예외 처리: "+e.getMessage());
        }
        System.out.println();

        
        try(MyResource res = new MyResource("A")){
            String data = res.read2();
            int value = Integer.parseInt(data);
        }
        catch (Exception e){
            System.out.println("예외 처리: "+e.getMessage());
        }
        System.out.println();


        MyResource res1 = new MyResource("A");
        MyResource res2 = new MyResource("B");
        try(res1; res2){        // 다수의 리소스 사용시 ';'로 구분
            String data1 = res2.read1();
            String data2 = res2.read1();
        }
        catch (Exception e){
            System.out.println("에외 처리 : " + e.getMessage());
        }

    }
}
