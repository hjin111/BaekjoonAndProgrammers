import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tt = 0; tt < t; tt++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n + 1];

            String[] line = br.readLine().split(" ");
            for (int i = 1; i <= n; i++) {
                arr[i] = Integer.parseInt(line[i - 1]);
            }

            visited = new boolean[n + 1];
            int count = 0;
            for(int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    count++;
                    dfs(i, arr);
                }
            }
            System.out.println(count);
        }

    }

    static void dfs(int start, int[] arr) {
        int target = arr[start];
        if (!visited[target]) {
            visited[target] = true;
            dfs(target, arr);
        }
    }
}
