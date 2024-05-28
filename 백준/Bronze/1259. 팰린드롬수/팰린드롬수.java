import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            for(;;) {
                String s = bf.readLine();
                if(s.equals("0"))break;
                int count = s.length(); // 갯수
                int same = 0;
                String[] first = new String[count]; // 한칸씩 담을 배열
                String[] last = new String[count];
                for (int i = 0; i < count; i++) {
                    first[i] = String.valueOf(s.charAt(i));
                }
                for (int j = 1; j <= count; j++) {
                    last[j - 1] = first[count - j];
                }

                for (int i = 0; i < count; i++) {
                    if (first[i].equals(last[i])) {
                        same += 1;
                    }
                }

                if (same == count) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }

            }

        }
    }


