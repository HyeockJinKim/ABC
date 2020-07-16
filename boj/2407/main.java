import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n, m;
        n = Integer.parseInt(tokenizer.nextToken());
        m = Integer.parseInt(tokenizer.nextToken());
        br.close();
        m = m <= n-m ? m : n-m;
        BigInteger[] c = new BigInteger[m+1];
        c[0] = BigInteger.valueOf(1);
        c[1] = BigInteger.valueOf(n);
        for (int i = 2; i <= m; ++i) {
            c[i] = c[i-1].multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(c[m]));
        bw.close();
    }
}
