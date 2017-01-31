import java.awt.GridLayout;
import java.awt.LayoutManager;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

	 

	public class TicTacToeBoard extends JFrame

	{
	    private static LayoutManager manager = new GridLayout(3,3);
	     
	    TicTacToeBoard()
	    {
	        setLayout(manager);
	         
	        for (int i = 0; i < 3; i ++)
	            for (int k = 0; k < 3; k ++)
	                add(new JLabel(randomIcon()));
	    }

	 

	    private ImageIcon randomIcon() {

	        double r = Math.random();
	        ImageIcon icon;
	        if (r - 0.5 < 0)
	            icon = new ImageIcon("x.gif");
	        else
	            icon = new ImageIcon("o.gif");
	        return icon;

	    }

	    public static void main(String[] args)
	    {
	        TicTacToeBoard frame = new TicTacToeBoard();
	        frame.setTitle("Tic-Tac-Toe!");

	        frame.pack();

	        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	        frame.setLocationRelativeTo(null);

	        frame.setVisible(true);

	    }
	}