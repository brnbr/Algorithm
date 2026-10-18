class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        //문자열 쪼개기
        String[] c = num_str.split("");
        
        //자릿수 합
        for(int i = 0; i<c.length; i++){
            answer += Integer.parseInt(c[i]);
        }
        
        return answer;
    }
}