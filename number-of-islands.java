class Solution {
    public static void island(int i,int j,char[][] grid,boolean[][] chk){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || chk[i][j] || grid[i][j] == '0') {
    return;
}
        chk[i][j]=true;
        island(i,j-1,grid,chk);
        island(i,j+1,grid,chk);
        island(i-1,j,grid,chk);
        island(i+1,j,grid,chk);
    }
    public int numIslands(char[][] grid) {
        boolean[][] chk=new boolean[grid.length][grid[0].length];
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if((grid[i][j]=='1') && (chk[i][j]==false)){
                    island(i,j,grid,chk);
                    c++;
                }
            }


        }
        return c;
    }
}
