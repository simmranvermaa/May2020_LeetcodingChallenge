class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==0)
            return false;
        double x1=coordinates[0][0];
        double y1=coordinates[0][1];
        Double m=null;
        for(int i=1;i<coordinates.length;i++){
            double x2=coordinates[i][0];
            double y2=coordinates[i][1];
            
            if(x2-x1==0)
                return false;
            if(m==null)
            {
                m=(y2-y1)/(x2-x1);
                continue;
            }
            double slope=(y2-y1)/(x2-x1);
            if(m!=slope)
                return false;
        }
        return true;
        
    }
}
