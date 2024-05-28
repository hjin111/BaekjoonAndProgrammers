import java.util.Scanner;

public class Solution {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int length = a.length();
        String[] arr = new String[length];
        for(int i = 0; i < length; i++){
            arr[i] = String.valueOf(a.charAt(i));
        }
        for(int i = 0; i < length; i++){
            System.out.println(arr[i]);
        }
    }
}