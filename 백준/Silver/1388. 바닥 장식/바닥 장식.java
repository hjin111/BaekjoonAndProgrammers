import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        String[][] board = new String[n][m];

        for (int i = 0; i < n; i++) {
            int j = 0;
            for (String s : br.readLine().split(""))
                board[i][j++] = s;
        }

        int count = 0;

        // 가로 카운트
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j].equals("-")) {
                    count++;
                    dfs(board, i, j, "-");
                }
            }
        }

        // 세로 카운트
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j].equals("|")) {
                    count++;
                    dfs(board, i, j, "|");
                }
            }
        }

        System.out.println(count);
    }

    static void dfs(String[][] board, int x, int y, String type) {
        int n = board.length;
        int m = board[0].length;

        if (x < 0 || y < 0 || x >= n || y >= m || !board[x][y].equals(type)) {
            return;
        }

        board[x][y] = "."; // 방문 표시

        if (type.equals("-")) {
            dfs(board, x, y + 1, type); 
        } else if (type.equals("|")) {
            dfs(board, x + 1, y, type); 
        }
    }
}
