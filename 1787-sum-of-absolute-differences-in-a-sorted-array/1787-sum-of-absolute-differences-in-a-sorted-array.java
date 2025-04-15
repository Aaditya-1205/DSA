class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
    int n = nums.length;
    int[] result= new int[n];
    int prefix=0;
    for(int i=0; i <n; i++){
         result[i] = (i*nums[i] - prefix) ;
         prefix+=nums[i];
    }
    int suffix=0;
    for(int i= n-1;i>=0;i--){
        result[i] += ( suffix - ( (n-(i+1)) * nums[i] )) ;
        suffix+=nums[i];
    }
    return result;
    }
}