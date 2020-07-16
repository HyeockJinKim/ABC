import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] lines = new char[3][];
        int[] nums = new int[3];
        lines[0]  = br.readLine().toCharArray();
        lines[1]  = br.readLine().toCharArray();
        lines[2]  = br.readLine().toCharArray();
        br.close();

        for (int i = 0; i < 3; ++i) {
            char prev = 'a';
            int count = 0;
            for (int j = 0; j < lines[i].length; ++j) {
                if (prev != lines[i][j]) {
                    nums[i] = nums[i] >= count ? nums[i] : count;
                    count = 1;
                    prev = lines[i][j];
                } else {
                    ++count;
                }
            }
            nums[i] = nums[i] >= count ? nums[i] : count;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 3; ++i) {
            bw.write(String.valueOf(nums[i]));
            bw.newLine();
        }
        bw.close();
    }
}
