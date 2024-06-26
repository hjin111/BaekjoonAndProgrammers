import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
        
        long[] nums = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Long.parseLong(br.readLine());
        }
        
        Arrays.sort(nums);
        
        long num = nums[0];
        int max = 1;
        int Count = 1;
        
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                Count++;
            } else {
                Count = 1;
            }
           
            if (Count > max) {
                max = Count;
                num = nums[i];
            }
        }
        
        System.out.println(num);
    }
}
