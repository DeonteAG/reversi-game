package reversi;

import javax.swing.JFrame;

public class frameManager {

	    static gameBoard guiFrame1;
	    static gameBoard2 guiFrame2;

	    public static gameBoard getguiFrame1()
	    {
	        if(guiFrame1 == null)
	            guiFrame1 = new gameBoard();
	        return guiFrame1;
	    }

	    public static gameBoard2 getguiFrame2()
	    {
	        if(guiFrame2 == null)
	            guiFrame2 = new gameBoard2();
	        return guiFrame2;
	    }

	    public class Frame1 extends JFrame
	    {

	    }

	    public class Frame2 extends JFrame
	    {

	    }
}
