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

public class gameBoard extends JPanel implements ActionListener{
	

	public gameBoard(){
		
			
		
		
		JFrame guiFrame1 = new JFrame();
		guiFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton label1 = new JButton("Greedy AI (play white)");
		label1.setFont(new Font("Serif", Font.BOLD, 20));
		
		
		JLabel label2 = new JLabel("White player - click place to put piece");
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
				btn.setBackground(Color.WHITE);
				btn.setForeground(Color.WHITE);
		    }
		});
		
			
		}
		
		guiFrame1.add(panel1, BorderLayout.PAGE_START);
		guiFrame1.add(panel2, BorderLayout.CENTER);
		guiFrame1.add(panel3, BorderLayout.PAGE_END);
		
		guiFrame1.add(label2, BorderLayout.PAGE_START);
		guiFrame1.add(label1, BorderLayout.PAGE_END);
		guiFrame1.setLocationRelativeTo(null);
		guiFrame1.setTitle("Reversi - white player"); // Set a caption/title bar content for the frame
		guiFrame1.setSize(350, 430);
		guiFrame1.setResizable(false);
		
		
		guiFrame1.setVisible(true);
		
	
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}

