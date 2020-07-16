import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        br.close();
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int[] range = new int[b+1];
        int index = 1;
        for (int i = 1; i <= b;) {
            for (int j = 0; j < index; ++j) {
                if (i < range.length)
                    range[i++] = index;
            }
            ++index;
        }
        int result = 0;
        for (int i = a; i <= b; ++i) {
            result += range[i];
        }
        System.out.println(result);
    }
}
