import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    private static class Edge {
        int src;
        int dst;
        int weight;

        Edge(int src, int dst, int weight) {
            this.src = src;
            this.dst = dst;
            this.weight = weight;
        }

        int getSrc() {
            return src;
        }

        int getDst() {
            return dst;
        }

        int getWeight() {
            return weight;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] g = new int[n+1][n+1];

        for (int i = 0; i < m; ++i) {
            String[] line = br.readLine().split(" ");
            int a, b, c;
            a = Integer.parseInt(line[0]);
            b = Integer.parseInt(line[1]);
            c = Integer.parseInt(line[2]);
            g[a][b] = c;
        }
        Queue<Edge> minPriorityQueue = new PriorityQueue<>(Comparator.comparingInt(Edge::getWeight));

        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (g[i][j] > 0) {
                    minPriorityQueue.add(new Edge(i, j, g[i][j]));
                }
            }
        }
        int[] visitNum = new int[n+1];
        int visits = 0;
        for (int i = 0; i < n; ++i) {
            visitNum[i] = i;
            visits += i;
        }

        int sum = 0;
        Edge min;
        while (visits  > 0) {
            min = minPriorityQueue.poll();
            if (visitNum[min.getSrc()] == visitNum[min.getDst()]) {
                continue;
            }
            sum += min.getWeight();
            int big,small;
            if (visitNum[min.getSrc()] > visitNum[min.getDst()]) {
                big = visitNum[min.getSrc()];
                small = visitNum[min.getDst()];
            } else {
                big = visitNum[min.getDst()];
                small = visitNum[min.getSrc()];
            }
            visits = 0;
            for (int i = 1; i <= n; ++i) {
                if (visitNum[i] == big) {
                    visitNum[i] = small;
                }
                visits += visitNum[i];
            }


        }
        System.out.println(sum);

    }
}
