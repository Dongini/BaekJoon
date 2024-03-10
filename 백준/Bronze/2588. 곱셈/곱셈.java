import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        String b = br.readLine();
        
        char[] charB = b.toCharArray();
        
        System.out.println(A * (charB[2] - '0'));
        System.out.println(A * (charB[1] - '0'));
        System.out.println(A * (charB[0] - '0'));   
        System.out.print(A * Integer.parseInt(b));
    }
}