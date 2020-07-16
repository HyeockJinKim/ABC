import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int a, b;
            a = Integer.parseInt(tokenizer.nextToken());
            b = Integer.parseInt(tokenizer.nextToken());
            if (a == 0 && b == 0) {
                br.close();
                bw.close();
                return ;
            }

            if (b % a == 0)
                bw.write("factor");
            else if (a % b == 0)
                bw.write("multiple");
            else
                bw.write("neither");
            bw.newLine();
        }

    }
}
