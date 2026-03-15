import java.util.*;

class Solution {
    public ArrayList<Integer> sortByFreq(int[] arr) {
    int n = arr.length;
    
    //  optimal  ( n logn)
    HashMap<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<n;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }
    
// put in list
    ArrayList<Integer>list = new ArrayList<>();
      for(int i=0;i<n;i++){
      list.add(arr[i]);
    }
    //custom sorting
    Collections.sort(list,(a,b)->{
        int fa= map.get(a);
        int fb= map.get(b);
        
        if(fa==fb){
            return a-b;
        }
        return fb-fa;
    });
    return list;
    }
}