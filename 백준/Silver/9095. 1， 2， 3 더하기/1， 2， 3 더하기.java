import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            
            if (n == 1) {
                System.out.println(1);
            } else if (n == 2) {
                System.out.println(2);
            } else if (n == 3) {
                System.out.println(4);
            } else {
                int[] nArr = new int[n];
                nArr[0] = 1;
                nArr[1] = 2;
                nArr[2] = 4;
                
                for(int j = 3; j < n; j++){
                    nArr[j] = nArr[j - 1] + nArr[j - 2] + nArr[j - 3];
                }
                System.out.println(nArr[n - 1]);
            }
        }
    }
}
