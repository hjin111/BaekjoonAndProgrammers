import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 갯수
        StringTokenizer st = new StringTokenizer(br.readLine()); // 갯수 대로 점수 입력
        int [] score = new int [n]; // 점수 담을 배열
        int max = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            score[i] = Integer.parseInt(st.nextToken());
            if(max < score[i]){
                max = score[i];
            }
            sum += score[i];
        }

        System.out.println(sum * 100 / (double)max / n);
    }
}
