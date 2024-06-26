import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<Object[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            String name = line[0];
            int kor = Integer.parseInt(line[1]);
            int eng = Integer.parseInt(line[2]);
            int mat = Integer.parseInt(line[3]);
            list.add(new Object[]{name, kor, eng, mat});
        }

        Collections.sort(list, new Comparator<Object[]>() {
           @Override
           public int compare(Object[] o1, Object[] o2) { 
                if(o1[1] == o2[1] && o1[2] == o2[2] && o1[3] == o2[3]) {   // 모든 점수가 같으면
                    return ((String)o1[0]).compareTo((String)o2[0]); // 이름 오름차순
                } else if (o1[1] == o2[1] && o1[2] == o2[2]) { // 국어, 영어 같으면
                    return ((Integer)o2[3]).compareTo((Integer) o1[3]); // 수학 내림차순
                } else if(o1[1] == o2[1]){ // 국어 점수 같으면 
                    return ((Integer)o1[2]).compareTo((Integer)o2[2]); // 영어 오름차순
                } else {
                    return ((Integer)o2[1]).compareTo((Integer)o1[1]); // 국어 점수 감소 ( 내림차순 )
                }
           }
        });

        for( Object[] obj : list ) {
            System.out.println(obj[0]);
        }
    }
}
