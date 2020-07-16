import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int h = Integer.parseInt(tokenizer.nextToken());
        int[][][] box = new int[h][m][n];
        Queue<int[]> queue = new LinkedList<>();
        int zero = 0;
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < m; ++j) {
                tokenizer = new StringTokenizer(br.readLine());
                for (int k = 0; k < n; ++k) {
                    box[i][j][k] = Integer.parseInt(tokenizer.nextToken());
                    if (box[i][j][k] == 1) {
                        queue.add(new int[]{i, j, k});
                    } else if (box[i][j][k] == 0) {
                        ++zero;
                    }
                }
            }
        }
        int count = queue.size();
        int day = -1;
        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            if (pos[0] > 0 && box[pos[0]-1][pos[1]][pos[2]] == 0) {
                box[pos[0]-1][pos[1]][pos[2]] = 1;
                queue.add(new int[]{pos[0]-1, pos[1], pos[2]});
                --zero;
            }
            if (pos[0] < h-1 && box[pos[0]+1][pos[1]][pos[2]] == 0) {
                box[pos[0]+1][pos[1]][pos[2]] = 1;
                queue.add(new int[]{pos[0]+1, pos[1], pos[2]});
                --zero;
            }
            if (pos[1] > 0 && box[pos[0]][pos[1]-1][pos[2]] == 0) {
                box[pos[0]][pos[1]-1][pos[2]] = 1;
                queue.add(new int[]{pos[0], pos[1]-1, pos[2]});
                --zero;
            }
            if (pos[1] < m-1 && box[pos[0]][pos[1]+1][pos[2]] == 0) {
                box[pos[0]][pos[1]+1][pos[2]] = 1;
                queue.add(new int[]{pos[0], pos[1]+1, pos[2]});
                --zero;
            }
            if (pos[2] > 0 && box[pos[0]][pos[1]][pos[2]-1] == 0) {
                box[pos[0]][pos[1]][pos[2]-1] = 1;
                queue.add(new int[]{pos[0], pos[1], pos[2]-1});
                --zero;
            }
            if (pos[2] < n-1 && box[pos[0]][pos[1]][pos[2]+1] == 0) {
                box[pos[0]][pos[1]][pos[2]+1] = 1;
                queue.add(new int[]{pos[0], pos[1], pos[2]+1});
                --zero;
            }
            if (--count == 0) {
                ++day;
                count = queue.size();
            }
        }
        if (zero > 0) {
            bw.write("-1");
        } else {
            bw.write(String.valueOf(day));
        }
        bw.close();
        br.close();
    }
}
