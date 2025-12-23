package Java;
import java.io.*;

public class Sender {
    public static void main(String[] args) throws Exception {

        ProcessBuilder pb =
            new ProcessBuilder("java", "-cp", ".", "Java.Receiver");
        Process p = pb.start();

        PrintWriter pw =
            new PrintWriter(new OutputStreamWriter(p.getOutputStream()), true);
        pw.println("Hello from Sender");
        pw.close();

        BufferedReader br =
            new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
