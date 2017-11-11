class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        //The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times
        //exceptions
        if(A.length <=1) return A;
        if(K == 0)  return A; 
        if(K>A.length)  K=K%A.length;

        int len = A.length;
        int[] helper = new int[K];
        //store last K elements in another structure
        int h=0;
        for(int i=A.length-K; i<A.length; i++){
            //System.out.println(h);
            helper[h] = A[i];
            //System.out.println(helper[h]);
            
            h++;
        }
        
        for(int i=len-K-1; i>=0; i--){
            A[i+K] = A[i];
        }
        for(int i=0; i<K; i++){
            A[i] = helper[i];
        }
        return A;
    }
}
