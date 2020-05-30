class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        //System.out.println(A.length);
        ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >(); 
        int i=0,k=0,j=0;
        int start,end;
        while(i<A.length && j<B.length)
        {
            start=Math.max(A[i][0],B[j][0]);
            end=Math.min(A[i][1],B[j][1]);
            if(start<=end){
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(start);
                temp.add(end);
                x.add(temp);
            }
            if(A[i][1]<B[j][1])
                i++;
            else
                j++;
        }
        int[][] C=new int[x.size()][2];
        for(i=0;i<x.size();i++){
            ArrayList<Integer> row = x.get(i);
            C[i][0]=row.get(0);
            C[i][1]=row.get(1);
        }
        
            
        return C;
    }
}
