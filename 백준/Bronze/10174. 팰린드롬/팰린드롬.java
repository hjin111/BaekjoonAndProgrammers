import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count2 = Integer.parseInt(br.readLine());

        for(int i = 0; i < count2; i++){
            String s = br.readLine().toLowerCase();
            int count = s.length();
            String[] first = new String[count];
            String[] last = new String[count];
            for(int j = 0; j < count; j++){
                first[j] = String.valueOf(s.charAt(j));
            }
            for(int j = 1; j <= count; j++){
                last[j - 1] = first[count - j];
            }
            int same = 0;
            for(int j = 0; j < count; j++){
                if(first[j].equals(last[j])){
                    same += 1;
                }
            }

            if(same == count){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }

    }
}
