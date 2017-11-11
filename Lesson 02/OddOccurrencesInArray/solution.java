import java.util.*;


class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer,Integer> myHash = new HashMap<Integer,Integer>();
        //add the values into hashmap, if you try to add same value again delete it
        //so that in the end there will be only the value with odd occurrence
        for(int i=0; i<A.length; i++){ 
            if(myHash.containsKey(A[i])){
                myHash.remove(A[i]);
            }else{
                myHash.put(A[i],i); 
            }
            
        }
        
        for(int numb : myHash.keySet()){
            return numb;
        }
        return -1;
    }
}
