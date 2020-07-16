import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toLowerCase().toCharArray();
        br.close();
        int[] counts = new int[26];

        for (int i = 0; i < word.length; ++i) {
            ++counts[word[i]-'a'];
        }
        int max = counts[0], index = 0, count = 0;
        for (int i = 1; i < 26; ++i) {
            if (max < counts[i]) {
                max = counts[i];
                index = i;
                count = 0;
            } else if (max == counts[i]) {
                ++count;
            }
        }
        if (count == 0)
            System.out.println((char)(index+'A'));
        else
            System.out.println("?");
    }
}
