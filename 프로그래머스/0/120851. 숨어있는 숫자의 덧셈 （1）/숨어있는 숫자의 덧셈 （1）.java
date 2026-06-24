class Solution {
    public int solution(String my_string) {
        int ans = 0;
        String str = my_string.replaceAll("[A-z]", "");
        
        for(int i = 0; i<str.length(); i++){
            ans += str.charAt(i) - '0';
        }
        
        return ans;
    }
}