import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]); // 과일의 개수
        int l = Integer.parseInt(line[1]); // 초기 길이
        String[] arr = br.readLine().split(" ");
        int[] harr = new int[n];
        for(int i = 0; i < n; i++) {
            harr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(harr);

        for(int i = 0; i < n; i++) {
            if(harr[i] > l) {
                break;
            }
            l += 1;
        }

        System.out.println(l);


    }
}
