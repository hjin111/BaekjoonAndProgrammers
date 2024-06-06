import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean result = true;

            if (num <= 1) {
                result = false;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        result = false;
                        break;
                    }
                }
            }

            if (result == true) {
                count++;
            }
        }

        System.out.println(count);
    }
}
