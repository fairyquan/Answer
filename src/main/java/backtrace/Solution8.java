package backtrace;

import java.util.Arrays;

public class Solution8 {
    public char[][] solveSudoku(char[][] board) {
        backTracking(board,0);
        return board;
    }
    public boolean backTracking(char[][] board,int n){
        for (int i=n;i<9;i++){
            for (int j=0;j<9;j++){
                if (board[i][j]!='.') continue;
                for (char x='1';x<='9';x++){
                    if (isValid(board,x,i,j)){
                        board[i][j]= x;
                        if (backTracking(board,i+j/8)){
                            return true;
                        }
                        board[i][j]='.';
                    }
                }
                return false;
            }
        }
        return true;
    }
    public boolean isValid(char[][] board,char number,int i,int j){
        //横向检查
        for (int m=0;m<9;m++){
            if (board[i][m]== number){
                return false;
            }
        }
        //纵向检查
        for (int n=0;n<9;n++){
            if (board[n][j]==number){
                return false;
            }
        }
        //所在九宫格检查
        int x=(i/3)*3;
        int y=(j/3)*3;
        for (int n=x;n<x+3;n++){
            for (int m=y;m<y+3;m++){
                if (board[n][m]==number){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board=new char[9][9];
        for (int i = 0; i < 9; i++) {
            Arrays.fill(board[i],'.');
        }
        board[0][0]='5';board[0][1]='3';board[0][4]='7';
        board[1][0]='6';board[1][3]='1';board[1][4]='9';board[1][5]='5';
        board[2][1]='9';board[2][2]='8';board[2][7]='6';
        board[3][0]='8';board[3][4]='6';board[3][8]='3';
        board[4][0]='4';board[4][3]='8';board[4][5]='3';board[4][8]='1';
        board[5][0]='7';board[5][4]='2';board[5][8]='6';
        board[6][1]='6';board[6][6]='2';board[6][7]='8';
        board[7][3]='4';board[7][4]='1';board[7][5]='9';board[7][8]='5';
        board[8][4]='8';board[8][7]='7';board[8][8]='9';
        new Solution8().solveSudoku(board);
        System.out.println(Arrays.deepToString(board));
    }
}
