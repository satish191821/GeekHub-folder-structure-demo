
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // optimal O(n+m)
     HashMap<Integer,Integer>map = new HashMap<>();
      
      for(int num:a){
          map.put(num,map.getOrDefault(num,0)+1);
      }
      for(int num:b){
          if(!map.containsKey(num)){
              return false;
          }
          map.put(num,map.get(num)-1);
          if(map.get(num)==0){
              map.remove(num);
          }
              
          
      }
      return true;
    }
}
