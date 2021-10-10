package application;

import chess.ChessPiece;

// User Interface for printing ChessBoard.

public class UI {
	public static void printBoard(ChessPiece[][] pieces) {
		for (int row = 0; row < pieces.length; row++) {
			System.out.print((8 - row) + " ");
			for (int column = 0; column < pieces[row].length; column++) {
				printPiece(pieces[row][column]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.print("  a b c d e f g h");
		
	}
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		
	}
}
