
package ChessGame;

/**
 * @author Alex Latunski
 *
 */
public class Rook implements Piece{
	//rook1.move(rook1.obstruction())
	//if(obstruction!=
	private Side side;
	private Side[][] board;
	private int row;
	private int column;
	private int value;

	/*
	 * Constructor sets side, localized board position Unique Identity
	 * 
	 */
	Rook(Side side, int col, int row) {
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
		this.value = 5;
		board[col][row]=side;
	}

	private boolean attack( Side mine) {
		if ( side != mine) {
			return true;
		} else
			return false;

	}

	public boolean move(int posCol, int posRow,  Side[][] mine) {
		int r;
		int c;
		if(row==posRow && column<posCol){
			for( c=column;c<=posCol;c++){
				if (mine[c][posRow] != Side.Empty && c<posCol ) {
					return false; 
				}
				else if (!attack(mine[c][posRow])){
					return false;
				}
			}

				row=posRow;
				column=posCol;
				return true;
			
		}	
		else if(row==posRow && column>posCol){
			for( c=column;c>=posCol ;c--){
				if (mine[c][posRow] != Side.Empty && c>posCol ) {
					return false; 
				}
				else if (!attack(mine[c][posRow])){
					return false;
				}
			}	
				row=posRow;
				column=posCol;
				return true;
			
		}
		else if(row>posRow && column==posCol){
			for( r=row;r>=posRow ;r--){
				if (mine[posCol][r] != Side.Empty && r>posRow ) {
					return false; 
				}
				else if (!attack(mine[posCol][r])){
					return false;
				} 
			}
	
				row=posRow;
				column=posCol;
				return true;
			
		}
		else if(row<posRow && column==posCol){
			for( r=row;r<=posRow ;r++){
				if (mine[posCol][r] != Side.Empty && r<posRow ) {
					return false; 
				}
				else if (!attack(mine[posCol][r])){
					return false;
				} 
			}

				row=posRow;
				column=posCol;
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

