package ChessGame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChessGame extends JFrame{
	private Button playGame, optionPage, exitToWindows;
	private JLabel fill;
	public ChessGame(){
		
		//icon for fill jlabel
		
		
		setLayout(new BorderLayout());
		//place panels in WEST border to place buttons
		Panel buttonPanel = new Panel(new GridLayout(4,1,10,10));
		Button playGame = new Button("Play Game");
		//place in button Panel
		Button optionPage = new Button("Options");
		//place in button Panel
		Button exitToWindows = new Button("Exit to Desktop");
		//place in button Panel
		JLabel fill = new JLabel();
		fill.setForeground(Color.black);
		fill.setBackground(Color.black);
		fill.setOpaque(true);
		buttonPanel.add(fill);
		buttonPanel.add(playGame);
		buttonPanel.add(optionPage);
		buttonPanel.add(exitToWindows);
		add (buttonPanel, BorderLayout.CENTER);	
		playGame.addActionListener(new enterGame());
		optionPage.addActionListener(new Options());
		exitToWindows.addActionListener(new ExitToWindows());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//basic gui for menu, will upgrade in future releases
		
		ChessGame menu = new ChessGame();
		menu.setTitle("Chess");
		menu.setSize(1000,1000);
		menu.setLocation(400,250);
		menu.setVisible(true);
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*ChessBoard board = new ChessBoard();
		board.setTitle("Chess1");
		board.setSize(1000,1000);
		board.setLocation(420,270);
		board.setVisible(true);
		board.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//make GUI for chess board
		//click panel, light up possible moves
		 
		 */
	}

	public class enterGame implements ActionListener{
		// TODO Auto-generated method stub
		public void actionPerformed(ActionEvent playGameList){
			ChessBoard board = new ChessBoard();
			board.setTitle("Chess");
			board.setSize(1000,1000);
			board.setLocation(420,270);
			board.setVisible(true);
			board.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
	}
	public class Options implements ActionListener{
		// TODO Auto-generated method stub
		public void actionPerformed(ActionEvent playGameList){
			JOptionPane.showMessageDialog(null, "Options Page not yet Released at this time");
		}
	}
	public class ExitToWindows implements ActionListener{
		// TODO Auto-generated method stub
		public void actionPerformed(ActionEvent playGameList){
			System.exit(0);
		}
	}
}
