class Solution {
    public int[] solution(String[] strlist) {
        int size = strlist.length;
        int[] cnt = new int[size];
        
        for(int i = 0; i<size; i++){
            for(int j = 0; j < strlist[i].length(); j++){
                cnt[i]++;
            }
        }
        
        return cnt;
    }
}