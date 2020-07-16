import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m, n;
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        boolean[] dp = new boolean[n+1];
        br.close();
        dp[0] = true;
        dp[1] = true;
        for (int i = 2; i <= n; ++i) {
            for (int j = i*i; j <= n; j += i) {
                dp[j] = true;
            }
        }
        int sum = 0, min = -1;
        for (int i = m; i <= n; ++i) {
            if (!dp[i]) {
                min = i;
                break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (min == -1) {
            bw.write("-1");
        } else {
            for (int i = min; i <= n; ++i) {
                if (!dp[i]) {
                    sum += i;
                }
            }
            bw.write(String.valueOf(sum));
            bw.newLine();
            bw.write(String.valueOf(min));
        }
        bw.close();
    }
}
