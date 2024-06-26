import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();

        Queue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());

        for (int i = 0; i < nums.length(); i++) {
            char c = nums.charAt(i);
            int num = Integer.parseInt(Character.toString(c));
            pq.add(num);
        }

        while (!pq.isEmpty()) {
            int num = pq.poll();
            System.out.print(num);
        }
    }
}
