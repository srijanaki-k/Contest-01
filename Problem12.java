
//Approach-1
class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int l =0;
        int r = n-1;
        int res = 0;
        int leftsum = 0;
        int rightsum =0;
        while(l<=r){
            if(arr[l]<=arr[r]){
                if(arr[l]>=leftsum){
                    leftsum = arr[l];
                }else{
                    res+=leftsum-arr[l];
                }
                l++;
            }else{
                if(arr[r]>=rightsum){
                    rightsum = arr[r];
                }else{
                    res+=rightsum-arr[r];
                }
                r--;
            }
        }
        return res;
    }
}


//Approach- 2
class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        int res = 0;
        leftmax[0] = arr[0];
        rightmax[n-1] = arr[n-1];
        for(int i =1;i<n;i++){
            if(arr[i]>leftmax[i-1])
            leftmax[i] = arr[i];
            else leftmax[i] = leftmax[i-1];
        }

        for(int j =n-2;j>=0; j--){
            if(arr[j]>rightmax[j+1])
            rightmax[j] = arr[j];
            else
            rightmax[j] = rightmax[j+1];
        }
        for(int i =0; i<n; i++){
            int min = Math.min(leftmax[i],rightmax[i]);
            res += min - arr[i];
        }
        return res;
    }
}
