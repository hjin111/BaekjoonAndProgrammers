import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<Object[]> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int age = Integer.parseInt(line[0]);
            String name = line[1];
            arr.add(new Object[]{age, name});
        }

        //System.out.println(Arrays.deepToString(arr.toArray()));
        
        Collections.sort(arr, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                if(o1[0] == o2[0]) { // 나이가 같으면
                     return 0;
                }else{
                    return ((Integer) o1[0]).compareTo((Integer) o2[0]);
                }
            }
        });

        for( Object[] result : arr ){
            System.out.println(result[0] + " " + result[1]);
        }

    }
}
