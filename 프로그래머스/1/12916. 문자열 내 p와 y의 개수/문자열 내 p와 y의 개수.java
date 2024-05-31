class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int n = s.length();
        int pn = 0;
        int yn = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P' ){
                pn++;
            }else if(s.charAt(i) == 'Y' || s.charAt(i) == 'y'){
                yn++;
            }
        }
        if(pn != yn){
            answer = false;
        }

        return answer;
    }
}