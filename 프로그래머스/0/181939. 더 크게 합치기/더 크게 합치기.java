class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        
        String sum1 = aa+bb;
        String sum2 = bb+aa;
        
        int ab = Integer.parseInt(sum1);
        int ba = Integer.parseInt(sum2);
        
        if(ab >= ba) answer = ab;
        else answer = ba;
        
        return answer;
    }
}