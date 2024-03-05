import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedWriter buffer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        buffer.write("Hello World!");
        buffer.flush(); // 버퍼를 비운다
        buffer.close(); // I/O 스트림 닫음
    }
}
