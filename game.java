package reversi;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class game extends JPanel{

	public game() {
		
		frameManager.getguiFrame1();
		frameManager.getguiFrame2();
		
	    
	}
	

	private static Object createMenu() {
		// TODO Auto-generated method stub
		return null;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new game();
	}
	

}
