package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		this.board = new Board(8, 8);
		this.initialSetup();
	}
	public ChessPiece[][] getPieces() {
		ChessPiece mat[][] = new ChessPiece[board.getRows()][board.getColumns()];
		for (int r = 0; r < board.getRows(); r++) {
			for (int c = 0; c < board.getColumns(); c++) {
				mat[r][c] = (ChessPiece) board.piece(r, c);
			}
		}
		return mat;
	}
	private void placeChessPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	private void initialSetup() {
		placeChessPiece('b', 6, new Rook(board, Color.WHITE));
		placeChessPiece('e', 8, new King(board, Color.BLACK));
		placeChessPiece('e', 1, new King(board, Color.WHITE));
		
	}
	
}
