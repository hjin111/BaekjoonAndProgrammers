import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 갯수
        int m = sc.nextInt(); // 횟수
        int[] num = new int[n + 1];
        int[] sum = new int[n + 1];
        num[0] = 0;
        sum[0] = 0;
        for(int i = 1; i <= n; i++){
            num[i] = sc.nextInt(); // 갯수 대로 배열 담기
            sum[i] += sum[i - 1] + num[i]; // 합배열 담기
        }
        
        for(int i = 0; i < m; i++){
            int j = sc.nextInt(); 
            int k = sc.nextInt(); 
            System.out.println(sum[k] - sum[j - 1]);
        }

    }
}
