// User function Template for Java

class Solution {
    public ArrayList<Integer> customSort(int[] arr) {
        // your code
        ArrayList<Integer>list = new ArrayList<>();
        int n= arr.length;
        
        Arrays.sort(arr,0,n/2);
        Arrays.sort(arr,n/2,n);
        
        int left = n/2;
        int right = n-1;
        
        while(left<right){
            int temp= arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        
        for(int i=0;i<n;i++){
            list.add(arr[i]);
        }
        return list;
    }
}