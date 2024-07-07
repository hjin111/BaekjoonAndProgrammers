import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]); // 물이 새는 곳의 개수
        int l = Integer.parseInt(line[1]); // 테이프 길이

        String[] arr = br.readLine().split(" ");
        int[] narr = new int[n];
        for (int i = 0; i < n; i++) {
            narr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(narr);

        int answer = 0;
        int start = narr[0]; 
        int end = start + l - 1; 
        for (int i = 1; i < n; i++) {
            if (narr[i] <= end) {
                continue;
            } else {
                answer++;
                start = narr[i]; 
                end = start + l - 1; 
            }
        }
        
        answer++;
        System.out.println(answer);
    }
}
