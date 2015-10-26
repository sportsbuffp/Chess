
package ChessGame;

/**
 * @author Alex Latunski
 *
 */
public class Bishop implements Piece{
	//obstruction
	// if (obstruction&&side!=side.this)attack()
	private Side side;
	private Side[][] board;
	private int row;
	private int column;
	private int value;

	/*
	 * Constructor sets side, localized board position Unique Identity
	 * 
	 */
	Bishop(Side side, int col, int row) {
		this.side = side;
		// if (side == Side.White) {
		// board[1][0] = 3;
		// board[6][0] = 3;
		// } else if (side == Side.Black) {
		// board[1][7] = 3;
		// board[6][7] = 3;
		// }
		board = new Side[8][8];
		this.row = row;
		this.column = col;
		this.value = 4;
		board[col][row]=side;
	}

	private boolean attack( Side mine) {
		if (side != mine) {
			return true;

		} else
			return false;

	}
	
	public boolean move(int posCol, int posRow, Side[][] mine) {
		int r = 0;
		int c = 0;

	//if the iteration number is the same checks value otherwise, NEXT!
		if (row < posRow && column < posCol && ((posRow - row) == (posCol - column))) {
			for (r = row; r <= posRow ; r++) {
				for (c = column; c <= posCol; c++) {
					if((r - row) == (c - column)){
						if (mine[c][r] != Side.Empty && r < posRow && c < posCol) {
							return false;
						} else if (!attack(mine[c][r])) {
							return false;
						}
					}
				}
			}

				row = posRow;
				column = posCol;
				return true;
			
		}else if (row < posRow && column > posCol && ((posRow - row) == (column-posCol ))) {
			for (r = row; r <= posRow ; r++) {
				for (c = column; c >= posCol; c--) {
					if((r - row) == (column - c)){
						if (mine[c][r] != Side.Empty && r < posRow && c > posCol) {
							return false;
						} else if (!attack(mine[c][r])) {
							return false;
						}
					}
				}
			}

				row = posRow;
				column = posCol;
				return true;
			
		}else if (row > posRow && column < posCol && ((row-posRow ) == (posCol - column))) {
			for (r = row; r >= posRow ; r--) {
				for (c = column; c <= posCol; c++) {
					if((row - r) == (c - column)){
						if (mine[c][r] != Side.Empty && r > posRow && c < posCol) {
							return false;
						} else if (!attack(mine[c][r])) {
							return false;
						}
					}
				}
			}
			row = posRow;
			column = posCol;
			return true;
		}else if (row > posRow && column > posCol && ((row-posRow ) == (column-posCol ))) {
				for (r = row; r >= posRow ; r--) {
					for (c = column; c >= posCol; c--) {
						if((row - r) == (column - c)){
							if (mine[c][r] != Side.Empty && r > posRow && c > posCol) {
								return false;
							} else if (!attack(mine[c][r])) {
								return false;
							}
						}
					}
				}

				row = posRow;
				column = posCol;
				return true;
			
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
