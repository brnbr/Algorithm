class Solution {
    public String solution(String my_string) {
        String answer = "";
        char tmp;
        String input = my_string;
        
        for(int i = 0; i<input.length(); i++){
            tmp = input.charAt(i);
            
            if(65 <= tmp && tmp <= 90){
                answer += input.valueOf(tmp).toLowerCase();
            }
            else if(97 <= tmp && tmp <= 122){
                answer += input.valueOf(tmp).toUpperCase();
            }
        }
        
        return answer;
    }
}