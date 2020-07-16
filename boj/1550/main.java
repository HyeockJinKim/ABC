import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] hex = br.readLine().toCharArray();
        br.close();
        int sum = 0, h = 1;
        for (int i = hex.length-1; i >= 0; --i) {
            if (hex[i] >= 'A') {
                sum += (hex[i]-'A'+10) * h;
            } else {
                sum += (hex[i] -'0') * h;
            }
            h *= 16;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
