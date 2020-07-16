import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n][3];
        int[][] dp2 = new int[n][3];
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            dp[i][0] = Integer.parseInt(tokenizer.nextToken());
            dp[i][1] = Integer.parseInt(tokenizer.nextToken());
            dp[i][2] = Integer.parseInt(tokenizer.nextToken());
            dp2[i][0] = dp[i][0];
            dp2[i][1] = dp[i][1];
            dp2[i][2] = dp[i][2];
        }
        br.close();
        for (int i = 1; i < n; ++i) {
            int t;
            dp[i][0] += dp[i-1][0] >= dp[i-1][1] ? dp[i-1][0] : dp[i-1][1];
            t = dp[i-1][0] >= dp[i-1][1] ? dp[i-1][0] : dp[i-1][1];
            dp[i][1] += t >= dp[i-1][2] ? t : dp[i-1][2];
            dp[i][2] += dp[i-1][1] >= dp[i-1][2] ? dp[i-1][1] : dp[i-1][2];

            dp2[i][0] += dp2[i-1][0] <= dp2[i-1][1] ? dp2[i-1][0] : dp2[i-1][1];
            t = dp2[i-1][0] <= dp2[i-1][1] ? dp2[i-1][0] : dp2[i-1][1];
            dp2[i][1] += t <= dp2[i-1][2] ? t : dp2[i-1][2];
            dp2[i][2] += dp2[i-1][1] <= dp2[i-1][2] ? dp2[i-1][1] : dp2[i-1][2];
        }
        int minV = dp2[n-1][0], maxV = dp[n-1][0];
        minV = minV <= dp2[n-1][1] ? minV : dp2[n-1][1];
        minV = minV <= dp2[n-1][2] ? minV : dp2[n-1][2];

        maxV = maxV >= dp[n-1][1] ? maxV : dp[n-1][1];
        maxV = maxV >= dp[n-1][2] ? maxV : dp[n-1][2];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(String.format("%d %d", maxV, minV));
        bw.close();
    }
}
