import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int[] s = new int[8];
        for (int i = 0; i < 8; ++i) {
            s[i] = Integer.parseInt(tokenizer.nextToken());
        }
        br.close();
        boolean isCheck = false;
        if (s[0] == 1) {
            isCheck = true;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i < 8; ++i) {
            if (isCheck && s[i] < s[i-1]) {
                bw.write("mixed");
                bw.close();
                return ;
            } else if (!isCheck && s[i] > s[i-1]) {
                bw.write("mixed");
                bw.close();
                return ;
            }
        }
        if (isCheck) {
            bw.write("ascending");
        } else {
            bw.write("descending");
        }
        bw.close();
    }
}
