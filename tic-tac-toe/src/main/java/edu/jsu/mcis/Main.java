package edu.jsu.mcis;

import java.awt.Point;
import java.util.Scanner;

public class Main {
    private static final Scanner keyboard = new Scanner(System.in);

    private static Point getUserMove() {
		System.out.print("Enter your move: ");
		int col = keyboard.nextInt();
		int row = keyboard.nextInt();
        return new Point(row, col);
    }
    
    private static void controlModel(TicTacToeModel model) {
		while running {
			Point getMove = getUserMove();
			running = model.setMark(getMove.x, getMove.y);
			if !running {
				System.out.println("Can not do (" + getMove.x + ","+ getMove.y +")")
			}
		}
    }
    
    private static void viewModel(TicTacToeModel model) {
		System.out.println("Board " + "\n" + model + "\n");
		
    }

	public static void main(String[] args) {
        TicTacToeModel model = new TicTacToeModel();
        TicTacToeModel.Result outcome = TicTacToeModel.Result.NADA;
		while(outcome == TicTacToeModel.Result.NADA){
			String course = (model.TurnX())?;
			viewModel(model);
			controlModel(model);
			result = model.getResult();
		}
		String over = "CAT Wins!";
		if (result == TicTacToeModel.Result.XWin) over = "X Wins"
		else if (outcome == TicTacToeModel.Result.OWin) over = "O Wins"
		System.out.println(over);
	}
}














