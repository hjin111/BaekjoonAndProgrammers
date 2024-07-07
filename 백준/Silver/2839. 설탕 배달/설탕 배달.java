import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (true) {
            if (n % 5 == 0) { // n이 0일떄도 0 % 5 == 0 이기 때매 조건 성립
                count += n / 5;
                System.out.println(count);
                break;
            } else {
                n -= 3;
                count++;
            }
            if (n < 0) {
                System.out.println(-1);
                break;
            }
        }
    }
}
