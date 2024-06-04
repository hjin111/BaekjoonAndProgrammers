import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            if (a.equals("push")) stack.push(Integer.parseInt(st.nextToken()));
            if (a.equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(stack.pop() + "\n");
                }
            }
            if (a.equals("size")) sb.append(stack.size() + "\n");
            if (a.equals("empty")) {
                if (stack.isEmpty()) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            }
            if (a.equals("top")) {
                if (stack.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(stack.peek() + "\n");
                }
            }
        }
        System.out.print(sb);
    }

}