package ChessGame;

public interface Piece {
	public boolean move(int posCol, int posRow,  Side[][] mine);
	
	public Side getSide();

	public int getRow();
	
	public int getColumn();

	public int getValue();
}
