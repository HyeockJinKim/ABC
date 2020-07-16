import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] rgb = new int[n][3];
        for (int i = 0; i < n; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            rgb[i][0] = Integer.parseInt(tokenizer.nextToken());
            rgb[i][1] = Integer.parseInt(tokenizer.nextToken());
            rgb[i][2] = Integer.parseInt(tokenizer.nextToken());
        }
        br.close();

        for (int i = 1; i < n; ++i) {
            rgb[i][0] += rgb[i-1][1] < rgb[i-1][2] ? rgb[i-1][1] : rgb[i-1][2];
            rgb[i][1] += rgb[i-1][0] < rgb[i-1][2] ? rgb[i-1][0] : rgb[i-1][2];
            rgb[i][2] += rgb[i-1][0] < rgb[i-1][1] ? rgb[i-1][0] : rgb[i-1][1];
        }
        rgb[n-1][0] = rgb[n-1][0] < rgb[n-1][1] ? rgb[n-1][0] : rgb[n-1][1];
        rgb[n-1][0] = rgb[n-1][0] < rgb[n-1][2] ? rgb[n-1][0] : rgb[n-1][2];

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.format("%d", rgb[n-1][0]));
        bw.close();
    }
}
