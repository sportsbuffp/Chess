package ChessGame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Options1 extends JFrame{
		JRadioButton Halloween = new JRadioButton("Orange and Black");
		JRadioButton Christmas = new JRadioButton("Red and Green");
		JRadioButton Girlie = new JRadioButton("Pink and Purple");
		JRadioButton Classic = new JRadioButton("Classic");
		JButton Return = new JButton("Menu");
	public Options1(){
		setLayout(new FlowLayout());
		
		//JRadioButton Halloween = new JRadioButton("Orange and Black");
		Halloween.setMnemonic(KeyEvent.VK_H);
		Halloween.setSelected(false);
		Halloween.addActionListener(new SkinsHandler());
		//JRadioButton Christmas = new JRadioButton("Red and Green");
		Christmas.setMnemonic(KeyEvent.VK_C);
		Christmas.setSelected(false);
		Christmas.addActionListener(new SkinsHandler());
		//JRadioButton Girlie = new JRadioButton("Pink and Purple");
		Girlie.setMnemonic(KeyEvent.VK_G);
		Girlie.setSelected(false);
		Girlie.addActionListener(new SkinsHandler());
		//JRadioButton Classic = new JRadioButton("Classic");
		Classic.setMnemonic(KeyEvent.VK_B);
		Classic.setSelected(true);
		Classic.addActionListener(new SkinsHandler());
		Return.addActionListener(new ReturnHandler());
		ButtonGroup skin = new ButtonGroup();
		skin.add(Halloween);
		skin.add(Christmas);
		skin.add(Girlie);
		skin.add(Classic);
		add(Christmas);
		add(Girlie);
		add(Halloween);		
		add(Classic);
		add(Return);
	}
	class SkinsHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(Halloween.isSelected()){
				ChessBoardH board = new ChessBoardH();
			}
			if(Christmas.isSelected()){
				ChessBoardC board = new ChessBoardC();
			}
			if(Girlie.isSelected()){
				chessBoardG board = new chessBoardG();
			}
			if(Classic.isSelected()){
				ChessBoard board = new ChessBoard();
			}
		}
	}
	class ReturnHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
		}
	}
}

