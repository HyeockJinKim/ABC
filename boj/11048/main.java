import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int[][] map;
    private static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        map = new int[n][m];
        dp = new int[n][m];
        for (int i = 0; i < n; ++i) {
            tokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; ++j) {
                map[i][j] = Integer.parseInt(tokenizer.nextToken());
                dp[i][j] = -1;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(dfs(n-1, m-1)));
        bw.close();
        br.close();
    }

    private static int dfs(int i, int j) {
        if (dp[i][j] != -1)
            return dp[i][j];

        int a = 0, b = 0;
        if (i != 0)
            a = dfs(i-1, j);

        if (j != 0)
            b = dfs(i, j-1);
        dp[i][j] = a > b ? a + map[i][j] : b + map[i][j];
        return dp[i][j];
    }
}
