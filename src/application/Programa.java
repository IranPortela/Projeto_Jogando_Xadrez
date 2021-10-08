package application;

import java.util.Locale;

import boardgame.Board;
import boardgame.Position;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Position pos = new Position(6, 8);
		System.out.println(pos);
		pos.setValues(10, 20);
		System.out.println(pos);
		
		Board board = new Board(8, 8);
		
		
		
		
		
	}

}
