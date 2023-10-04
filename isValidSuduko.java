public boolean isValidSudoku(char[][] board) {
        int rows = board.length ; 
        int cols = board[0].length; 
        
        HashSet<String> set =new HashSet();
        
        for (int i = 0; i < rows;i++) {
            for (int j = 0; j < cols;j++) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    
                    if (set.contains(b + i) || set.contains(j + b) || set.contains(i/3 + b + j/3))
                        return false; 
                    set.add(b + i); 
                    set.add(j + b); 
                    set.add( i/3 + b + j/3); 
                }
            }
        }
        return true; 
    }
