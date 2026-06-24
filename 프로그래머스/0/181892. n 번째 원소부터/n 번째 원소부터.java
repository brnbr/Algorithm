class Solution {
    public int[] solution(int[] num_list, int n) {
        int m = num_list.length-n+1;
        int[] answer = new int[m];
        
        for(int i = 0; i<m; i++){
            answer[i] = num_list[n-1+i];
        }
        
        return answer;
    }
}