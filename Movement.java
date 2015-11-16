package ChessGame;

public class Movement {
	private int startX;
	

	private int endX;
	private int startY;
	private int endY;
	private Piece piece;
	/*
	 * Sets the values of movement
	 */
	public Movement(int x1,int y1,int x2,int y2,Piece a){
		startX = x1;
		startY = y1;
		endX = x2;
		endY = y2;
		piece=a;
	}
	/**
	 * @return the startX
	 */
	public int getStartX() {
		return startX;
	}

	/**
	 * @return the endX
	 */
	public int getEndX() {
		return endX;
	}

	/**
	 * @return the startY
	 */
	public int getStartY() {
		return startY;
	}

	/**
	 * @return the endY
	 */
	public int getEndY() {
		return endY;
	}
}
