class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character,int[][]> map=new HashMap<>();
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
            {
                int k=0;
                if(board[i][j]!='.')
                {
                    if(map.containsKey(board[i][j]))
                    {
                      
                        while(map.get(board[i][j])[k][0]!=-1)
                        {
                            if(map.get(board[i][j])[k][0]==i||map.get(board[i][j])[k][1]==j)
                                return false;
                            else if(map.get(board[i][j])[k][0]>=i-i%3&&map.get(board[i][j])[k][0]<i-i%3+3)
                                    if(map.get(board[i][j])[k][1]>=j-j%3&&map.get(board[i][j])[k][1]<j-j%3+3)
                                        return false;
                            k++;
                        }
                        
                    }
                    else{
                        map.add(board[i][j],new int[8]);
                    }
                    map.get(board[i][j])[k][0]=i;
                        map.get(board[i][j])[k][1]=j;
                        map.get(board[i][j])[k+1][0]=-1;
                }
            }
                
    return true;
    }
}
