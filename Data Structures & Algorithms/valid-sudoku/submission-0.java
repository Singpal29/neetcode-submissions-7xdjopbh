class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!(checkRows(board, i) && checkColumns(board, i) && checkSquare(board, i))) return false;
        }
        return true;
    }
    public boolean checkRows(char[][] board, int index) {
        boolean[] tracker = new boolean[9];
        for (char i : board[index]) {
            if (i == '.') continue;
            if (tracker[i - 49]) {
                return false;
            }
            tracker[i - 49] = true;
        }
        return true;
    }
    public boolean checkColumns(char[][] board, int index) {
        boolean[] tracker = new boolean[9];

        for (int i = 0; i < 9; i++) {
            if (board[i][index] == '.') continue;
            if (tracker[board[i][index] - 49]) {
                return false;
            }
            tracker[board[i][index] - 49] = true;

        }
        return true;
    }
    public boolean checkSquare(char[][] board, int index) {
        int left = index % 3;
        int top = index / 3;
        boolean[] tracker = new boolean[9];

        for (int i = left * 3; i < left * 3 + 3; i++) {
            for (int j = top * 3; j < top * 3 + 3; j++) {
                if (board[i][j] == '.') continue;

                if (tracker[board[i][j] - 49]) return false;
                tracker[board[i][j] - 49] = true;
            }
            
        }
        return true;
    }
}
