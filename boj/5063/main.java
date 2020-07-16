import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int r, e, c;
            r = Integer.parseInt(tokenizer.nextToken());
            e = Integer.parseInt(tokenizer.nextToken());
            c = Integer.parseInt(tokenizer.nextToken());
            int ec = e - c;
            if (ec > r) {
                bw.write("advertise");
            } else if (ec == r) {
                bw.write("does not matter");
            } else {
                bw.write("do not advertise");
            }
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
