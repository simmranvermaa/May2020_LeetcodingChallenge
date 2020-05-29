class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor)
            return image;
        int prevC=image[sr][sc];
        fill(image,sr,sc,newColor,prevC);
        return image;
    }
    public void fill(int[][] image, int sr, int sc, int newC, int prevC){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=prevC){
            return;
        }
        image[sr][sc]=newC;
        fill(image, sr-1,sc,newC,prevC);
        fill(image, sr+1,sc,newC,prevC);
        fill(image, sr,sc-1,newC,prevC);
        fill(image, sr,sc+1,newC,prevC);
    }
}
