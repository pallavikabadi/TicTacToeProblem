
package com.bridgelabz.Uc7;

import java.util.Scanner;

/**
 * Class to create ticktactoe game with different methods
 */
public class TicTacToeGame
{
    //create a board of char array of size 10
    static char[] board = new char[10];
    static char userLetter;
    static char computerLetter;
    public static void main(String[] args)
    {
        createEmptyBoard();
        chooseLetter();
        showBoard();
        makeMove();
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

    /**UC2
     *
     * chooseLetter
     * static method to choose letter for user and computer
     * It takes input from the user.Ternary operator(condition?exp1:exp2) lets us write if else
     * statement in one line. if user letter is 'X' then computer letter is become 'O' otherwise it becomes 'X'
     */
    private static void chooseLetter()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter :: X or O : ");
        userLetter = scanner.next().toUpperCase().charAt(0);
        computerLetter = (userLetter == 'X') ? 'O' : 'X';
    }

    /**UC3
     *  showBoard
     * method to display current board
     * it prints the every element in board array using println method.
     */
    private static void showBoard()
    {
        System.out.println( board[1] + " | " + board[2] + " | " + board[3] );
        System.out.println("----------");
        System.out.println( board[4] + " | " + board[5] + " | " + board[6] );
        System.out.println("----------");
        System.out.println( board[7] + " | " + board[8] + " | " + board[9] );
    }
    /**
     * UC4
     *  makeMove
     *  method to make user to move to desired location
     *  It takes user input from index 1 to 9. If you enter invalid index or try to move
     * to occupied position it prints error message else it moves the user letter to desired location.
     */
    private static void makeMove()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your location(1-9): ");
        int position = scanner.nextInt();
        if (position > 9 && position < 1)
        {
            System.err.println("Enter a valid location b/w 1 to 9");
            makeMove();
        }
        else if (board[position] != ' ')
        {
            System.err.println("You already chosen this! Enter a valid location");
            makeMove();
        }
        else
        {
            board[position] = userLetter;
            showBoard();
            makeMove();
        }
    }

    /**UC5
     * checkFreeSpace
     * method to check if space is available in the board.
     * It checks free space is available or not before make a move and
     * count the number of spaces available.It extends UC4.
     */
    private static void checkFreeSpace()
    {
        boolean isSpaceAvailable = false;
        int numOfFreeSpaces = 0;
        for(int index=1;index<board.length;index++)
        {
            if((board[index] == ' '))
            {
                isSpaceAvailable = true;
                numOfFreeSpaces++;
            }
        }
        if(isSpaceAvailable == false)
        {
            System.err.println("Board is full! You can't make another move");

        }
        else
        {
            System.out.println("Free space is available! you have "+numOfFreeSpaces+ " moves left");
        }
    }
    /**UC6
     *checkFirstPlayer
     *method to check who plays first computer or user
     *random generates two values 0 and 1. if it is 0 it prints computer play first
     * otherwise user plays first
     */
    private static void checkFirstPlayer()
    {
        int Head = 0;
        double toss = Math.floor(Math.random()*10) % 2;
        if ( toss == Head )
        {
            System.out.println("computer starts to play first");
        }
        else
        {
            System.out.println("User starts to play first");
        }
    }
}
