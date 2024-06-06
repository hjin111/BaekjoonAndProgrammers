import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        boolean[] isPrime = new boolean[max+1];

        for(int i = 2; i <= max; i++){
            isPrime[i] = true;
        }

        for(int i = 2; i * i <= max; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= max; j += i){
                    isPrime[j] = false;
                }
            }
        }

        for(int k = min; k <= max; k++){
            if(isPrime[k]){
                System.out.println(k);
            }
        }


    }
}
