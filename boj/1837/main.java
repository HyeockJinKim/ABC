import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    private static int n, m;
    private static int max = 0;
    private static int[][] map;
    private static boolean[][] v;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        BigInteger p = new BigInteger(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        boolean[] eratos = new boolean[k];
        for (int i = 2; i < k; ++i) {
            if (!eratos[i]) {
                for (int j = 2 * i; j < k; j += i) {
                    eratos[j] = true;
                }
                if (p.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                    bw.write("BAD ");
                    bw.write(String.valueOf(i));
                    bw.close();
                    br.close();

                    return;
                }
            }
        }
        bw.write("GOOD");
        bw.close();
        br.close();
    }
}
