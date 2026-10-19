import java.lang.Math;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int times = 1;
        int sum = 0;
        for(int i = 0; i<num_list.length; i++){
            sum += num_list[i];
            times *= num_list[i];
        }
        
        if(Math.pow(sum, 2) > times) answer = 1;
        else answer = 0;
        
        return answer;
    }
}