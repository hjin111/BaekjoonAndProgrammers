
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[] answer;
    static boolean[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        answer = new int[m];
        check = new boolean[n + 1];

        permutation(0);
    }

    private static void permutation(int count) {
        if(count == m){
            for(int i : answer){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i <= n; i++){
            if(!check[i]){
                check[i] = true;
                answer[count] = i;
                permutation(count+1);
                check[i] = false;
            }
        }
    }
}
