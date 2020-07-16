import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] isS = new boolean[1003002];
        br.close();
        isS[0] = true;
        isS[1] = true;
        for (int i = 2; i < 1003002; ++i) {
            if (!isS[i]) {
                for (int j = i+i; j < 1003002; j += i) {
                    isS[j] = true;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = n; i < 1003002; ++i) {
            if (!isS[i]) {
                char[] t = String.valueOf(i).toCharArray();
                boolean isCheck = true;
                for (int j = 0; j < t.length/2; ++j) {
                    if (t[j] != t[t.length-1-j])
                        isCheck = false;
                }
                if (isCheck) {
                    bw.write(String.valueOf(i));
                    bw.close();
                    return ;
                }

            }
        }
    }
}
