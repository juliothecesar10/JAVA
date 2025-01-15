package sef.module3.sample;

public class ChessBoard {
	public static void main(String[] args) {
		
		String[][] board = { 
				{"R","N","B","Q","K","B","N","R"},
				{"P","P","P","P","P","P","P","P"},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{"p","p","p","p","p","p","p","p"},
				{"r","n","b","q","k","b","n","r"}};

		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 
		 //Mover Cavalo
		 System.out.println("");
		 board[5][5] = board[7][6];
		 board[7][6] = "";

		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 
		 // Mover Peao
		 System.out.println("");
		 board[4][2] = board[6][2];
		 board[6][2] = " ";
		 
		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 //imprimirBoard(board);
	}
	
	// --------------Impressão do Tabuleiro---------------------------------------
	public void imprimirBoard(String[][] board) {
		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
	}
}
