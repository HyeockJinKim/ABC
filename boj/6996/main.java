import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int[] alpha = new int[52];
            String a, b;
            a = tokenizer.nextToken();
            b = tokenizer.nextToken();
            char[] t = a.toCharArray();
            for (int j = 0; j < t.length; ++j) {
                if (t[j] >= 'a')
                    ++alpha[t[j]-'a'+26];
                else
                    ++alpha[t[j]-'A'];
            }
            t = b.toCharArray();
            for (int j = 0; j < t.length; ++j) {
                if (t[j] >= 'a')
                    --alpha[t[j]-'a'+26];
                else
                    --alpha[t[j]-'A'];
            }
            boolean isCheck = true;
            for (int j = 0; j < 52; ++j) {
                if (alpha[j] != 0)
                    isCheck = false;
            }
            bw.write(a);
            bw.write(" & ");
            bw.write(b);
            if (isCheck) {
                bw.write(" are anagrams.");
            } else {
                bw.write(" are NOT anagrams.");
            }
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
