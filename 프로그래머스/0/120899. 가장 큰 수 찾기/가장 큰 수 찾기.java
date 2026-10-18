import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] array) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int max = -1;
        int index = -1;
        for(int i = 0; i<= array.length-1; i++){
            if(max < array[i]){
                max = array[i];
                index = i;
            }
        }
        ans.add(max);
        ans.add(index);
        
        return ans;
    }
}