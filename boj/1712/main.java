import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int A, B, C;

        A = Integer.parseInt(tokenizer.nextToken());
        B = Integer.parseInt(tokenizer.nextToken());
        C = Integer.parseInt(tokenizer.nextToken());
        int profit = C-B;
        if (profit <= 0) {
            System.out.println("-1");
            return;
        }
        System.out.println(A/profit+1);
    }
}
