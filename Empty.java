package ChessGame;
/**
 * @author Alex Latunski
 *
 */
public class Empty implements Piece{
	private Side side= Side.Empty;
	private int row;
	private int column;
	private int value = 0;

	/*
	 * Constructor sets side, localized board position Unique Identity
	 * 
	 */
	Empty( int col, int row) {
		this.row = row;
		this.column = col;
	}


	public boolean move(int posCol, int posRow,  Side[][] mine) {
		return false;
	}

	/**
	 * @return the side
	 */
	public Side getSide() {
		return side;
	}
	
	/**
	 * @return the row
	 */
	public int getRow() {
		return row;
	}

	/**
	 * @return the column
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
}


