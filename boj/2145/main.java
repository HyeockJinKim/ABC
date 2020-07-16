import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n != 0) {

            while (n > 9) {
                int sum = 0;
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
                n = sum;
            }
            bw.write(String.valueOf(n));
            bw.newLine();
            n = Integer.parseInt(br.readLine());
        }
        br.close();
        bw.close();
    }
}
