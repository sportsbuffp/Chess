/**
 * The knight class moves in a L shape in all directions.
 * primary variables set at creation 
 */
package ChessGame;

/**
 * @author Alex Latunski
 *
 */
public class Knight implements Piece{
	private Side side;
	private int row;
	private int column;
	private int value;

	/*
	 * Constructor sets side, localized board position Unique Identity
	 * 
	 */
	Knight(Side side, int col, int row) {
		this.side = side;
		// if (side == Side.White) {
		// board[1][0] = 3;
		// board[6][0] = 3;
		// } else if (side == Side.Black) {
		// board[1][7] = 3;
		// board[6][7] = 3;
		// }
		this.row = row;
		this.column = col;
		this.value = 3;
	}

	private boolean attack( Side mine) {
		if ( side != mine) {
			return true;
		} else
			return false;

	}

	public boolean move(int posCol,int posRow, Side[][] mine) {
		if (attack( mine[posCol][posRow])) {
			if ((row - posRow) == 2 || (row - posRow) == -2) {
				if ((column - posCol) == 1 || (column - posCol) == -1) {
					row=posRow;
					column=posCol;
					
					return true;
				}
			} else if ((row - posRow) == 1 || (row - posRow) == -1) {
				if ((column - posCol) == 2 || (column - posCol) == -2) {
					row=posRow;
					column=posCol;
					
					return true;
				}
			}
		}
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
