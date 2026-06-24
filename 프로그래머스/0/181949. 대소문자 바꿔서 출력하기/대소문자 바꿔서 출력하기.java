import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char tmp;
        String ans = "";
        
        for(int i = 0; i < a.length(); i++){
             tmp = a.charAt(i);
            
            if(65 <= tmp && tmp <= 90){
                ans += a.valueOf(tmp).toLowerCase();
            }
            else if(97 <= tmp && tmp <= 122){
                ans += a.valueOf(tmp).toUpperCase();
            }
        }
        
        System.out.println(ans);
    }
}