class Solution {
    static void relativeSort(int[] a1, int[] a2) {
        // optimal nlogn
          int p=0;
          if(a1.length==1) return;
        
          TreeMap<Integer,Integer>map = new TreeMap<>();
           for(int num:a1){
            map.put(num,map.getOrDefault(num,0)+1);
           }
        
      
        
         for(int i=0;i<a2.length;i++){
               while(map.containsKey(a2[i])){
               a1[p] = a2[i];
               p++;


              int freq = map.get(a2[i]) - 1;

             if(freq == 0){
              map.remove(a2[i]);
               } 
             else {
              map.put(a2[i], freq);
                 }
         }
         }
        
      for(Integer key : map.keySet()){
          int freq = map.get(key);

          while(freq > 0){
            a1[p++] = key;
             freq--;
    }
}
        
        
    }
}