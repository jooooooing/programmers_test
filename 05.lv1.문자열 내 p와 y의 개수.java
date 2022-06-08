class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int p = 0;
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == 'p'){
                  p ++;
            } else if (s.charAt(i) == 'P'){
                p ++;
            }             
        }
        
        int y = 0;
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == 'y'){
                  y ++;
            } else if (s.charAt(i) == 'Y'){
                y ++;
            }             
        }
        
        if (p == y) {
            answer = true;
        } else {
            answer = false;
        }

        
        System.out.println(p);
        System.out.println(y);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
