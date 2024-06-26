import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] nArr = new int[n];

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(br.readLine());
            nArr[i] = num;
        }

        Arrays.sort(nArr);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < nArr.length; i++){
            sb.append(nArr[i]).append("\n");
        }
        System.out.println(sb);

    }
}
