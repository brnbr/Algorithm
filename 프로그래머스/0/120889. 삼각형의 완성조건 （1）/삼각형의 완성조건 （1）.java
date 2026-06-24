class Solution {
    public int solution(int[] sides) {
        int ans = 0;
        
        //max 찾기
        int max = -1;
        for(int i = 0; i<sides.length; i++){
            if(max < sides[i]){
                max = sides[i];
            }
        }
        
        //나머지 두 변 길이의 합
        int sum = max * -1;
        for(int j = 0; j<sides.length; j++){
            sum += sides[j];
        }
        
        //비교
        if(sum > max){
            ans = 1;
        }
        else if(max >= sum){
            ans = 2;
        }
        
        return ans;
    }
}
