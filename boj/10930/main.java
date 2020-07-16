import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(s.getBytes());
        for (byte b : md.digest()) {
            bw.write(String.format("%02x", b));
        }
        br.close();
        bw.close();
    }
}