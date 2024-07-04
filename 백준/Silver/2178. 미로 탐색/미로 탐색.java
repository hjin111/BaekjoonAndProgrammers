import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);

        int[][] arr = new int[n][m];
        int[][] dist = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.charAt(j) - '0';
                dist[i][j] = -1; 
            }
        }
        System.out.println(bfs(arr, dist, n, m));
    }

    public static int bfs(int[][] arr, int[][] dist, int n, int m) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        dist[0][0] = 1; // 시이작
        while (!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && arr[nx][ny] == 1 && dist[nx][ny] == -1) {
                    q.add(new int[]{nx, ny});
                    dist[nx][ny] = dist[x][y] + 1; 
                }
            }
        }

        return dist[n - 1][m - 1];
    }
}
