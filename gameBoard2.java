package reversi;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gameBoard2 extends JPanel implements ActionListener{
	
	gameBoard gameBoard1= new gameBoard();
	

	public gameBoard2(){
		
		JFrame guiFrame2 = new JFrame();
		guiFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton label1 = new JButton("Greedy AI (play white)");
		label1.setFont(new Font("Serif", Font.BOLD, 20));
		
		
		JLabel label2 = new JLabel("Black player - click place to put piece");
		label2.setFont(new Font("Serif", Font.BOLD, 14));
	
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		panel1.setLayout( new FlowLayout() );
		panel2.setLayout( new FlowLayout() );
		panel3.setLayout( new FlowLayout() );
		
		int[] squareArray;
		squareArray = new int[64];
		
		for(int i = 0; i<64; i++) {
			
			JButton btn = new JButton(" " + squareArray[i]);
			btn.setBackground(Color.GREEN);
			btn.setForeground(Color.GREEN);
			btn.setPreferredSize(new Dimension(35,35));
			
			panel2.add(btn);
		
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn.setBackground(Color.BLACK);
				btn.setForeground(Color.BLACK);
		    }
		});
		
			
		}
		
		
		
		
		
		guiFrame2.add(panel1, BorderLayout.PAGE_START);
		guiFrame2.add(panel2, BorderLayout.CENTER);
		guiFrame2.add(panel3, BorderLayout.PAGE_END);
		
		guiFrame2.add(label2, BorderLayout.PAGE_START);
		guiFrame2.add(label1, BorderLayout.PAGE_END);

		guiFrame2.setLocationRelativeTo(null);
		guiFrame2.setTitle("Reversi - white player"); // Set a caption/title bar content for the frame
		guiFrame2.setSize(350, 430);
		guiFrame2.setResizable(false);
		
		
		guiFrame2.setVisible(true);

	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}

