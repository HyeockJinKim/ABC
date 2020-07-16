import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int m, n;
        m = Integer.parseInt(tokenizer.nextToken());
        n = Integer.parseInt(tokenizer.nextToken());
        br.close();
        boolean[] isCow = new boolean[n+1];

        isCow[1] = true;
        isCow[0] = true;
        for (int i = 2; i <= n; ++i)
            if (!isCow[i])
                for (int j = i+i; j <= n; j += i)
                    isCow[j] = true;
        StringBuilder sb = new StringBuilder();
        for (int i = m; i <= n; ++i) {
            if (!isCow[i])
                sb.append(i).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.close();
    }
}
