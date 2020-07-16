import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        boolean[] isCheck = new boolean[101];
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            int t = Integer.parseInt(tokenizer.nextToken());
            if (!isCheck[t]) {
                isCheck[t] = true;
            } else {
                ++sum;
            }
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.close();
    }
}
