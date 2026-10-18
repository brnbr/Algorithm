import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i<= n; i++){
            if(n % i != 0) continue;
            
            else list.add(i);
        }
        
        return list;
    }
}