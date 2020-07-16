import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        int i = 6, index = 1;
        --n;
        while (n > 0) {
            n -= i;
            i += 6;
            ++index;
        }
        System.out.println(index);
    }
}
