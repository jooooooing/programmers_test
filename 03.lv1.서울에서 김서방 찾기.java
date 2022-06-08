class Solution {
    public String solution(String[] seoul) {
        
        String kim = "Kim";
        int loc = 0;        
        for (int i = 0; i<seoul.length; i++){
            if (seoul[i].equals(kim)) {
               loc = i;
            }            
        }
        
        String answer = ("김서방은 " + loc +"에 있다");
        return answer;
    }
}
