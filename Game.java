import java.util.Scanner;

public class game {
	public static void main(args[]);
	System.out.println("Welcome to the Array Game! Move your sprite 'X' to the 'X' to win.");
	System.out.println(" ");
	System.out.println("Initial Board:");
	
	char[][] board = new char[4][4];
	board[0][0] = 'X';
	board[0][1] = 'O';
	board[0][2] = 'O';
	board[0][3] = 'O';
	board[1][0] = 'O';
	board[1][1] = 'O';
	board[1][2] = 'O';
	board[1][3] = 'O';
	board[2][0] = 'O';
	board[2][1] = 'O';
	board[2][2] = 'O';
	board[2][3] = 'O';
	board[3][0] = 'O';
	board[3][1] = 'O';
	board[3][2] = 'O';
	board[3][3] = 'O';
	
	for(char row = 0; row < board.length; row++){
		for(char col = 0; col < board[0].length; col++){
			System.out.print(board[row][col] + " ");
		}
		System.out.println();
	}
}
	
