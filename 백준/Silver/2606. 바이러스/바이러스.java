import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static List<List<Integer>> list;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine());
        int network = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        visited = new boolean[computer + 1];

        for(int i = 0; i <= computer; i++){
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < network; i++) {
            String[] input = br.readLine().split(" ");
            int one = Integer.parseInt(input[0]);
            int two = Integer.parseInt(input[1]);
            list.get(one).add(two);
            list.get(two).add(one);
        }

        int answer = dfs(1);
        System.out.println(answer - 1);

    }
    static int dfs(int start) {
        visited[start] = true;
        int count = 1;
        for(int i : list.get(start)){
            if(!visited[i]){
                count += dfs(i);
            }
        }
        return count;
    }
}
