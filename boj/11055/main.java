import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; ++i) {
            nums[i] = Integer.parseInt(tokenizer.nextToken());
        }
        br.close();
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        int maxValue = dp[0][0];
        for (int i = 1; i < n; ++i) {
            int max = 0;
            for (int j = 0; j < i; ++j) {
                if (dp[j][1] < nums[i]) {
                    max = max >= dp[j][0] ? max : dp[j][0];
                }
            }
            dp[i][0] = max+nums[i];
            maxValue = maxValue >= dp[i][0] ? maxValue : dp[i][0];
            dp[i][1] = nums[i];
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(maxValue));
        bw.close();
    }
}
