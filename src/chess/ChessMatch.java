package chess;

import boardgame.Board;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		this.board = new Board(8, 8);
	}
	public ChessPiece[][] getPieces() {
		ChessPiece mat[][] = new ChessPiece[board.getRows()][board.getColumns()];
		for (int c = 0; c < board.getRows(); c++) {
			for (int l = 0; l < board.getColumns(); l++) {
				mat[c][l] = (ChessPiece) board.piece(c, l);
			}
		}
		return mat;
	}

}
