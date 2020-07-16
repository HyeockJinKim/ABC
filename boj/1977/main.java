import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m, n;
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        br.close();
        double sqrM, sqrN;
        sqrM = Math.sqrt(m);
        sqrN = Math.sqrt(n);
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = (int) sqrM; i <= sqrN; ++i) {
            if (i < sqrM) continue;
            int t = i*i;
            min = min < t ? min : t;
            sum += t;
        }
        if (min != Integer.MAX_VALUE) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println("-1");
        }
    }
}
