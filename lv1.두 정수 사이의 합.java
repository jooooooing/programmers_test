class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a>b){
            if (a-b>1){
                for (int i = b; i<=a; i++){
                    answer += i;
                }
            } 
        } else if (a<b){
            if (b-a>1) {
                for (int i = a; i<=b; i++) {
                       answer += i;
                }                 
            } 
        } else {
            answer = a;
        }
        return answer;
    }
}
