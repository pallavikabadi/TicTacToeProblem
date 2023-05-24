ipackage com.bridgelabz.Uc1;

/**
 * Class to create ticktactoe game with different methods
 */
public class TicTacToeGame
{
    //create a board of char array of size 10
    static char[] board = new char[10];
    public static void main(String[] args)
    {
        createEmptyBoard();

    }
    /**UC1
     *  createEmptyBoard
     *  Static method to create empty board
     *  It takes board array indexes from 1 to 9 using for loop and
     *  assign empty space to each element in the board.
     */
    private static void createEmptyBoard()
    {
        for(int i=1; i<board.length;i++)
        {
            board[i] = ' ';
        }
    }
}