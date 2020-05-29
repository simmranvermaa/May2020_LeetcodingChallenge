class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        int max_here=arr[0];
        int max=arr[0];
        int min_here=arr[0];
        int min=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max_here+arr[i]>arr[i])
                max_here+=arr[i];
            else
                max_here=arr[i];
            if(max<max_here)
                max=max_here;
            if(min_here+arr[i]<arr[i])
                min_here+=arr[i];
            else
                min_here=arr[i];
            if(min>min_here)
                min=min_here;
            sum+=arr[i];
        }
        if(sum==min) return max;
        else 
            return Math.max(max,sum-min);
    }
}
