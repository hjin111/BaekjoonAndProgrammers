import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n + 1];

        for (int i = 2; i < nArr.length; i++) {
            nArr[i] = nArr[i - 1] + 1;

            if (i % 2 == 0) {
                nArr[i] = Math.min(nArr[i / 2]+1, nArr[i]);
            }
            if (i % 3 == 0) {
                nArr[i] = Math.min(nArr[i / 3]+1, nArr[i]);
            }

        }

        System.out.println(nArr[n]);

    }


}
