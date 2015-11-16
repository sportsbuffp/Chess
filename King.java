
package ChessGame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;

/**
 * @author Alex Latunski
 *
 */
public class King implements Piece{
	private Side side;
	private int row;
	private int column;
	private int value;
	private BufferedImage img;
	
	/*
	 * Constructor sets side, localized board position Unique Identity
	 * 
	 */
	King(Side side, int col, int row) {
		this.side = side;
		this.row = row;
		this.column = col;
		this.value = 10;
		img = null;
		if (side == Side.White) {
			try {
				img = ImageIO.read(new File("whiteking.png"));
			} catch (IOException e) {
				System.out.println("file not found");
			}
		} else {
			try {
				img = ImageIO.read(new File("blackking.png"));
			} catch (IOException e) {
				System.out.println("file not found");
			}
		}
	}

	private boolean attack(Side mine) {
		if (side != mine) {
			return true;
		} else
			return false;

	}

	public boolean move(int posCol, int posRow,  Side[][] mine) {
		if (moveTst(posCol,posRow,mine)){
			
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

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img, column*62, row*62, null);
	}

	@Override
	public BufferedImage getImg() {
		// TODO Auto-generated method stub
		return img;
	}

	@Override
	public boolean moveTst(int posCol, int posRow, Side[][] mine) {
		// 		if (attack( mine[posCol][posRow])){
		if((posRow - row)<= 1 && (posRow - row)>= -1 && (column-posCol) <= 1 && (column-posCol) >= -1 ) {

			return true;
		}
	
		return false;
	}
}
