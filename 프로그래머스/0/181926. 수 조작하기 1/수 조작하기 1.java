class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        char[] str = control.toCharArray();
        for(int i = 0; i<str.length; i++){
            if(str[i] == 'w') n += 1;
            if(str[i] == 's') n -= 1;
            if(str[i] == 'd') n += 10;
            if(str[i] == 'a') n -= 10;
        }
        
        answer = n;
        
        return answer;
    }
}