public class SudukoSolver {
    public static void main(String[] args) {
        char[][] board = {
                {5,      3,  '.',  '.',    7,  '.',  '.',  '.',  '.'},
                {6,    '.',  '.',    1,    9,    5,  '.',  '.',  '.'},
                {'.',    9,    8,  '.',  '.',  '.',  '.',    6,  '.'},
                {8,    '.',  '.',  '.',    6,  '.',  '.',  '.',    3},
                {4,    '.',  '.',    8,  '.',    3,  '.',  '.',    1},
                {7,    '.',  '.',  '.',    2,  '.',  '.',  '.',    6},
                {'.',    6,  '.',  '.',  '.',  '.',    2,    8,  '.'},
                {'.',  '.',  '.',    4,    1,    9,  '.',  '.',    5},
                {'.',  '.',  '.',  '.',    8,  '.',  '.',    7,    9}
            };

        printSudoku(board);
        System.out.println();

        new SudukoSolver().solveSudoku(board);
        printSudoku(board);
    }

    public static void printSudoku(char[][] board) {
        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {
                if(board[row][col] == '.') {
                    System.out.print(0 + " ");
                } else {
                    System.out.print((int)board[row][col] + " ");
                }
            }
            System.out.println();
        }
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve(char[][] board) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(board[i][j] == '.') {
                    for(char num=1; num<=9; num++) {
                        if(isNumberSafe(board, i, j, num)) {
                            board[i][j] = num;

                            if(solve(board)) {
                                return true;
                            }

                            board[i][j] = '.';
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    public boolean isNumberSafe(char[][] board, int row, int col, char target) {
        if(checkInRow(board, row, target) || checkInCol(board, col, target) || checkInBlock(board, row-row%3, col-col%3, target)) {
            return false;
        }

        return true;
    }

    public boolean checkInBlock(char[][] board, int row, int col, char target) {
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(target == board[row+i][col+j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean checkInRow(char[][] board, int row, char target) {
        for(int i=0; i<9; i++) {
            if(board[row][i] == target) {
                return true;
            }
        }

        return false;
    } 

    public boolean checkInCol(char[][] board, int col, char target) {
        for(int i=0; i<9; i++) {
            if(board[i][col] == target) {
                return true;
            }
        }

        return false;
    } 
}