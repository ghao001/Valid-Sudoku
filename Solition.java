class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character,int[][]> map=new HashMap<>();
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(map.containsKey(board[i][j]))
                    {
                        int k=0;
                        while(map.get(board[i][j])[k][0]!=-1)
                        {
                            if(map.get(board[i][j])[k][0]==i||map.get(board[i][j])[k][1]==j)
                                return false;
                            else if()
                        }
                    }
                }
            }
                

    }
}