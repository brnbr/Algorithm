class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        //안바뀔 원본 앞부분 0 ~ s
        String front = my_string.substring(0, s);
        
        //바뀌는 단어 뒤에 남는 부분
        int over = s + overwrite_string.length();
        String back = my_string.substring(over);
        
        //앞 + 바뀜 + 뒤
        answer = front + overwrite_string + back;
        
        return answer;
    }
}