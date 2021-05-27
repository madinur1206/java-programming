package OfficeHours.practice_05_25_2021;
/*
Write the method won(char[]) that should determine who won in tic-tac-toe game.

If X player won, return string: "Player X won"
If O player won, return string: "Player O won"
Example:

char[] game1 = {
  'X', 'X', 'X',
  '-', 'O', '-',
  '-', 'O', '-'
};

Result: Player X won


 */

public class TicTacToe {

    public static void main(String[] args) {

        char[] game = {
                'X', 'X', 'X',
                '-', 'O', '-',
                '-', 'O', '-'
        };
        System.out.println(won(game));

    }


    public static String won(char[] x){
        String winner = "";
        for (int i = 0,y=0; i < x.length; i++,y+=3) {

            String rows ="" +x[y]+x[y+1]+x[y+2];
            String col = ""+x[i]+x[i+3]+x[i+6];
            String dig = "";
            if(i==0){
                dig = ""+x[i]+x[i+4]+x[i+8];
            }else if (i==2){
                dig = ""+x[i]+x[i+2]+x[i+4];
            }
            if(rows.equals("XXX")||col.equals("XXX")) {
                winner = "Player X won";
            }else if (rows.equals("OOO")||col.equals("OOO")) {
                winner = "Player O won";
            }

        }
        return winner;
    }
}
