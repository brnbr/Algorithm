class Solution {
    public String solution(String my_string) {
        String ans = my_string;
        String[] al = {"a", "e", "i", "o", "u"};
        
        for(String c : al){
            ans = ans.replaceAll(c, "");
        }
        
        return ans;
    }
}