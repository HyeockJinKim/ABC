import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 1;
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int a, b;
            a = Integer.parseInt(tokenizer.nextToken());
            b = Integer.parseInt(tokenizer.nextToken());
            if (result == a) {
                result = b;
            } else if (result == b) {
                result = a;
            }
        }
        System.out.println(result);
    }
}
