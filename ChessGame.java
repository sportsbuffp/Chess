package ChessGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import ChessGame.ChessGame.ExitToWindows;
import ChessGame.ChessGame.Options;
import ChessGame.ChessGame.enterGame;

public class ChessGame  {
	
		private static JFrame m;
		private  JFrame menu;
		 Button playGame;
		 Button optionPage;
		 Button exitToWindows;
		
		private ChessGame(){
			m=new JFrame();
			menu=new JFrame();
			menu.setTitle("Chess");
			menu.setMinimumSize(new Dimension(500,500));;
			menu.setLocation(400,250);
			menu.setVisible(true);
			menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			menu.setLayout(new BorderLayout());
			//place panels in WEST border to place buttons
			Panel buttonPanel = new Panel(new GridLayout(4,1,10,10));
			playGame = new Button("Play Game");
			//place in button Panel
			optionPage = new Button("Options");
			//place in button Panel
			exitToWindows = new Button("Exit to Desktop");
			//place in button Panel
			JLabel fill = new JLabel();
			fill.setForeground(Color.black);
			fill.setBackground(Color.black);
			fill.setOpaque(true);
			buttonPanel.add(fill);
			buttonPanel.add(playGame);
			buttonPanel.add(optionPage);
			buttonPanel.add(exitToWindows);
			menu.add (buttonPanel, BorderLayout.CENTER);
			playGame.addActionListener(new enterGame());
			optionPage.addActionListener(new Options());
			exitToWindows.addActionListener(new ExitToWindows());
			menu.pack();
		}
	
	public static void main(String[] args) {
		
		ChessGame opt =new ChessGame();

	}
	
	public class enterGame implements ActionListener{
		// TODO Auto-generated method stub
		public void actionPerformed(ActionEvent playGameList){
			menu.dispose();
			m.setName("Chess");
			m.setMinimumSize(new Dimension(498,498));
			m.setLocation(400,200);
			m.setVisible(true);
			m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			m.add(new ChessBoard());
		}
	}
	public class Options implements ActionListener{
		// TODO Auto-generated method stub
		public void actionPerformed(ActionEvent playGameList){
			JOptionPane.showMessageDialog(null, "Options Page still not yet released at this time");
		}
	}
	public class ExitToWindows implements ActionListener{
		// TODO Auto-generated method stub
		public void actionPerformed(ActionEvent playGameList){
			System.exit(0);
		}
	}

}
