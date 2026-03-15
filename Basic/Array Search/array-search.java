class Solution {
    public int search(int arr[], int x) {
        // code  ghfg gdfgrfgetet yt
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
