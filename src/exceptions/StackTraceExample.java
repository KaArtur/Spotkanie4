package exceptions;

public class StackTraceExample {
    public static void main(String[] args) {
        StackTraceExample ste = new StackTraceExample();
        ste.method1();
    }
    public void method1(){
        method2();
    }
    public void method2(){
        throw new RuntimeException("Bum");
    }
}
