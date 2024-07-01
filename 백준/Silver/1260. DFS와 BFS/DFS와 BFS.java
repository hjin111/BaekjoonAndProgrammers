import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static List<List<Integer>> list;
    static boolean[] visited_dfs;
    static boolean[] visited_bfs;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        int v = Integer.parseInt(line[2]);

        list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
           list.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            String[] input = br.readLine().split(" ");
            int one = Integer.parseInt(input[0]);
            int two = Integer.parseInt(input[1]);
            list.get(one).add(two);
            list.get(two).add(one);
        }

        for(int i = 0; i <= n; i++){
            Collections.sort(list.get(i));
        }

        // dfs
        visited_dfs = new boolean[n+1];
        dfs(v);

        System.out.println();

        // bfs
        visited_bfs = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        while(!q.isEmpty()){
            int target = q.poll();
            visited_bfs[target] = true;
            System.out.print(target + " ");
            for( int i : list.get(target)){
                if(!visited_bfs[i]){
                    visited_bfs[i] = true;
                    q.add(i);
                }
            }
        }
    }

    static void dfs(int start){
        System.out.print(start + " ");
        visited_dfs[start] = true;
        for(int i : list.get(start)){
            if(!visited_dfs[i]){
                dfs(i);
            }
        }
    }
}
