class Solution {
    public int findComplement(int num) {
        String bin=Integer.toBinaryString(num);
        char[] arr=bin.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0'){
                arr[i]='1';
            }
            else
                arr[i]='0';
        }
        String res=new String(arr);
        return Integer.parseInt(res,2);
        
    }
}
