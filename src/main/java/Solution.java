public class Solution {
    public int minimumOneBitOperations(int n) {
        int i = 0;
        while (n >= (int)Math.pow(2, i)){
            i++;
        }
        i--;
        int result = 0;
        for (int j = 0; j <= i; j++) {
            result += (int)Math.pow(2, j);
        }
        result -= n - Math.pow(2, i);
        return result;
    }
}
