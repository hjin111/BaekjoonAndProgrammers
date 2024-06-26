import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] one = br.readLine().split(" ");
        int n = Integer.parseInt(one[0]);
        int k = Integer.parseInt(one[1]);

        Queue<Integer> pq = new PriorityQueue<>();

        String[] two = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(two[i]));
        }

        for (int i = 0; i < k - 1; i++) {
            pq.poll();
        }

        System.out.println(pq.poll());
    }
}
