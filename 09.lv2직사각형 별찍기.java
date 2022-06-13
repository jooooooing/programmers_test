import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int cnta = 0;
        
        for (int i = 0; i < b; i ++) {
            for (int j = 0; j < a; j++){
                System.out.print("*");
                cnta ++;
                if (cnta == a) {
                    System.out.println();
                }
            } cnta = 0;
        } 
    }
}
