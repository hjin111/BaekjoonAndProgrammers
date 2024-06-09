import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 갯수
        String s = br.readLine();
        String[] sArr = new String[n];
        int sum = 0;
        for(int i = 0; i < sArr.length; i++){
            sArr[i] = String.valueOf(s.charAt(i));
        }
        for(int i = 0; i < sArr.length; i++){
            sum += Integer.parseInt(sArr[i]);
        }

        System.out.println(sum);
    }
}
