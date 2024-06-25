import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<int[]> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            int y = Integer.parseInt(line[1]);
            points.add(new int[]{x, y});
        }

        Collections.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                if (p1[1] == p2[1]) {
                    return Integer.compare(p1[0], p2[0]);
                } else {
                    return Integer.compare(p1[1], p2[1]);
                }
            }
        });

        for (int[] point : points) {
            sb.append(point[0]).append(" ").append(point[1]).append("\n");
        }

        System.out.print(sb.toString());
    }
}
