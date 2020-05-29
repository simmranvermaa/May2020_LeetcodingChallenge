class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();
        if(len2==0 || len2<len1)
            return false;
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<len1;i++){
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<len2-len1;i++){
            if(isPermutation(arr1,arr2))
                return true;
            arr2[s2.charAt(i)-'a']--;
            arr2[s2.charAt(len1+i)-'a']++;
        }
        if(isPermutation(arr1,arr2))
            return true;
        return false;
        
    }
    public boolean isPermutation(int arr1[], int arr2[]){
        for(int i=0;i<arr1.length;i++)
            if(arr1[i]!=arr2[i])
                return false;
        return true;
    }
}
