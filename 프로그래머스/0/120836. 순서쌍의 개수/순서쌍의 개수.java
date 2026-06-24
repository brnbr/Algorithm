class Solution {
    public int solution(int n) {
        int[] nn = new int[n+1];

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                nn[i]++;
            }
        }

        int ans = 0;
        for (int i = 1; i < nn.length; i++) {
            if (nn[i] != 0) {
                for (int j = 1; j < nn.length; j++) {
                    if (nn[j] != 0) {
                        if (i * j == n) {
                            ans++;
                        }
                    }
                }

            }
        }

        return ans;
    }
}