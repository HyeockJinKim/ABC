import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int m, n, num = 0;
        m = Integer.parseInt(tokenizer.nextToken());
        n = Integer.parseInt(tokenizer.nextToken());
        int[][] tomato = new int[n][m];
        ArrayList<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            tokenizer = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; ++j) {
                tomato[i][j] = Integer.parseInt(tokenizer.nextToken());
                if (tomato[i][j] == 1) {
                    list.add(new int[]{i, j});
                } else if (tomato[i][j] == 0) {
                    ++num;
                }
            }
        }
        br.close();
        int count = -1;
        while (!list.isEmpty()) {
            ArrayList<int[]> temp = new ArrayList<>();
            int len = list.size();
            for (int i = 0; i < len; ++i) {
                int[] t = list.get(i);
                if (t[0] > 0 && tomato[t[0]-1][t[1]] == 0) {
                    tomato[t[0]-1][t[1]] = 1;
                    temp.add(new int[]{t[0]-1, t[1]});
                    --num;
                }
                if (t[1] > 0 && tomato[t[0]][t[1]-1] == 0) {
                    tomato[t[0]][t[1]-1] = 1;
                    temp.add(new int[]{t[0], t[1]-1});
                    --num;
                }
                if (t[0] < n-1 && tomato[t[0]+1][t[1]] == 0) {
                    tomato[t[0]+1][t[1]] = 1;
                    temp.add(new int[]{t[0]+1, t[1]});
                    --num;
                }
                if (t[1] < m-1 && tomato[t[0]][t[1]+1] == 0) {
                    tomato[t[0]][t[1]+1] = 1;
                    temp.add(new int[]{t[0], t[1]+1});
                    --num;
                }
            }
            list = temp;
            ++count;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (num == 0)
            bw.write(String.valueOf(count));
        else
            bw.write("-1");
        bw.close();
    }
}
