class Solution {
    boolean twoSum(int arr[], int target) {
        // code here rehytgutghgyt uytrtgrtirr=-0-=terrtytyrtyrf
        int n = arr.length;
        HashSet <Integer> set = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            int comp = target - arr[i];
            if(set.contains(comp)){
                return true;
            }
                set.add(arr[i]);
            
        }
        return false;
    }
}