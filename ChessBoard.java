package ChessGame;
import javax.swing.*;
import java.awt.*;

public class ChessBoard extends JFrame{
	
	public ChessBoard(){	
		AChessGame game;
		/* 
		 * DEMO TO SEE WINDOW PLACEMENT AND SIZE
		 * 
		 * setLayout(new BorderLayout());
		//place panels in WEST border to place buttons
		Panel buttonPanel = new Panel(new GridLayout(4,1,10,10));
		Button playGame = new Button("Play Game");
		//place in button Panel
		Button optionPage = new Button("Options");
		//place in button Panel
		Button exitToWindows = new Button("Exit to Desktop");
		//place in button Panel
		JLabel fill = new JLabel();
		buttonPanel.add(fill);
		buttonPanel.add(playGame);
		buttonPanel.add(optionPage);
		buttonPanel.add(exitToWindows);
		add (buttonPanel, BorderLayout.WEST);
		*/
		setLayout(new BorderLayout());
		
//		game=new AChessGame();
				
		JPanel[][]squares;
		Container C = getContentPane();
	    C.setLayout(new GridLayout(8,8, 2 , 2)); 
	    squares = new JPanel[8][8];
	     for(int rows=0; rows<8; rows++){
	        for(int cols=0; cols<8; cols++){
	            squares[cols][rows] = new JPanel();
	            if((rows+cols)%2 == 0)
	                squares[cols][rows].setBackground(Color.white);
	            else
	                squares[cols][rows].setBackground(Color.black);
	            //squares[i][j].addMouseListener(this);
	            C.add(squares[cols][rows]);
	        }
	    }
	    
		//make black vs white
	    System.out.println("Here");
	    game=new AChessGame();
	    Piece hold;
	    int test;
	    System.out.println();
	    for(int rows=0; rows<8; rows++){
	        for(int cols=0; cols<8; cols++){
	        	test=game.getPieceLocation(cols, rows);
	        	hold=game.getPiece(cols, rows);
	    		if(hold instanceof Knight){
	    			System.out.println("Here 3 "+ hold.getValue());
	    		}
	    		else if(hold instanceof Pawn){
	    			System.out.println("Here 1 "+ hold.getValue());
	    		}
	    		else if(hold instanceof Rook){
	    			System.out.println("Here 5 "+ hold.getValue());
	    		}
	    		else if(hold instanceof Bishop){
	    			System.out.println("Here 4 "+ hold.getValue());
	    		}
	    		else if(hold instanceof Queen){
	    			System.out.println("Here 9 "+ hold.getValue());
	    		}
	    		else if(hold instanceof King){
	    			System.out.println("Here K " + hold.getValue());
	    		}
	    		else{
	    			System.out.println(test +" " + hold.getValue());
	    		}
	       //    squares[cols][rows]= hold
	    
		
	        }
	    }
	}
	
}
