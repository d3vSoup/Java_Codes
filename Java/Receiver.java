package Java;
import java.io.*;

public class Receiver {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        String msg = br.readLine();
        System.out.println("Message received: " + msg);
    }
}
