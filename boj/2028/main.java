import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        boolean[] dp = new boolean[1001];
        int div = 10;
        for (int i = 1; i < 1000; ++i) {
            if (i == 10) {
                div = 100;
            } else if (i == 100) {
                div = 1000;
            }
            if (i*i%div == i)
                dp[i] = true;
        }
        for (int i = 0; i < t; ++i) {
            int n = Integer.parseInt(br.readLine());
            if (dp[n])
                bw.write("YES");
            else
                bw.write("NO");
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
