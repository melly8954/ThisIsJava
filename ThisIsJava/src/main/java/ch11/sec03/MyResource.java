package ch11.sec03;

// 리스소(Resource)란 데이터를 제공하는 객체
// 리소스는 사용되기 위해 항상 open 해야하며, 사용 이후 항상 close 해야한다.
// ex. 파일 open / close
// try-with-resources 블록 사용 >> 예외 발생 여부와 상관없이 리소스를 자동으로 닫아준다.
// 위 블록은 조건이 존재(java.lang.AutoCloseable 인터페이스를 구현해서 Override 해야함)

public class MyResource implements AutoCloseable{   // try-with-resources 블록을 사용하기 위해 인터페이스 구현
    private String name;

    public MyResource(String name){
        this.name=name;
        System.out.println("[MyResource(" + name + ") 열기]");
    }

    public String read1() {
        System.out.println("[MyResource(" + name + ") 읽기]");
        return "100";
    }

    public String read2() {
        System.out.println("[MyResource(" + name + ") 읽기]");
        return "abc";
    }
    
    @Override
    public void close() throws Exception{       // AutoCloseable 인터페이스를 구현한 Override
        System.out.println("[MyResource(" + name + ") 닫기]");
    }
}
