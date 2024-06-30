import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static List<List<Integer>> list;
    static boolean[] visited;
    static int[] depth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] answer = br.readLine().split(" ");
        int num1 = Integer.parseInt(answer[0]);
        int num2 = Integer.parseInt(answer[1]);

        int m = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++) {
            String[] line = br.readLine().split(" ");
            int parent = Integer.parseInt(line[0]);
            int child = Integer.parseInt(line[1]);
            list.get(parent).add(child);
            list.get(child).add(parent);
        }

        visited = new boolean[n + 1];
        depth = new int[n + 1];
        Arrays.fill(depth, -1);

        int result = bfs(num1, num2);

        System.out.println(result);
    }

    static int bfs(int start, int target) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        depth[start] = 0;

        while(!queue.isEmpty()) {
            int current = queue.poll();
            if(current == target) {
                return depth[current];
            }

            for(int i : list.get(current)) {
                if(!visited[i]) {
                    visited[i] = true;
                    depth[i] = depth[current] + 1;
                    queue.add(i);
                }
            }
        }

        return -1;
    }
}
