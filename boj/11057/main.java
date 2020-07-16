import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        n = Integer.parseInt(br.readLine());
        br.close();
        long[] dp = new long[10];
        for (int i = 0; i < 10; ++i) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; ++i) {
            long[] t = new long[10];
            t[0] = dp[0];
            for (int j = 1; j < 10; ++j) {
                t[j] = (t[j-1] + dp[j]) % 10007;
            }
            dp = t;
        }
        long result = 0;
        for (int i = 0; i < 10; ++i) {
            result = (result + dp[i]) % 10007;
        }
        System.out.println(result);
    }
}
