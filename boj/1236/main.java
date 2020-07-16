import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        char[][] line = new char[n][];
        for (int i = 0; i < n; ++i) {
            line[i] = br.readLine().toCharArray();
        }
        br.close();

        int x=m, y=n;
        boolean[] isCheckY = new boolean[n];
        boolean[] isCheckX = new boolean[m];
        for (int i = 0; i < n; ++i) {

            for (int j = 0; j < m; ++j) {
                if (line[i][j] == 'X') {
                    if (!isCheckX[j]) {
                        --x;
                        isCheckX[j] = true;
                    }
                    if (!isCheckY[i]) {
                        --y;
                        isCheckY[i] = true;
                    }
                }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d", x >= y ? x : y));
        bw.newLine();
        bw.close();
    }
}
