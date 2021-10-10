package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if (rows <  1 || columns < 1) {
			throw new BoardException("Quantidade de linhas e de colunas deve ser maior que 0");
		}
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}
	public Piece piece(int row, int column) {
		if (!positionExists(new Position(row, column))) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return pieces[row][column];
	}
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição não existe no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("Já existe uma peça na posição " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	public boolean positionExists(Position position) {
		try {
			if (pieces[position.getRow()][position.getColumn()] == null) {}
			return true;
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}
	public boolean thereIsAPiece(Position position) {
		return this.piece(position) != null;
	}
	

}
