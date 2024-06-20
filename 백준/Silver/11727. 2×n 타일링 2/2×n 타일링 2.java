import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n+1];
        nArr[0] = 1;
        nArr[1] = 1;
        for(int i = 2; i < n+1; i++){
            nArr[i] = (nArr[i-2] * 2 + nArr[i-1]) % 10007;
        }
        System.out.println(nArr[n]);
    }
}
