import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int a = commands[i][0];
            int b = commands[i][1];
            int k = commands[i][2];
            int[] result = new int[b - a + 1];
            for (int j = a - 1; j < b; j++) {
                result[j - (a - 1)] = array[j];
            }
            Arrays.sort(result);
            answer[i] = result[k - 1];
        }
        return answer;
    }
}
