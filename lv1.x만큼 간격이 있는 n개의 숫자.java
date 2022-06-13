class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long result = x;
        answer[0] = result;
        
        for (int i = 1; i < n; i ++ ) {
            result = result+x;
            answer[i] = result;
            
        }        
        return answer;
    }
}
