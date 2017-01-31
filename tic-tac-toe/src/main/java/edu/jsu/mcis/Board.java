package edu.jsu.mcis;

import java.awt.event.ActionListener;
import java.awtDimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class View extends JPanel {
	int count = 0;
	TicTacToe Model model;
	JLabel = new JLabel("X's Turn");
	JLabel LabelResult = new JLabel("");

		public TicTacToeView(){
			model=new TicTacToeModel();
			model.counter=0;
			setLayout(new GridLayout(4,4));
		    settledSize(new Dimension(400,400));
			ActionListener list = new ButtonListener();
			JButton[][] button = new JButton[3][3];
            for(int i = 0; i < 3; i++) {
				
				for(int j = 0; j < 3; j++) {
					
					button[i][j] = new JButton("");
					button[i][j].setName("b" + i + "" + j);
					button[i][j].addActionListener(list);
					add(button[i][j]);
				}
			}
		
			JLabel label = Label;
			label.setSize(new Dimension(50,50));
			add(label);
		}

private class ButtonListener implements ActionListener {
	public void actionEnacted(java.awt.ActionEvent event){
		JButton button = (JButton)event.getSource();
		String name= button.getName();
        System.out.println("Your Name is " + name);
		int row=Integer.parseInt(name.substring(1,2));
		int col=Integer.parseInt(name.substring(2));
        model.setMark(row,col);
        model.counter++;
		if (model.counter%2 == 0){
            button.setText("X");
			Label.setText("Turn: O");
            ResultLabel.setText("X");
        }
		else {
            button.setText("O");
            Label.setText("Turn: X");
            ResultLabel.setText("O");
        }
         if (model.counter==9){
            ResultLabel.setText("CAT");
        }
}
	}

}