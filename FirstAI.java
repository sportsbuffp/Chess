package ChessGame;

import java.util.ArrayList;
import java.util.Random;

public class FirstAI implements AI {
	private ArrayList<Movement> possible;
	
	public FirstAI(){
		possible=new ArrayList<Movement>();
	}
	
	@Override
	public Movement makeMove(Piece[][] brd,Side[][] n) {
		// TODO Auto-generated method stub
		Game bestBoard;
		Random generator = new Random();
		bestBoard=new Game(brd,n);
//Loops through the board to attempt to find all my pieces
		for(int c=0;c<8;c++){
			for (int r=0;r<8;r++){
				if(brd[c][r]!=null && brd[c][r].getSide()==Side.Black){
				//Found a piece, can it make a valid move?
				//must..test..everything!
				if(brd[c][r].getValue()!=1){
					for (int j=0;j<8;j++){
						for(int k=0;k<8;k++){
							if (bestBoard.getPiece(c,r).moveTst(j, k, n)){
								possible.add(new Movement(brd[c][r].getColumn(),brd[c][r].getRow(),j,k,brd[c][r]));
							//	bestBoard.test(bestBoard.getBoard());
							}
						}
					}
				}
//				else{
//					for (int j=0;j<3;j++){
//						if(j==1 && r<7 ){if(bestBoard.getPiece(c,r).moveTst(c+j, r+1, n)){
//							possible.add(new Movement(brd[c][r].getColumn(),brd[c][r].getRow(),c+j,r+1,brd[c][r]));
//						}}
//						if(j==1 && r-1>1 && bestBoard.getPiece(c,r).moveTst(c+j, r-1, n)){
//							possible.add(new Movement(brd[c][r].getColumn(),brd[c][r].getRow(),c+j,r-1,brd[c][r]));
//						}
//						else if(bestBoard.getPiece(c,r).moveTst(c+j, r, n)){
//							possible.add(new Movement(brd[c][r].getColumn(),brd[c][r].getRow(),c+j,r,brd[c][r]));
//						}
//					}
//				}
				}
			}
		}
		int index = generator.nextInt(possible.size());
		Movement choice = possible.get(index);
		//brd[choice.getStartX()][choice.getStartY()].move(choice.getEndX(),	choice.getEndY(), n);
		//bestBoard.test(brd);
		return choice;
	}
}
