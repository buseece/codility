class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int k = (Y-X)/D;
        int mod = (Y-X)%D;
        if(mod == 0)    return k;
        else return k+1;
    }
}
