
class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int cnt = 0;
        int[] prefsum = new int[n];
        prefsum[0] = arr[0];
        for(int i = 1 ; i<n; i++){
            prefsum[i] = prefsum[i-1]+arr[i];
        }
        for(int i = 0; i<n;i++){
            if(!map.containsKey(prefsum[i])){
                map.put(prefsum[i],i);
            }else{
                return true;
            }
        }
        return false;
        
    }
}
